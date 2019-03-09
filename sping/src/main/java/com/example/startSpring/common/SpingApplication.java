package com.example.startSpring.common;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.startSpring.autowiring.BinarySearchImpl;

//IT will make sure that Spring boot would scan the package in which this class is declared for the 
//components(beans) and dependencies(autowiring)
@SpringBootApplication
public class SpingApplication {

	public static void main(String[] args) {
		//what are the beans
		//what are dependencies
		//where are the dependencies (which package).
		//BinarySearchImpl binary = new BinarySearchImpl(new BubbleSort());
		//int ret = binary.binarySearch(new int[]{1,3,6,2}, 2);
		//System.out.println("retunr is.." + ret) ;
		
		ConfigurableApplicationContext appContext = SpringApplication.run(SpingApplication.class, args);
		BinarySearchImpl beanBinarySearch = appContext.getBean(BinarySearchImpl.class);
		int ret = beanBinarySearch.binarySearch(new int[]{1,3,6,2}, 2);
		System.out.println("retunr is.." + ret) ;
	}

}


