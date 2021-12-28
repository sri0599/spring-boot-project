package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.ServiceOne;

@SpringBootTest
class SpringBootProjectApplicationTests {

	@Autowired
	ServiceOne serviceOne;
	
	

	@Test
	void getSumTest() {
		
		assertEquals(serviceOne.getSum(1, 2), 3);
		
	}

	
}
