package com.prueba.Productos.service.api;

public interface IObtenerProductos{
	
	Integer[] obtenerProductosSimilar(String productId)throws Exception;

}
