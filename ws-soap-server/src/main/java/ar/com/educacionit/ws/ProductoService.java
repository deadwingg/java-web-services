package ar.com.educacionit.ws;

import javax.jws.WebService;

import ar.com.educacionit.domain.Producto;

@WebService
public interface ProductoService {

	public Producto getProducto(String codigoProducto);
}
