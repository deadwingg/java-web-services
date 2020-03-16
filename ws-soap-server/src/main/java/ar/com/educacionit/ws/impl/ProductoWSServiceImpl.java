package ar.com.educacionit.ws.impl;

import java.util.List;

import javax.jws.WebService;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.exception.InternalServerError;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.impl.ProductoServiceImpl;
import ar.com.educacionit.ws.ProductoWSService;

@WebService(endpointInterface = "ar.com.educacionit.ws.ProductoWSService",serviceName = "obtenerProducto")
public class ProductoWSServiceImpl implements ProductoWSService {

	public Producto getProducto(String codigoProducto) {

		ProductoService productoService = new ProductoServiceImpl();
		
		return productoService.getProducto(codigoProducto);
	}

	@Override
	public List<Producto> findProductos() throws InternalServerError {
		
		ProductoService productoService = new ProductoServiceImpl();
		
		try {
			return productoService.findProductos();
		}catch (Exception e) {
			throw new InternalServerError(e);
		}
	}
}
