package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/test/bringInfo")
	public String move() {
		System.out.println("1.정보 요청 중");
		return "test/bringInfo";
	}
}
