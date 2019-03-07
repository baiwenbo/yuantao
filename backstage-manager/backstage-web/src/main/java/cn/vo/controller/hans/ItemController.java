package cn.vo.controller.hans;

import cn.vo.backstage.Utils.ListResult;
import cn.vo.backstage.Utils.PageUtils;
import cn.vo.dao.hans.ItemContentMapper;
import cn.vo.pojo.QizheAddress;
import cn.vo.pojo.entity.ItemContent;
import cn.vo.service.IqizheAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("item")
public class ItemController {

    @Autowired
    private IqizheAddressService iqizheAddressService;

    @Autowired
    private ItemContentMapper itemContentMapper;

    @GetMapping("/list")
    public String list(){
        return "views/item/AddressList";
    }
    @GetMapping("/listJson")
    @ResponseBody
    public ListResult<QizheAddress> listJson(String qname, Integer page, Integer limit){
        Map map=new HashMap<>();
        map.put("qname", qname);
        map.put("index", PageUtils.getPageIndex(page, limit));
        map.put("pageSize", PageUtils.getPageSize(page, limit));
        List<QizheAddress> list=iqizheAddressService.getQuery(map);
        ListResult<QizheAddress> result=new ListResult<>();
        result.setCode("0");
        result.setCount(Long.valueOf(iqizheAddressService.count()));
        result.setMsg("");
        result.setData(list);
        return result;
    }
    @GetMapping("mark/{qname}")
    public String mark(@PathVariable String qname, Model model){

              List<ItemContent> itemContents=itemContentMapper.findAll();
              QizheAddress qizheAddress=iqizheAddressService.getByQname(qname);
              model.addAttribute("qizheAddress",qizheAddress);
              model.addAttribute("itemContents",itemContents);
        return "views/item/mark";
    }



}
