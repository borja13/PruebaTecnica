package com.prueba.Productos.bussinesApi;

import java.util.List;

import com.prueba.Productos.model.ProductDetails;

public interface IBussinesApi {
	
	List<ProductDetails> obtenerProductsSimilares(String productId) throws Exception;

}
