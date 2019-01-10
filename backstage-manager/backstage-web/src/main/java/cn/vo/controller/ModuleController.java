package cn.vo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import cn.vo.backstage.Utils.ListResult;
import cn.vo.backstage.Utils.PageUtils;
import cn.vo.pojo.Module;
import cn.vo.service.IModuleService;

@Controller
@RequestMapping("module")
public class ModuleController {
	
	@Autowired
	private IModuleService iModuleService;

	@GetMapping("list")
	public String list(){
		return "views/module/moduleList";
	}
	@GetMapping("listJson")
	@ResponseBody
	public ListResult<Module> listJson(String name,Integer page, Integer limit){
		Map map=new HashMap<>();
		map.put("name", name);
		map.put("index", PageUtils.getPageIndex(page, limit));
		map.put("pageSize", PageUtils.getPageSize(page, limit));
		List<Module> list=iModuleService.getListQuery(map);
		ListResult<Module> listResult=new ListResult<>();
		listResult.setCode("");
		listResult.setCount(Long.valueOf(iModuleService.count()));
		listResult.setData(list);
		listResult.setMsg("");
		return listResult;
	}
	@GetMapping("/deial")
	public String deial(Model model,Integer id){
		Module module=iModuleService.getById(id);
		model.addAttribute("deial", module);
		return "views/module/moduleDeial";
	}
	@GetMapping("/add")
	public String add(){
		return "views/module/moduleAdd";
	}
	
	@PostMapping("/insert")
	@ResponseBody
	public String insert(@RequestBody Module module){
		try {
			iModuleService.insert(module);
		} catch (Exception e) {
			e.printStackTrace();
			return "服务异常";
		}
		return "ok";
	}
	@GetMapping("/edit")
	public String edit(Model model,Integer id){
		Module module=iModuleService.getById(id);
		model.addAttribute("deial", module);
		return "views/module/moduleEdit";
	}
	
	@PostMapping("/update")
	@ResponseBody
	public String update(@RequestBody Module module){
		try {
			iModuleService.update(module);
		} catch (Exception e) {
			e.printStackTrace();
			return "服务异常";
		}
		return "ok";
	}
	@ResponseBody
	@GetMapping("/del")
	public String del(Integer id){
		try {
			iModuleService.delId(id);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "删除成功了";
	}
	
	
	
}
