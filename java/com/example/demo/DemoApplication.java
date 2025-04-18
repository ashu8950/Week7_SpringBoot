package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.componenet.EmployeeBean;

@SpringBootApplication
public class DemoApplication {
	public static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		String name = "Ashu";
		logger.info("hello {}",name);
		logger.debug("Welcome to Spring concept demo");
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		logger.debug("Checking context : {}", context.getBean(DemoApplication.class));
		logger.debug("\n***** Example using @Autowired annotation on property *****");
		EmployeeBean eb = context.getBean(EmployeeBean.class);
		eb.setEid(1);
		eb.setEname("Ashu");
		
		eb.showEmpDetails();
		
		System.out.println("Successfully running server");
	}
}
