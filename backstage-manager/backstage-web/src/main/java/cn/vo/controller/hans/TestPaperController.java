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
        if("5".equals(user.getScpcqx()) ||" 3".equals(user.getScpcqx()) ){
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
    public String save(@ModelAttribute TestPaper testPaper, @RequestParam("topic1Fourfile") MultipartFile topic1Fourfile, @RequestParam("topic2Fourfile") MultipartFile topic2Fourfile,
                       @RequestParam("topic3Fourfile") MultipartFile topic3Fourfile, @RequestParam("topic4Fourfile") MultipartFile topic4Fourfile, @RequestParam("topic5Fourfile") MultipartFile topic5Fourfile,
                       @RequestParam("topic6Fourfile") MultipartFile topic6Fourfile, @RequestParam("topic7Fourfile") MultipartFile topic7Fourfile, @RequestParam("topic8Fourfile") MultipartFile topic8Fourfile,
                       @RequestParam("topic9Fourfile") MultipartFile topic9Fourfile, @RequestParam("topic10Fourfile") MultipartFile topic10Fourfile, @RequestParam("topic11Fourfile") MultipartFile topic11Fourfile,
                       @RequestParam("topic12Fourfile") MultipartFile topic12Fourfile, @RequestParam("topic13Fourfile") MultipartFile topic13Fourfile, @RequestParam("topic14Fourfile") MultipartFile topic14Fourfile,
                       @RequestParam("topic15Fourfile") MultipartFile topic15Fourfile, @RequestParam("topic16Fourfile") MultipartFile topic16Fourfile, @RequestParam("topic17Fourfile") MultipartFile topic17Fourfile,
                       @RequestParam("topic18Fourfile") MultipartFile topic18Fourfile, @RequestParam("topic19Fourfile") MultipartFile topic19Fourfile,
                       @RequestParam("topic20Fourfile") MultipartFile topic20Fourfile, @RequestParam("topic21Fourfile") MultipartFile topic21Fourfile, @RequestParam("topic22Fourfile") MultipartFile topic22Fourfile,
                       @RequestParam("topic23Fourfile") MultipartFile topic23Fourfile, @RequestParam("topic24Fourfile") MultipartFile topic24Fourfile, @RequestParam("topic25Fourfile") MultipartFile topic25Fourfile,
                       @RequestParam("topic26Fourfile") MultipartFile topic26Fourfile, @RequestParam("topic27Fourfile") MultipartFile topic27Fourfile, @RequestParam("topic28Fourfile") MultipartFile topic28Fourfile,
                       @RequestParam("topic29Fourfile") MultipartFile topic29Fourfile, @RequestParam("topic30Fourfile") MultipartFile topic30Fourfile, @RequestParam("topic31Fourfile") MultipartFile topic31Fourfile,
                       @RequestParam("topic32Fourfile") MultipartFile topic32Fourfile, @RequestParam("topic33Fourfile") MultipartFile topic33Fourfile, @RequestParam("topic34Fourfile") MultipartFile topic34Fourfile,
                       @RequestParam("topic35Fourfile") MultipartFile topic35Fourfile, @RequestParam("topic36Fourfile") MultipartFile topic36Fourfile, @RequestParam("topic37Fourfile") MultipartFile topic37Fourfile,
                       @RequestParam("topic38Fourfile") MultipartFile topic38Fourfile, @RequestParam("topic39Fourfile") MultipartFile topic39Fourfile, @RequestParam("topic40Fourfile") MultipartFile topic40Fourfile){
        try {
            if (!topic1Fourfile.isEmpty()){
                testPaper.setTopic1Four(FileUpload.uploadFile(topic1Fourfile,topic1Fourfile.getName()));
            }
            // 感觉提出去写也是这样于是就这样了
            testPaper.setTopic2Four(FileUpload.uploadFile(topic2Fourfile,topic2Fourfile.getName()));
            testPaper.setTopic3Four(FileUpload.uploadFile(topic3Fourfile,topic3Fourfile.getName()));
            testPaper.setTopic4Four(FileUpload.uploadFile(topic4Fourfile,topic4Fourfile.getName()));
            testPaper.setTopic5Four(FileUpload.uploadFile(topic5Fourfile,topic5Fourfile.getName()));
            testPaper.setTopic6Four(FileUpload.uploadFile(topic6Fourfile,topic6Fourfile.getName()));
            testPaper.setTopic7Four(FileUpload.uploadFile(topic7Fourfile,topic7Fourfile.getName()));
            testPaper.setTopic8Four(FileUpload.uploadFile(topic8Fourfile,topic8Fourfile.getName()));
            testPaper.setTopic9Four(FileUpload.uploadFile(topic9Fourfile,topic9Fourfile.getName()));
            testPaper.setTopic10Four(FileUpload.uploadFile(topic10Fourfile,topic10Fourfile.getName()));
            testPaper.setTopic11Four(FileUpload.uploadFile(topic11Fourfile,topic11Fourfile.getName()));
            testPaper.setTopic12Four(FileUpload.uploadFile(topic12Fourfile,topic12Fourfile.getName()));
            testPaper.setTopic13Four(FileUpload.uploadFile(topic13Fourfile,topic13Fourfile.getName()));
            testPaper.setTopic14Four(FileUpload.uploadFile(topic14Fourfile,topic14Fourfile.getName()));
            testPaper.setTopic15Four(FileUpload.uploadFile(topic15Fourfile,topic15Fourfile.getName()));
            testPaper.setTopic16Four(FileUpload.uploadFile(topic16Fourfile,topic16Fourfile.getName()));
            testPaper.setTopic17Four(FileUpload.uploadFile(topic18Fourfile,topic18Fourfile.getName()));
            testPaper.setTopic19Four(FileUpload.uploadFile(topic19Fourfile,topic19Fourfile.getName()));
            testPaper.setTopic20Four(FileUpload.uploadFile(topic20Fourfile,topic20Fourfile.getName()));
            testPaper.setTopic21Four(FileUpload.uploadFile(topic21Fourfile,topic21Fourfile.getName()));
            testPaper.setTopic22Four(FileUpload.uploadFile(topic22Fourfile,topic22Fourfile.getName()));
            testPaper.setTopic23Four(FileUpload.uploadFile(topic23Fourfile,topic23Fourfile.getName()));
            testPaper.setTopic24Four(FileUpload.uploadFile(topic24Fourfile,topic24Fourfile.getName()));
            testPaper.setTopic25Four(FileUpload.uploadFile(topic25Fourfile,topic25Fourfile.getName()));
            testPaper.setTopic26Four(FileUpload.uploadFile(topic26Fourfile,topic26Fourfile.getName()));
            testPaper.setTopic27Four(FileUpload.uploadFile(topic27Fourfile,topic27Fourfile.getName()));
            testPaper.setTopic28Four(FileUpload.uploadFile(topic28Fourfile,topic28Fourfile.getName()));
            testPaper.setTopic29Four(FileUpload.uploadFile(topic29Fourfile,topic29Fourfile.getName()));
            testPaper.setTopic30Four(FileUpload.uploadFile(topic30Fourfile,topic30Fourfile.getName()));
            testPaper.setTopic31Four(FileUpload.uploadFile(topic31Fourfile,topic31Fourfile.getName()));
            testPaper.setTopic32Four(FileUpload.uploadFile(topic32Fourfile,topic32Fourfile.getName()));
            testPaper.setTopic33Four(FileUpload.uploadFile(topic33Fourfile,topic33Fourfile.getName()));
            testPaper.setTopic34Four(FileUpload.uploadFile(topic34Fourfile,topic34Fourfile.getName()));
            testPaper.setTopic35Four(FileUpload.uploadFile(topic35Fourfile,topic35Fourfile.getName()));
            testPaper.setTopic36Four(FileUpload.uploadFile(topic36Fourfile,topic36Fourfile.getName()));
            testPaper.setTopic37Four(FileUpload.uploadFile(topic37Fourfile,topic37Fourfile.getName()));
            testPaper.setTopic38Four(FileUpload.uploadFile(topic38Fourfile,topic38Fourfile.getName()));
            testPaper.setTopic39Four(FileUpload.uploadFile(topic39Fourfile,topic39Fourfile.getName()));
            testPaper.setTopic40Four(FileUpload.uploadFile(topic40Fourfile,topic40Fourfile.getName()));
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
    public String update(@ModelAttribute TestPaper testPaper,HttpServletRequest request, @RequestParam("topic1Fourfile") MultipartFile topic1Fourfile, @RequestParam("topic2Fourfile") MultipartFile topic2Fourfile,
                         @RequestParam("topic3Fourfile") MultipartFile topic3Fourfile, @RequestParam("topic4Fourfile") MultipartFile topic4Fourfile, @RequestParam("topic5Fourfile") MultipartFile topic5Fourfile,
                         @RequestParam("topic6Fourfile") MultipartFile topic6Fourfile, @RequestParam("topic7Fourfile") MultipartFile topic7Fourfile, @RequestParam("topic8Fourfile") MultipartFile topic8Fourfile,
                         @RequestParam("topic9Fourfile") MultipartFile topic9Fourfile, @RequestParam("topic10Fourfile") MultipartFile topic10Fourfile, @RequestParam("topic11Fourfile") MultipartFile topic11Fourfile,
                         @RequestParam("topic12Fourfile") MultipartFile topic12Fourfile, @RequestParam("topic13Fourfile") MultipartFile topic13Fourfile, @RequestParam("topic14Fourfile") MultipartFile topic14Fourfile,
                         @RequestParam("topic15Fourfile") MultipartFile topic15Fourfile, @RequestParam("topic16Fourfile") MultipartFile topic16Fourfile, @RequestParam("topic17Fourfile") MultipartFile topic17Fourfile,
                         @RequestParam("topic18Fourfile") MultipartFile topic18Fourfile, @RequestParam("topic19Fourfile") MultipartFile topic19Fourfile,
                         @RequestParam("topic20Fourfile") MultipartFile topic20Fourfile, @RequestParam("topic21Fourfile") MultipartFile topic21Fourfile, @RequestParam("topic22Fourfile") MultipartFile topic22Fourfile,
                         @RequestParam("topic23Fourfile") MultipartFile topic23Fourfile, @RequestParam("topic24Fourfile") MultipartFile topic24Fourfile, @RequestParam("topic25Fourfile") MultipartFile topic25Fourfile,
                         @RequestParam("topic26Fourfile") MultipartFile topic26Fourfile, @RequestParam("topic27Fourfile") MultipartFile topic27Fourfile, @RequestParam("topic28Fourfile") MultipartFile topic28Fourfile,
                         @RequestParam("topic29Fourfile") MultipartFile topic29Fourfile, @RequestParam("topic30Fourfile") MultipartFile topic30Fourfile, @RequestParam("topic31Fourfile") MultipartFile topic31Fourfile,
                         @RequestParam("topic32Fourfile") MultipartFile topic32Fourfile, @RequestParam("topic33Fourfile") MultipartFile topic33Fourfile, @RequestParam("topic34Fourfile") MultipartFile topic34Fourfile,
                         @RequestParam("topic35Fourfile") MultipartFile topic35Fourfile, @RequestParam("topic36Fourfile") MultipartFile topic36Fourfile, @RequestParam("topic37Fourfile") MultipartFile topic37Fourfile,
                         @RequestParam("topic38Fourfile") MultipartFile topic38Fourfile, @RequestParam("topic39Fourfile") MultipartFile topic39Fourfile, @RequestParam("topic40Fourfile") MultipartFile topic40Fourfile,
                         @RequestParam("trough1File") MultipartFile trough1File){
        try{

            if (!topic1Fourfile.isEmpty()){
                testPaper.setTopic1Four(FileUpload.uploadFile(topic1Fourfile,topic1Fourfile.getName()));
            }
            testPaper.setTrough1(FileUpload.uploadFile(trough1File,trough1File.getName()));
            // 感觉提出去写也是这样于是就这样了
            testPaper.setTopic2Four(FileUpload.uploadFile(topic2Fourfile,topic2Fourfile.getName()));
            testPaper.setTopic3Four(FileUpload.uploadFile(topic3Fourfile,topic3Fourfile.getName()));
            testPaper.setTopic4Four(FileUpload.uploadFile(topic4Fourfile,topic4Fourfile.getName()));
            testPaper.setTopic5Four(FileUpload.uploadFile(topic5Fourfile,topic5Fourfile.getName()));
            testPaper.setTopic6Four(FileUpload.uploadFile(topic6Fourfile,topic6Fourfile.getName()));
            testPaper.setTopic7Four(FileUpload.uploadFile(topic7Fourfile,topic7Fourfile.getName()));
            testPaper.setTopic8Four(FileUpload.uploadFile(topic8Fourfile,topic8Fourfile.getName()));
            testPaper.setTopic9Four(FileUpload.uploadFile(topic9Fourfile,topic9Fourfile.getName()));
            testPaper.setTopic10Four(FileUpload.uploadFile(topic10Fourfile,topic10Fourfile.getName()));
            testPaper.setTopic11Four(FileUpload.uploadFile(topic11Fourfile,topic11Fourfile.getName()));
            testPaper.setTopic12Four(FileUpload.uploadFile(topic12Fourfile,topic12Fourfile.getName()));
            testPaper.setTopic13Four(FileUpload.uploadFile(topic13Fourfile,topic13Fourfile.getName()));
            testPaper.setTopic14Four(FileUpload.uploadFile(topic14Fourfile,topic14Fourfile.getName()));
            testPaper.setTopic15Four(FileUpload.uploadFile(topic15Fourfile,topic15Fourfile.getName()));
            testPaper.setTopic16Four(FileUpload.uploadFile(topic16Fourfile,topic16Fourfile.getName()));
            testPaper.setTopic17Four(FileUpload.uploadFile(topic18Fourfile,topic18Fourfile.getName()));
            testPaper.setTopic19Four(FileUpload.uploadFile(topic19Fourfile,topic19Fourfile.getName()));
            testPaper.setTopic20Four(FileUpload.uploadFile(topic20Fourfile,topic20Fourfile.getName()));
            testPaper.setTopic21Four(FileUpload.uploadFile(topic21Fourfile,topic21Fourfile.getName()));
            testPaper.setTopic22Four(FileUpload.uploadFile(topic22Fourfile,topic22Fourfile.getName()));
            testPaper.setTopic23Four(FileUpload.uploadFile(topic23Fourfile,topic23Fourfile.getName()));
            testPaper.setTopic24Four(FileUpload.uploadFile(topic24Fourfile,topic24Fourfile.getName()));
            testPaper.setTopic25Four(FileUpload.uploadFile(topic25Fourfile,topic25Fourfile.getName()));
            testPaper.setTopic26Four(FileUpload.uploadFile(topic26Fourfile,topic26Fourfile.getName()));
            testPaper.setTopic27Four(FileUpload.uploadFile(topic27Fourfile,topic27Fourfile.getName()));
            testPaper.setTopic28Four(FileUpload.uploadFile(topic28Fourfile,topic28Fourfile.getName()));
            testPaper.setTopic29Four(FileUpload.uploadFile(topic29Fourfile,topic29Fourfile.getName()));
            testPaper.setTopic30Four(FileUpload.uploadFile(topic30Fourfile,topic30Fourfile.getName()));
            testPaper.setTopic31Four(FileUpload.uploadFile(topic31Fourfile,topic31Fourfile.getName()));
            testPaper.setTopic32Four(FileUpload.uploadFile(topic32Fourfile,topic32Fourfile.getName()));
            testPaper.setTopic33Four(FileUpload.uploadFile(topic33Fourfile,topic33Fourfile.getName()));
            testPaper.setTopic34Four(FileUpload.uploadFile(topic34Fourfile,topic34Fourfile.getName()));
            testPaper.setTopic35Four(FileUpload.uploadFile(topic35Fourfile,topic35Fourfile.getName()));
            testPaper.setTopic36Four(FileUpload.uploadFile(topic36Fourfile,topic36Fourfile.getName()));
            testPaper.setTopic37Four(FileUpload.uploadFile(topic37Fourfile,topic37Fourfile.getName()));
            testPaper.setTopic38Four(FileUpload.uploadFile(topic38Fourfile,topic38Fourfile.getName()));
            testPaper.setTopic39Four(FileUpload.uploadFile(topic39Fourfile,topic39Fourfile.getName()));
            testPaper.setTopic40Four(FileUpload.uploadFile(topic40Fourfile,topic40Fourfile.getName()));
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
        model.addAttribute("fileName","/Path/"+fileName);
        return "views/hans/seeImg";
    }





}
