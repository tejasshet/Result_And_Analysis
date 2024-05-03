package com.thbs.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thbs.demo.model.ResultAndAnalysis;
import com.thbs.demo.service.ResultService;



@RestController
@RequestMapping("/result")
public class ResultController {
	
 @Autowired
 private ResultService resultService;
 
 
	@PostMapping("/save")
	public String saveDetails(@RequestBody ResultAndAnalysis resultAndAnalysis) {
		
		resultService.saveResult(resultAndAnalysis);
		return "Save";
	}
}
