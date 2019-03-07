package cn.vo.controller.hans;

import cn.vo.backstage.Utils.ListResult;
import cn.vo.backstage.Utils.PageUtils;
import cn.vo.dao.hans.CustomerMapper;
import cn.vo.pojo.QizheAddress;
import cn.vo.pojo.entity.Customer;
import cn.vo.pojo.entity.HansXiaoDianAddress;
import cn.vo.service.HansXiaoDianAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("xiaodian")
public class HansXiaoDianAddressController {

    @Autowired
    private HansXiaoDianAddressService hansXiaoDianAddressService;

    @Autowired
    private CustomerMapper customerMapper;


    @GetMapping("list")
    public String list(){
        return "views/hans/xiaodianAddressList";
    }

    @GetMapping("listJson")
    @ResponseBody
    public  ListResult<HansXiaoDianAddress> listJson(String qname, Integer page, Integer limit){
        List<HansXiaoDianAddress> list=hansXiaoDianAddressService.findAll();
        ListResult<HansXiaoDianAddress> result=new ListResult<>();
        result.setCode("0");
        result.setCount(hansXiaoDianAddressService.count());
        result.setMsg("");
        result.setData(list);
        return result;
    }

    @ResponseBody
    @PostMapping("save")
    public  String save(@RequestBody Customer customer){
        try {
            customerMapper.save(customer);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "ok";
    }



}
