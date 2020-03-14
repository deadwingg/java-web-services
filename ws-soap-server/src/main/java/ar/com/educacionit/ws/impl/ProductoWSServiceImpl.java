package ar.com.educacionit.ws.impl;

import javax.jws.WebService;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.impl.ProductoServiceImpl;
import ar.com.educacionit.ws.ProductoWSService;

@WebService(endpointInterface = "ar.com.educacionit.ws.ProductoWSService",serviceName = "obtenerProducto")
public class ProductoWSServiceImpl implements ProductoWSService {

	public Producto getProducto(String codigoProducto) {

		ProductoService productoService = new ProductoServiceImpl();
		
		return productoService.getProducto(codigoProducto);
	}
}
