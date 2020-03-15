package ar.com.educacionit.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.ws.exception.NoExisteProductoException;
import ar.com.educacionit.ws.request.ProductoRequest;

@WebService
public interface ProductoWSService {

	@WebMethod()
	public Producto getProducto(ProductoRequest request) throws NoExisteProductoException;
}
