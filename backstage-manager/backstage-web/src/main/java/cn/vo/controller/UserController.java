package cn.vo.controller;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import cn.vo.backstage.Utils.ListResult;
import cn.vo.backstage.Utils.PageUtils;
import cn.vo.pojo.User;
import cn.vo.service.IUserService;

@Controller
@RequestMapping("users")
public class UserController {
	
	@Autowired
	private IUserService iUserService;

	@GetMapping("/editpass")
	public String editpass(Model model,HttpServletRequest request){
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("USER");
		model.addAttribute("user", user);
		return "views/user/password";
	}
	
	@GetMapping("/info")
	public String info(Model model,HttpServletRequest request){
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("USER");
		model.addAttribute("user", user);
		return "views/component/anim/info";
	}
	
	@GetMapping("/list")
	public String list(){
		return "views/user/userList";
	}
	@GetMapping("/listJson")
	@ResponseBody
	public ListResult<User> listJson(String username,Integer page, Integer limit){
		Map map=new HashMap<>();
		map.put("username", username);
		map.put("index", PageUtils.getPageIndex(page, limit));
		map.put("pageSize", PageUtils.getPageSize(page, limit));
		List<User> list=iUserService.getListQuery(map);
		ListResult<User> result=new ListResult<>();
		result.setCode("0");
		result.setCount(Long.valueOf(iUserService.getCount()));
		result.setMsg("");
		result.setData(list);
		return result;
	}

	@GetMapping("/deial")
	public String deial(Model model,Integer id){
		User user=iUserService.getById(id);
		model.addAttribute("deial", user);
		return "views/user/deial";
	}
	@GetMapping("/add")
	public String add(){
		return "views/user/userAdd";
	}
	
	@PostMapping("/insert")
	@ResponseBody
	public String insert(@RequestBody User user){
		try {
			user.setCreateTime(new Date());
			iUserService.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "ok";
	}
	@GetMapping("/edit")
	public String edit(Model model,Integer id){
		User user=iUserService.getById(id);
		model.addAttribute("deial", user);
		return "views/user/userEdit";
	}
	

	@PostMapping("/update")
	@ResponseBody
	public String  update(@RequestBody User user){

		try {
			iUserService.updateId(user);

		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "ok";
	}
	@ResponseBody
	@GetMapping("/del")
	public String del(Integer id){
		try {
			iUserService.delId(id);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "删除成功了";
	}
}
