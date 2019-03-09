package com.example.startSpring.scopeexamples.cdi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//IT will make sure that Spring boot would scan the package in which this class is declared for the 
//components(beans) and dependencies(autowiring)
@Configuration
@ComponentScan
public class SpingApplicationCDI {
	

	public static void main(String[] args) {
	
		
		//ConfigurableApplicationContext appContext = SpringApplication.run(SpingApplicationCDI.class, args);
		AnnotationConfigApplicationContext  appContext = new AnnotationConfigApplicationContext();
		CdiBusiness cdiBusiness = appContext.getBean(CdiBusiness.class);
		
		
	}

}


