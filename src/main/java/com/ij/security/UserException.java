package com.ij.security;

public class UserException extends Exception{


	private static final long serialVersionUID = -8943512819298529640L;

	private String errorMessage;
	
	public UserException() {
		super();
	}

	public UserException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}


	public String getErrorMessage() {
		return errorMessage;
	}
	
}
