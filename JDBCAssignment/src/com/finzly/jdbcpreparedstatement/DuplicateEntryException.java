package com.finzly.jdbcpreparedstatement;

@SuppressWarnings("serial")
public class DuplicateEntryException extends Exception{

	
	public DuplicateEntryException(String message) {
		super(message);
	}
	
	public DuplicateEntryException() {
		super();
	}
}
