package com.paskasApp.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiError 
{
	private  int statuscode;
	private String message;
	private String urlPath;
	private Date date;
	private HttpStatus msg;

}
