package cn.vo.controller.rout;

import cn.vo.dao.hans.SiftAddressMapper;

import cn.vo.pojo.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    public  String  routList(String close, Model model, HttpServletRequest request){
        HttpSession session=request.getSession();
        User user= (User) session.getAttribute("USER");
        model.addAttribute("user",user);
        model.addAttribute("close",close);
        return    "views/routine/routList";
    }


}
