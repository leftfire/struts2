package com.struts2.helloworld;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final static String MESSAGE="my first Struts2 app";
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String execute() throws Exception{
		setMessage(MESSAGE);
		return SUCCESS;
	}
}
