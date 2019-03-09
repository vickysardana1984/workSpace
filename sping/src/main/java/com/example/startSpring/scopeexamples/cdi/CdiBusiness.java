package com.example.startSpring.scopeexamples.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class CdiBusiness {
	
	@Inject
	private CdiDao cdiDao;

	public CdiDao getCdiDao() {
		return cdiDao;
	}

	public void setCdiDao(CdiDao cdiDao) {
		this.cdiDao = cdiDao;
	}

}
