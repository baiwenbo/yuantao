package cn.vo.controller.rout;

import cn.vo.dao.hans.SiftAddressMapper;
import cn.vo.pojo.entity.HansSiftAddress;
import cn.vo.service.ITestPaperService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("rout")
public class RoutController {

    @Autowired
    private SiftAddressMapper siftAddressMapper;

    @GetMapping("routAdd")
    public String routAdd(){
     return    "views/routine/routAdd";
    }

    @GetMapping("routList")
    public  String routList(){
        return    "views/routine/routList";
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
