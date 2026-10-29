package com.example.model;

public class HelloWorldBean {

	private String mssg;

	@Override
	public String toString() {
		return "HelloWorldBean [mssg=" + mssg + "]";
	}

	public String getMssg() {
		return mssg;
	}

	public void setMssg(String mssg) {
		this.mssg = mssg;
	}

	public HelloWorldBean(String mssg) {
		this.mssg = mssg;
	}
	
	
}
