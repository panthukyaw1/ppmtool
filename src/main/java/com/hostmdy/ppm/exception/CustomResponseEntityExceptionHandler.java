package com.hostmdy.ppm.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler {
	@ExceptionHandler
	public final ResponseEntity<Object> handleprojectIdException(
			ProjectIdException ex,WebRequest request
			){
		ProjectIdExceptionResponse response = new ProjectIdExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(response,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler
	public final ResponseEntity<Object> handleprojectNotFoundException(
			ProjectNotFoundException ex,WebRequest request
			){
		ProjectNotFoundException response = new ProjectNotFoundException(ex.getMessage());
		return new ResponseEntity<Object>(response,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public final ResponseEntity<Object> handleUsernameAlreadyExistException(
			UsernameAlreadyExistException ex,WebRequest request
			){
		UsernameAlreadyExistResponse response = new UsernameAlreadyExistResponse(ex.getMessage());
		return new ResponseEntity<Object>(response,HttpStatus.BAD_REQUEST);
	}
}
