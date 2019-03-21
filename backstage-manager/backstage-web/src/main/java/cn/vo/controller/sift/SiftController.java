package cn.vo.controller.sift;

import cn.vo.pojo.User;
import cn.vo.service.ITestPaperService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sift")
public class SiftController {

    @Autowired
    private ITestPaperService testPaperService;

    @GetMapping("siftAdd")
    public String routAdd(){
     return    "views/sift/siftAdd";
    }

    @GetMapping("siftList")
    public  String  list(String close, Model model, HttpServletRequest request){
        HttpSession session=request.getSession();
        User user= (User) session.getAttribute("USER");
        model.addAttribute("user",user);
        model.addAttribute("close",close);
        return "views/sift/siftList";
    }

}
