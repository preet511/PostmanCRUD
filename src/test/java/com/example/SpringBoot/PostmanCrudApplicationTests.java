package com.example.SpringBoot;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.SpringBoot.model.Employee;
import com.example.SpringBoot.service.CRUDservice;

@SpringBootTest
class PostmanCrudApplicationTests {

	@Autowired
	private CRUDservice crd;
	
	private static Logger log = LoggerFactory.getLogger(PostmanCrudApplicationTests.class);
	
	@Test
	public void myMethod() {
		log.info("Junit is working!");
	}
}
