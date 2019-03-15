package cn.vo.controller.hans;

import cn.vo.service.ITestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("rout")
public class RoutController {

    @Autowired
    private ITestPaperService testPaperService;

    @GetMapping("routAdd")
    public String routAdd(){
     return    "views/routine/routAdd";
    }


}
