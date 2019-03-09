package com.test.ilp.rest.webservices.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Version controller can be done using URl, param,header and also using 
@RestController
public class NewControllerVersion {
	
	@Autowired
	private PersonV1 personv1;
	@Autowired
	private PersonV2 personv2;
	
	// Versioning by URL
	@GetMapping(path="/person/v1")
	public PersonV1 PersonV1() {
		return personv1;
	}

	@GetMapping(path = "/person/v2")
	public PersonV2 PersonV2() {
		return personv2;
	}
	
	// By parameters ie ??
	
	@GetMapping(path="/person" , params="version1")
	public PersonV1 PersonV1version() {
		return personv1;
	}
	
	@GetMapping(path="/person" , params="version2")
	public PersonV2 PersonV2version() {
		return personv2;
	}

	// By headers ie ??

	@GetMapping(path = "/person", headers = "api-version=1")
	public PersonV1 PersonV1versionheader() {
		return personv1;
	}

	@GetMapping(path = "/person", headers = "api-version=2")
	public PersonV2 PersonV2versionheader() {
		return personv2;
	}

}
