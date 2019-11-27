package com.ktg.springsecuritytutorial;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String goHome() {
		return "index";
	}
	
//	@RequestMapping("/login")
//	public String loginPage() {
//		return "login";
//	}
	
	@RequestMapping("/logout-success")	
	public String logoutPage() {
		return "logout";
	}

	@RequestMapping("/user")
	@ResponseBody
	public Principal user(Principal principal)
	{
		return principal;
	}
}
