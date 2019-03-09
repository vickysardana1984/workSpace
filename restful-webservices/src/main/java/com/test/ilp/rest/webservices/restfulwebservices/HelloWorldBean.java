package com.test.ilp.rest.webservices.restfulwebservices;

import java.util.Date;

public class HelloWorldBean {
	
	
	public HelloWorldBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HelloWorldBean(String message, Date timeOfResponse) {
		super();
		this.message = message;
		this.timeOfResponse = timeOfResponse;
	}
	private String message;
	private Date timeOfResponse;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getTimeOfResponse() {
		return timeOfResponse;
	}
	public void setTimeOfResponse(Date timeOfResponse) {
		this.timeOfResponse = timeOfResponse;
	}
}
