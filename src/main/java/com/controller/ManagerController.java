package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Manager;
import com.service.ManagerService;

/**
 * 
 * @author Administrator
 *
 */

@Controller
@RequestMapping(value="/user")
public class ManagerController {
	
	@Autowired
	private ManagerService managerservice;
	
	
	@RequestMapping("/login")
	public ModelAndView login(String name , String pass){
		System.out.println("ManagerController /user/login");
		ModelAndView mv = new ModelAndView();
		
		Manager manager = managerservice.login(name, pass);
		
		if(manager!=null){//登录成功
			mv.addObject("manager", manager);
		}
		else {
			mv.addObject("msg", "用户密码错误或没有该用户");
		}
		mv.setViewName("/index");
		return mv;
	}	
	
	
	
	
}
