package cn.vo.controller.sift;

import cn.vo.backstage.Utils.ListResult;
import cn.vo.backstage.Utils.PageUtils;
import cn.vo.dao.hans.SiftAddressMapper;
import cn.vo.pojo.User;
import cn.vo.pojo.entity.HansSiftAddress;
import cn.vo.pojo.entity.TestPaper;
import cn.vo.service.ITestPaperService;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    @GetMapping("siftOldList")
    public  String  siftOldList(String close, Model model, HttpServletRequest request){
        HttpSession session=request.getSession();
        User user= (User) session.getAttribute("USER");
        model.addAttribute("user",user);
        model.addAttribute("close",close);
        return "views/sift/siftOldList";
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

    @GetMapping("/listOld")
    @ResponseBody
    public ListResult<TestPaper> listJson(HttpServletRequest request,String monthjudge, String name,String qcheckstatus,
        String checkstatus,Integer type, Integer page, Integer limit){
        Map map=new HashMap<>();
        map.put("monthJudge", monthjudge);
        map.put("name", name);
        map.put("type", type);
        map.put("qcheckstatus", qcheckstatus);
        map.put("checkstatus", checkstatus);
        map.put("index", PageUtils.getPageIndex(page, limit));
        map.put("pageSize", PageUtils.getPageSize(page, limit));
        HttpSession session=request.getSession();
        User user=(User) session.getAttribute("USER");
        List<TestPaper> list=null;
        if("0".equals(user.getScpcqx())){
            map.put("code", user.getUsername());
            list=testPaperService.getOldMendianQuery(map);
        }
        if("2".equals(user.getScpcqx())){
            map.put("company", user.getUsername());
            list=testPaperService.getOldCompanyQuery(map);
        }
        if("5".equals(user.getScpcqx()) || "3".equals(user.getScpcqx()) ){
            list=testPaperService.getOldListQuery(map);
        }
        ListResult<TestPaper> result=new ListResult<>();
        result.setCode("0");
        result.setCount(Long.valueOf(testPaperService.count()));
        result.setMsg("");
        result.setData(list);
        return result;
    }
}
