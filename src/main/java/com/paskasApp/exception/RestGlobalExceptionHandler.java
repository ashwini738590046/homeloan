package com.paskasApp.exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestGlobalExceptionHandler 
{
	
	public ResponseEntity<ApiError> ProductNotFoundexceptionHandler(ProductNotFoundException e,HttpServletRequest request)
	{
		System.out.println("Global Handler");
		
		ApiError error = new ApiError();
		error.setDate(new Date());
		error.setMessage(e.getMessage());
		error.setMsg(HttpStatus.NOT_FOUND);
		error.setStatuscode(HttpStatus.NOT_FOUND.value());
		error.setUrlPath(request.getRequestURI());
		
		
		return new ResponseEntity<ApiError>(error , HttpStatus.NOT_FOUND);
	}
}
