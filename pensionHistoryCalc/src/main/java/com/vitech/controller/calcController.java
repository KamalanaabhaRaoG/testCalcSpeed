package com.vitech.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitech.service.CalcService;

@RestController
@RequestMapping("/api")
public class calcController {
	@Autowired
	private CalcService calcService;
	
	@GetMapping("/test")
	public String test() {
		return "ok";
	}
	
	@GetMapping("calculateHistoryVariables/{memberId}/{pensionAppId}")
	public Map<String,Object> calculateHistoryVariables(@PathVariable String memberId,@PathVariable String pensionAppId ){
		
		return calcService.calculateHistoryVariables(memberId, pensionAppId);
	}


}
