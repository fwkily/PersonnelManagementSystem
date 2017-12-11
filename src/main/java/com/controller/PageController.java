package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/page")
public class PageController {
	
	@RequestMapping("/topframe")
	public String topframe(){
		return "/topframe";
	}
	
	@RequestMapping("/leftframe")
	public String leftframe(){
		return "/leftframe";
	}
	
	@RequestMapping("/switchframe")
	public String switchframe(){
		return "/switchframe";
	}
	
	@RequestMapping("/mainframe")
	public String mainframe(){
		return "/mainframe";
	}
	
	@RequestMapping("/test")
	public String test(){
		return "/test";
	}
	
	@RequestMapping("/adddept")
	public String adddept(){
		return "/adddept";
	}
	
	
	
	
}
