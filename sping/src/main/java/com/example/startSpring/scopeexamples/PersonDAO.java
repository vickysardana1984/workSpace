package com.example.startSpring.scopeexamples;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
	
	@Autowired
	private JDBCConnection jdbcConnection;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	public JDBCConnection getJDBConnection() {
		return jdbcConnection;
	}

	@PostConstruct
	public void postConstruct() {
		
		logger.info("Spring post construct");
		
	}
	
	@PreDestroy
	public void PreDestroy() {
		
		logger.info("Spring @PreDestroy");
		
	}
}
