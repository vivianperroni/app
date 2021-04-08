package com.ifms.services.exceptions;

public class DataBaseException extends RuntimeException{

	private static final long serialVersioUID = 1L;
	
	public DataBaseException(String msg) {
		super(msg);
	}
}
