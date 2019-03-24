package cn.vo.controller.rout;

import cn.vo.dao.hans.SiftAddressMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("rout")
public class RoutController {


    @GetMapping("routAdd")
    public String routAdd(){
     return    "views/routine/routAdd";
    }

    @GetMapping("routList")
    public  String routList(String close, Model model){
        model.addAttribute("close",close);
        return    "views/routine/routList";
    }


}
