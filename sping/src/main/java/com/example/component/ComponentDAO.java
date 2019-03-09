package com.example.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
	
	@Autowired
	private ComponentJDBCConnection jdbcConnection;
	
	public ComponentJDBCConnection getJDBConnection() {
		return jdbcConnection;
	}

}
