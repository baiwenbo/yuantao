package cn.vo.controller.hans;


import cn.vo.Utils.FileUpload;
import cn.vo.backstage.Utils.ListResult;
import cn.vo.backstage.Utils.PageUtils;
import cn.vo.pojo.User;
import cn.vo.pojo.entity.TestPaper;
import cn.vo.pojo.entity.XiaodianAddress;
import cn.vo.service.IQuestionService;
import cn.vo.service.ITestPaperService;
import cn.vo.service.IUserService;
import cn.vo.service.IXiaodianAddressService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


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


    @GetMapping("list")
    public  String  list(String close, Model model){
        model.addAttribute("close",close);
        return "views/hans/testPaperList";
    }

    @GetMapping("appealList")
    public  String  appealList(String close, Model model){
        model.addAttribute("close",close);
        return "views/hans/testAppealPaperList";
    }

    @GetMapping("/listJson")
    @ResponseBody
    public ListResult<TestPaper> listJson(HttpServletRequest request, String name,String qcheckstatus,
                                          String checkstatus, Integer page, Integer limit){
        Map map=new HashMap<>();
        map.put("name", name);
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
    public String save(@ModelAttribute TestPaper testPaper){
        try {

            saveTestPaper(testPaper);
            testPaper.setCheckstatus("正在审核");
            testPaperService.save(FractionUtil.getFraction(testPaper));
        }catch (Exception e){
            e.printStackTrace();
            return "redirect:/testPaper/list?close="+"error";
        }
        return  "redirect:/testPaper/list?close="+"ok";
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
    public String edit(Integer id, Model model){

        TestPaper testPaper=testPaperService.getById(id);
        model.addAttribute("testPaper",testPaper);
        return "views/hans/questionetor";
    }
    @GetMapping("deial")
    public String deial(Integer id, Model model){
        TestPaper testPaper=testPaperService.getById(id);
        model.addAttribute("testPaper",testPaper);
        model.addAttribute("deialName","查看页面");
        return "views/hans/questionetor";
    }

    @GetMapping("add")
    public String add(){
        return "views/hans/questionAdd";
    }

    @PostMapping("update")
    public String update(@ModelAttribute TestPaper testPaper,HttpServletRequest request,
                         @RequestParam("trough1File") MultipartFile trough1File){
        try{


            testPaper.setTrough1(FileUpload.uploadFile(trough1File,trough1File.getName()));

            TestPaper  testPaperMendian=testPaperService.getById(testPaper.getId());

            saveTestPaper(testPaper);
            HttpSession session=request.getSession();
            User user=(User) session.getAttribute("USER");

            if("开".equals(testPaperMendian.getAppeal())){
                if("0".equals(user.getScpcqx())){
                    testPaperMendian.setQcheck(testPaper.getQcheck());
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
                testPaperService.updateId(FractionUtil.getFraction(testPaper));
            }
        }catch (Exception e){
            e.printStackTrace();
            return "redirect:/testPaper/list?close="+"error";
        }
        return  "redirect:/testPaper/list?close="+"ok";
    }

    @GetMapping("appealOpen")
    @ResponseBody
    public String appealOpen(){
        Map map=new HashMap();
        map.put("appeal","开");
        testPaperService.updateAppeal(map);
        return  "ok";
    }
    @GetMapping("appealClose")
    @ResponseBody
    public String appealClose(){
        Map map=new HashMap();
        map.put("appeal","关");
        testPaperService.updateAppeal(map);
        return  "ok";
    }

    @GetMapping("batchCheck")
    @ResponseBody
    public String batchCheck(){
        Map map=new HashMap();
        map.put("checkStatus","审核通过");
        testPaperService.batchCheck(map);
        return  "ok";
    }

    public TestPaper saveTestPaper(TestPaper testPaper){
        XiaodianAddress xiaodianAddress=xiaodianAddressService.getById(Long.valueOf(testPaper.getCompanyId()));
        testPaper.setName(xiaodianAddress.getName());
        testPaper.setCode(xiaodianAddress.getCode());
        testPaper.setCompany(xiaodianAddress.getCompany());
        testPaper.setAddress(xiaodianAddress.getAddress());
        testPaper.setPianqu(xiaodianAddress.getPianqu());
        testPaper.setCity(xiaodianAddress.getCity());
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





}
