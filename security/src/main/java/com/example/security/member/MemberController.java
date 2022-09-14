package com.example.security.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

	
	@GetMapping("/")
	public String logined() {
		
		return "logined";
	}
	
	
	
	
	@GetMapping("/testing")
	public String testing() {
		return "testingjsp"; 
	}
	
	@GetMapping("/user")
	public String user() {
		return "user"; 
	}

	@GetMapping("/admin")
	public String admin() {
		return "admin"; 
	}

	@GetMapping("/manager")
	public String manager() {
		return "manager"; 
	}

	@GetMapping("/loginform")
	public String login() {
		return "loginform"; 
	}

	@GetMapping("/join")
	public String join() {
		return "join"; 
	}

	@ResponseBody
	@GetMapping("/joinProc")
	public String joinProc() {
		return "회원가입 성공!"; 
	}

	
	

}
