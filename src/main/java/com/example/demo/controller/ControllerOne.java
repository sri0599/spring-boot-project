package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ServiceOne;

@RestController
public class ControllerOne {
	
	@Autowired
	ServiceOne serviceOne;
	
	@GetMapping("/sum{one}/{two}")
	public Integer sum(@PathVariable Integer one, @PathVariable Integer two)
	{
		System.out.println(one+two);
		return one + two;
		
	}

}
