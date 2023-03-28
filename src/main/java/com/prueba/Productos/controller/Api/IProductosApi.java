package com.prueba.Productos.controller.Api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prueba.Productos.model.ProductDetails;

public interface IProductosApi {

	@RequestMapping(path = "/product/{productId}/similar", 
			produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<ProductDetails>> similarProductos(@PathVariable("productId") String productId) throws Exception;

}
