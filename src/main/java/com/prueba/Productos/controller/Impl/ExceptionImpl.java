package com.prueba.Productos.controller.Impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.prueba.Productos.model.MyException;
@ControllerAdvice
public class ExceptionImpl extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler({ Exception.class })
	public ResponseEntity<MyException> handleAccessDeniedException(MyException ex, WebRequest request) {
		return new ResponseEntity<MyException>(ex, HttpStatus.NOT_FOUND);
	}
}
