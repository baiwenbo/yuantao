package cn.vo.controller.hans;

import cn.vo.Utils.FileUpload;
import cn.vo.pojo.Question;
import cn.vo.pojo.entity.XiaodianAddress;
import cn.vo.service.IQuestionService;
import cn.vo.service.IXiaodianAddressService;
import com.alibaba.fastjson.JSONObject;
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

    @Autowired
    private IXiaodianAddressService xiaodianAddressService;

    @GetMapping("list")
    public  String list(String close,Model model){
        model.addAttribute("close",close);
        return "views/question/environmentList";
    }

    @GetMapping("environmentQuestion/{type}")
    public  String environmentQuestion(@PathVariable("type") Integer type, Model model){
        List<Question> list=questionService.getType(type);
        model.addAttribute("list",list);
        return "views/question/environmentQuestion";

    }

    @PostMapping("saveQuestion")
    @ResponseBody
    public String saveQuestion(@RequestParam("file") MultipartFile file){
      String  path=  FileUpload.uploadFile(file,file.getName());
        return  path;

    }

    @GetMapping("queryName")
    @ResponseBody
    public String queryName(String name){
        String json="";
        try{
            List<XiaodianAddress> list=xiaodianAddressService.queryLikeName(name);
            json= JSONObject.toJSONString(list);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return  json;
    }
    @GetMapping("queryCode")
    @ResponseBody
    public String queryCode(String code){
        String json="";
        try{
             XiaodianAddress xiaodianAddress=xiaodianAddressService.getCode(code);
            json= JSONObject.toJSONString(xiaodianAddress);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return  json;
    }



}
