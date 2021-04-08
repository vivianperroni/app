package com.ifms.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersioUID = 1L;
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
