package cn.vo.controller.hans;

import cn.vo.pojo.Question;
import cn.vo.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequestMapping("environment")
public class EnvironmentController {

    @Autowired
    private IQuestionService questionService;

    @GetMapping("list")
    public  String list(){
        return "views/question/environmentList";
    }

    @GetMapping("environmentQuestion/{type}")
    public  String environmentQuestion(@PathVariable("type") Integer type, Model model){
        List<Question> list=questionService.getType(type);
        model.addAttribute("list",list);
        return "views/question/environmentQuestion";

    }

    @PostMapping("saveQuestion")
    public String saveQuestion(@RequestParam("file") MultipartFile file){

        return  "";

    }



}
