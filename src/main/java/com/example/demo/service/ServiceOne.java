package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceOne {
	
	public Integer getSum(int i, int j)
	{
		return i+j;
	}
	

}
