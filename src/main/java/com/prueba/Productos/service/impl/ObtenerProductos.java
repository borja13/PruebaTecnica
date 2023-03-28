package com.prueba.Productos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prueba.Productos.Utils.Constantes;
import com.prueba.Productos.model.MyException;
import com.prueba.Productos.service.api.IObtenerProductos;
@Service
public class ObtenerProductos implements IObtenerProductos {

	@Override
	public Integer[] obtenerProductosSimilar(String productId) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		String url = Constantes.BASE_URL.concat(Constantes.PORT)
				.concat(String.format(Constantes.OPERACION, productId));
		ResponseEntity<Integer[]> response = null;
		try {
			response = restTemplate.getForEntity(url,
					Integer[].class);
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
		
		
		return response.getBody();
	}

}
