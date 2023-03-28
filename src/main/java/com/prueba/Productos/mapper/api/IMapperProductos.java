package com.prueba.Productos.mapper.api;

import java.util.List;

import com.prueba.Productos.model.ProductDetails;

public interface IMapperProductos {
	
	List<ProductDetails> mapperOutSimilarProducts(Integer[] ids);

}
