package cn.vo.controller.hans;



import cn.vo.dao.hans.ItemContentMapper;
import cn.vo.pojo.entity.ItemContent;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("design")
public class DesignController {

	@Autowired
	private ItemContentMapper itemContentMapper;

	@GetMapping("questionnaireList")
	public String editQuestionnaire(Model model){
		List<ItemContent> itemContents=itemContentMapper.findAll();
		model.addAttribute("itemContents",itemContents);
		return "views/item/design";
	}


	@GetMapping("save")
	public String save(ItemContent itemContent){
		itemContentMapper.save(itemContent);
		return "views/item/design";
	}

	@GetMapping("edit")
	public String edit(){
		return "views/item/editDesign";
	}

}
