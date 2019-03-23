package cn.vo.controller.sift;

import cn.vo.dao.hans.SiftAddressMapper;
import cn.vo.pojo.User;
import cn.vo.pojo.entity.HansSiftAddress;
import cn.vo.service.ITestPaperService;
import com.alibaba.fastjson.JSONObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("sift")
public class SiftController {

    @Autowired
    private ITestPaperService testPaperService;

    @Autowired
    private SiftAddressMapper siftAddressMapper;

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

    @GetMapping("queryCode")
    @ResponseBody
    public String queryCode(String code){
        String json="";
        try{
            HansSiftAddress xiaodianAddress=siftAddressMapper.queryMap(code);
            json= JSONObject.toJSONString(xiaodianAddress);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return  json;
    }

}
