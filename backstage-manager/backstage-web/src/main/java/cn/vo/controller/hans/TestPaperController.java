package cn.vo.controller.hans;


import cn.vo.pojo.entity.TestPaper;
import cn.vo.service.ITestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("testPaper")
public class TestPaperController {

    @Autowired
    private ITestPaperService testPaperService;

    @PostMapping("save")
    @ResponseBody
    public String save(@RequestBody TestPaper testPaper){
        try {
            testPaperService.save(testPaper);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return  "ok";
    }

    @ResponseBody
    @GetMapping("delete")
    public String delete(Integer id){
        try{
            testPaperService.delCompanyId(id);
        }catch (Exception e){
            e.printStackTrace();
            return  "error";
        }
        return "ok";
    }

    @GetMapping("edit")
    public String edit(Integer id){

        return null;
    }
}
