package com.prueba.Productos.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MyException extends Exception{
	
	private String mensaje;

}
