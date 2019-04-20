package cn.vo.controller.red;

import cn.vo.pojo.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("red")
public class RedController {


    @GetMapping("redAdd")
    public String routAdd(){
     return    "views/red/redAdd";
    }

    @GetMapping("redList")
    public  String  routList(String close, Model model, HttpServletRequest request){
        HttpSession session=request.getSession();
        User user= (User) session.getAttribute("USER");
        model.addAttribute("user",user);
        model.addAttribute("close",close);
        return    "views/red/redPaperList";
    }

    @GetMapping("redOldList")
    public  String  routOldList(String close, Model model, HttpServletRequest request){
        HttpSession session=request.getSession();
        User user= (User) session.getAttribute("USER");
        model.addAttribute("user",user);
        model.addAttribute("close",close);
        return    "views/red/oldRedList";
    }


}
