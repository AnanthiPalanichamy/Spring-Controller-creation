package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Student {
	
	
		
		@RequestMapping("/computer")
		public String mathsStudent()
		{
			return"home";
		}

	
}
