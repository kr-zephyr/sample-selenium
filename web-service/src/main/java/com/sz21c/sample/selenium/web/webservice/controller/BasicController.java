package com.sz21c.sample.selenium.web.webservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BasicController {
	
	@GetMapping(value = "/hello")
	public @ResponseBody Map<String, String> helloWorld() {
		Map<String, String> rtn = new HashMap<>();
		rtn.put("hello", "world");
		
		return rtn;
	}
	
}
