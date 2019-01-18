package cn.vo.controller.hans;


import cn.vo.dao.hans.TestMapper;
import cn.vo.pojo.entity.Test;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QizheScpcController {

    @Autowired
    private TestMapper testMapper;


    @RequestMapping("/listJson")
    @ResponseBody
    public List<Test> listJson(){
        List<Test> test= testMapper.findAll();
        return test;
    }
}
