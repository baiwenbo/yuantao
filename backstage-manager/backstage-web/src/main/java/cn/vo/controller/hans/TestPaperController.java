package cn.vo.controller.hans;


import cn.vo.backstage.Utils.ListResult;
import cn.vo.backstage.Utils.PageUtils;
import cn.vo.pojo.Question;
import cn.vo.pojo.entity.TestPaper;
import cn.vo.pojo.entity.XiaodianAddress;
import cn.vo.service.IQuestionService;
import cn.vo.service.ITestPaperService;
import cn.vo.service.IXiaodianAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("list")
    public  String  list(String close,Model model){
        model.addAttribute("close",close);
        return "views/hans/testPaperList";
    }

    @GetMapping("/listJson")
    @ResponseBody
    public ListResult<TestPaper> listJson(String name, Integer page, Integer limit){
        Map map=new HashMap<>();
        map.put("name", name);
        map.put("index", PageUtils.getPageIndex(page, limit));
        map.put("pageSize", PageUtils.getPageSize(page, limit));
        List<TestPaper> list=testPaperService.getListQuery(map);
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
            testPaperService.save(testPaper);
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
        List<Question> list=questionService.getType(1);
        model.addAttribute("list",list);
        TestPaper testPaper=testPaperService.getById(id);
        XiaodianAddress xiaodianAddress=xiaodianAddressService.getById(Long.valueOf(testPaper.getCompanyId()));
        model.addAttribute("testPaper",testPaper);
        model.addAttribute("name",xiaodianAddress.getName());
        return "views/hans/questionEdit";
    }
    @GetMapping("deial")
    public String deial(Integer id, Model model){
        List<Question> list=questionService.getType(1);
        model.addAttribute("list",list);
        TestPaper testPaper=testPaperService.getById(id);
        XiaodianAddress xiaodianAddress=xiaodianAddressService.getById(Long.valueOf(testPaper.getCompanyId()));
        model.addAttribute("testPaper",testPaper);
        model.addAttribute("name",xiaodianAddress.getName());
        return "views/hans/questionDeial";
    }

    @PostMapping("update")
    public String update(@ModelAttribute TestPaper testPaper){
        try{
            testPaperService.updateId(testPaper);
        }catch (Exception e){
            e.printStackTrace();
            return "redirect:/testPaper/list?close="+"error";
        }
        return  "redirect:/testPaper/list?close="+"ok";
    }
}
