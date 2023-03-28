package com.prueba.Productos.bussinesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.Productos.bussinesApi.IBussinesApi;
import com.prueba.Productos.mapper.api.IMapperProductos;
import com.prueba.Productos.model.ProductDetails;
import com.prueba.Productos.service.api.IObtenerProductos;
@Service
public class BussinesImpl implements IBussinesApi {
	@Autowired
	private IObtenerProductos obtenerProductos;
	
	@Autowired
	private IMapperProductos mapperProductos;

	@Override
	public List<ProductDetails> obtenerProductsSimilares(String productId) throws Exception{

		Integer[] ids = obtenerProductos.obtenerProductosSimilar(productId);
		return mapperProductos.mapperOutSimilarProducts(ids);
	}

}
