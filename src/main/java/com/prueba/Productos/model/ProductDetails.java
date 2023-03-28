package com.prueba.Productos.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@JsonInclude(Include.NON_NULL) 
public class ProductDetails {
	
	private String id;
	private String name;
	private String price;
	private boolean availability;
	public ProductDetails(String id) {
		super();
		this.id = id;
	}
	
	
	

}
