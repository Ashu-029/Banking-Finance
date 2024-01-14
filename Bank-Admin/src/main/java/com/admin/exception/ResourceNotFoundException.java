package com.admin.exception;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException  extends RuntimeException{

	
	
//	public ResourceNotFoundException() {
//		super("Resource Not Found !!!");
//	}
	
	private String resourceName;
	private String fieldName;
	long fieldValue;
	
	
	public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
		super(String.format("%s not found with %s : %1", resourceName,fieldName,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}


	public ResourceNotFoundException(String msg, Throwable success) {
		
       super(msg, success);
	}
}
