package com.admin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<UserException>ResourceNotFoundException(ResourceNotFoundException ex){
		String message = ex.getMessage();
		UserException user=new UserException(message, false);
		return new ResponseEntity<UserException>(user,HttpStatus.NOT_FOUND);
	}
}
