package com.prueba.Productos.mapper.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prueba.Productos.mapper.api.IMapperProductos;
import com.prueba.Productos.model.ProductDetails;
@Service
public class MapperProductos implements IMapperProductos {

	@Override
	public List<ProductDetails> mapperOutSimilarProducts(Integer[] ids) {
		List<ProductDetails> productos = new ArrayList<>(); 
		Arrays.stream(ids).forEach(id -> productos.add(new ProductDetails(Integer.toString(id))));
		return productos;
	}

}
