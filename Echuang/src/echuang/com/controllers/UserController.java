package echuang.com.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import echuang.com.model.Role;
import echuang.com.model.User;
import echuang.com.service.AbstractUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
    private AbstractUserService userService;

	
	@RequestMapping(value="/add",method = RequestMethod.GET)
	public String addUser(Model model){
		User u = new User();		
		u.setEmployeeName("王小暖");
		u.setUserName("wangxiaonuan");
		userService.addUser(u);
		model.addAttribute("title", "用户新增完成");
		return "User/Add";
	}
	
	@RequestMapping(value="/addrole",method = RequestMethod.GET)
	public String addRole(Model model){
		Role role = new Role();
		role.setRoleName("Admin");
		userService.addRole(role);
		model.addAttribute("title", "角色新增完成");
		return "User/Add";
	}
}
