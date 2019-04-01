package cn.vo.controller.hans;


import cn.vo.backstage.Utils.ListResult;
import cn.vo.backstage.Utils.PageUtils;
import cn.vo.controller.sift.SiftCount;
import cn.vo.dao.hans.SiftAddressMapper;
import cn.vo.pojo.User;
import cn.vo.pojo.entity.HansSiftAddress;
import cn.vo.pojo.entity.TestHans;
import cn.vo.pojo.entity.TestPaper;
import cn.vo.pojo.entity.XiaodianAddress;
import cn.vo.service.IQuestionService;
import cn.vo.service.ITestPaperService;
import cn.vo.service.IUserService;
import cn.vo.service.IXiaodianAddressService;
import cn.vo.service.hans.ITestHansService;
import cn.vo.util.SorceUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("testPaper")
public class TestPaperController {

    @Autowired
    private IQuestionService questionService;


    @Autowired
    private ITestPaperService testPaperService;

    @Autowired
    private IXiaodianAddressService xiaodianAddressService;

    @Autowired
    private IUserService iUserService;

    @Autowired
    private SiftAddressMapper siftAddressMapper;

    @Autowired
    private ITestHansService testHansService;

    @GetMapping("list")
    public  String  list(String close, Model model,HttpServletRequest request){
        HttpSession session=request.getSession();
        User user= (User) session.getAttribute("USER");
        model.addAttribute("user",user);
        model.addAttribute("close",close);
        return "views/hans/testPaperList";
    }
    @GetMapping("oldList")
    public  String  oldList(String close, Model model,HttpServletRequest request){
        HttpSession session=request.getSession();
        User user= (User) session.getAttribute("USER");
        model.addAttribute("user",user);
        model.addAttribute("close",close);
        return "views/hans/oldPaperList";
    }

    //增加类型 区分苏宁小店 常规小店等
    @GetMapping("/listJson")
    @ResponseBody
    public ListResult<TestPaper> listJson(HttpServletRequest request, String name,String qcheckstatus,
                                          String checkstatus,Integer type, Integer page, Integer limit){
        Map map=new HashMap<>();
        map.put("name", name);
        map.put("type", type);
        map.put("qcheckstatus", qcheckstatus);
        map.put("checkstatus", checkstatus);
        map.put("index", PageUtils.getPageIndex(page, limit));
        map.put("pageSize", PageUtils.getPageSize(page, limit));
        HttpSession session=request.getSession();
        User user=(User) session.getAttribute("USER");
        List<TestPaper> list=null;
        if("0".equals(user.getScpcqx())){
            map.put("code", user.getUsername());
            list=testPaperService.getMendianQuery(map);
        }
        if("2".equals(user.getScpcqx())){
            map.put("company", user.getUsername());
            list=testPaperService.getCompanyQuery(map);
        }
        if("5".equals(user.getScpcqx()) || "3".equals(user.getScpcqx()) ){
            list=testPaperService.getListQuery(map);
        }
        ListResult<TestPaper> result=new ListResult<>();
        result.setCode("0");
        result.setCount(Long.valueOf(testPaperService.count()));
        result.setMsg("");
        result.setData(list);
        return result;
    }
    @PostMapping("save")
    public String save(@ModelAttribute TestPaper testPaper,@ModelAttribute TestHans testHans){
        try {
            saveTestPaper(testPaper);
            testPaper.setCheckstatus("正在审核");
            if (testPaper.getType()==1){
                testPaperService.save(FractionUtil.getFraction(testPaper,testHans));
                testHans.setTestid(testPaper.getId());
                testHansService.save(testHans);
            }else if (testPaper.getType()==2){
                testPaperService.save(SorceUtils.getFraction(testPaper));
            }else if(testPaper.getType()==3){
                testPaperService.save(SiftCount.getFraction(testPaper));
            }

        }catch (Exception e){
            e.printStackTrace();
            return "redirect:/testPaper/list?close="+"error";
        }
        return  result(testPaper);
    }

    @ResponseBody
    @GetMapping("delete")
    public String delete(Integer id){
        try{
            testPaperService.deleteId(id);
        }catch (Exception e){
            e.printStackTrace();
            return  "error";
        }
        return "ok";
    }

    @GetMapping("edit")
    public String edit(Integer id, Model model,HttpServletRequest request){
        TestPaper testPaper=testPaperService.getById(id);
        TestHans testHans=testHansService.getId(id);
        HttpSession session=request.getSession();
        User user= (User) session.getAttribute("USER");
        model.addAttribute("scpcqx",user.getScpcqx());
        model.addAttribute("testPaper",testPaper);
        model.addAttribute("testHans",testHans);
        return editResult(testPaper);

    }
    public String editResult(TestPaper testPaper){
        String result="";
        if (testPaper.getType()==1){
            result= "views/hans/questionetor";
        }else if(testPaper.getType()==2){
            result="views/routine/routEditDeial";
        }else if(testPaper.getType()==3){
            result="views/sift/siftEdit";
        }else{
            result="views/hans/questionetor";
        }
        return result;
    }

    @GetMapping("deial")
    public String deial(Integer id, Model model){
        TestPaper testPaper=testPaperService.getById(id);
        model.addAttribute("testPaper",testPaper);
        model.addAttribute("deialName","查看页面");
         if (testPaper.getType()==2){
             return "views/routine/routEditDeial";
        }else{
            return "views/hans/questionetor";
        }

    }

    @GetMapping("add")
    public String add(){
        return "views/hans/questionAdd";
    }

    @PostMapping("update")
    public String update(@ModelAttribute TestPaper testPaper,@ModelAttribute TestHans testHans,HttpServletRequest request){
        try{


            //testPaper.setTrough1(FileUpload.uploadFile(trough1File,trough1File.getName()));

            TestPaper  testPaperMendian=testPaperService.getById(testPaper.getId());

            if(testPaper.getCompanyId()==null){
                testPaper.setCompanyId(testPaperMendian.getCompanyId());
            }
            if(testPaper.getType()==null){
                testPaper.setType(testPaperMendian.getType());
            }
            saveTestPaper(testPaper);
            HttpSession session=request.getSession();
            User user=(User) session.getAttribute("USER");

            if("开".equals(testPaperMendian.getAppeal())){
                if("0".equals(user.getScpcqx())){
                    testPaperMendian.setQcheck(testPaper.getQcheck());
                    testPaperMendian.setTrough1(testPaper.getTrough1());
                    testPaperMendian.setQcheckstatus("已申诉");
                    testPaperService.updateId(testPaperMendian);
                }

                if("3".equals(user.getScpcqx())){
                    testPaperMendian.setQchecksn(testPaper.getQchecksn());
                    testPaperMendian.setQcheckstatus("已批复");
                    testPaperService.updateId(testPaperMendian);
                }
            }
            if("5".equals(user.getScpcqx())){
                if (testPaper.getType()==1){
                    testPaperService.updateId(FractionUtil.getFraction(testPaper,testHans));
                    testHans.setTestid(testPaper.getId());
                    testHansService.save(testHans);
                }else if (testPaper.getType()==2){
                    testPaperService.updateId(SorceUtils.getFraction(testPaper));
                }else if(testPaper.getType()==3){
                    testPaperService.updateId(SiftCount.getFraction(testPaper));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return "redirect:/testPaper/list?close="+"error";
        }
        return  result(testPaper);
    }

    @GetMapping("appealOpen")
    @ResponseBody
    public String appealOpen(Integer type){
        Map map=new HashMap();
        map.put("appeal","开");
        map.put("type",type);
        testPaperService.updateAppeal(map);
        return  "ok";
    }
    @GetMapping("appealClose")
    @ResponseBody
    public String appealClose(Integer type){
        Map map=new HashMap();
        map.put("appeal","关");
        map.put("type",type);
        testPaperService.updateAppeal(map);
        return  "ok";
    }

    @GetMapping("batchCheck")
    @ResponseBody
    public String batchCheck(Integer type){
        Map map=new HashMap();
        map.put("type",type);
        map.put("checkStatus","审核通过");
        testPaperService.batchCheck(map);
        return  "ok";
    }

    public TestPaper saveTestPaper(TestPaper testPaper){
        if(testPaper.getType()==3){
            HansSiftAddress hansSiftAddress=siftAddressMapper.findOne(Long.valueOf(testPaper.getCompanyId()));
            testPaper.setName(hansSiftAddress.getName());
            testPaper.setCode(hansSiftAddress.getCode());
            testPaper.setCompany(hansSiftAddress.getCompany());
            testPaper.setAddress(hansSiftAddress.getAddress());
            testPaper.setPianqu(hansSiftAddress.getPianqu());
            testPaper.setCity(hansSiftAddress.getCity());
            testPaper.setDaqu(hansSiftAddress.getDaqu());
        }else{
            XiaodianAddress xiaodianAddress=xiaodianAddressService.getById(Long.valueOf(testPaper.getCompanyId()));
            testPaper.setName(xiaodianAddress.getName());
            testPaper.setCode(xiaodianAddress.getCode());
            testPaper.setCompany(xiaodianAddress.getCompany());
            testPaper.setAddress(xiaodianAddress.getAddress());
            testPaper.setPianqu(xiaodianAddress.getPianqu());
            testPaper.setCity(xiaodianAddress.getCity());
            testPaper.setDaqu(xiaodianAddress.getDaqu());
        }
        return testPaper;
    }




    @GetMapping("seeImg")
    public String seeImg(String fileName,Model model){
        StringBuffer imgUrl=new StringBuffer();
        String[] imgList=fileName.split(",");
        if (imgList.length>0){
            for (int i=0;i<imgList.length;i++){
                imgUrl.append("/Path/"+imgList[i]+",");
            }
        }
    System.out.println(imgList);
    System.out.println(imgUrl);
        model.addAttribute("fileName",imgUrl);
        return "views/hans/seeImg";
    }


    public String result(TestPaper testPaper){
        String result="";
        if (testPaper.getType()==1){
            result=  "redirect:/testPaper/list?close="+"ok";
        }else if(testPaper.getType()==2){
            result="redirect:/rout/routList?close=ok";
        }else if(testPaper.getType()==3){
            result=  "redirect:/sift/siftList?close="+"ok";
        }else{
            result=  "redirect:/sift/siftList?close="+"ok";
        }
        return result;
    }



}
