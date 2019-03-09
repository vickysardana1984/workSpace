package com.example.startSpring.scopeexamples;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.component.ComponentDAO;

//IT will make sure that Spring boot would scan the package in which this class is declared for the 
//components(beans) and dependencies(autowiring)
@SpringBootApplication
@ComponentScan("com.example.component")
public class SpingApplicationComponentScan {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpingApplicationComponentScan.class); 

	public static void main(String[] args) {
		//what are the beans
		//what are dependencies
		//where are the dependencies (which package).
		//BinarySearchImpl binary = new BinarySearchImpl(new BubbleSort());
		//int ret = binary.binarySearch(new int[]{1,3,6,2}, 2);
		//System.out.println("retunr is.." + ret) ;
		
		ConfigurableApplicationContext appContext = SpringApplication.run(SpingApplicationComponentScan.class, args);
		
		//Exapmles till autowiring
//		BinarySearchImpl beanBinarySearch = appContext.getBean(BinarySearchImpl.class);
//		int ret = beanBinarySearch.binarySearch(new int[]{1,3,6,2}, 2);
//		System.out.println("retunr is.." + ret) ;
		
		//Examples for scope.
		ComponentDAO component = appContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}",component);
		LOGGER.info("{}",component);
	}

}


