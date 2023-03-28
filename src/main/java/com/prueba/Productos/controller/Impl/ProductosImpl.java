package com.prueba.Productos.controller.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.Productos.bussinesApi.IBussinesApi;
import com.prueba.Productos.controller.Api.IProductosApi;
import com.prueba.Productos.model.ProductDetails;

@RestController
public class ProductosImpl implements IProductosApi {
	
	@Autowired
	private IBussinesApi bussinesApi;

	@Override
	public ResponseEntity<List<ProductDetails>> similarProductos(String productId) throws Exception {
		List<ProductDetails> lista = null;
		lista = bussinesApi.obtenerProductsSimilares(productId);
		return new ResponseEntity<List<ProductDetails>>(lista,HttpStatus.OK);
	}
	

}
