package ar.com.educacionit.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import ar.com.educacionit.domain.Producto;

@WebService
public interface ProductoWSService {

	@WebMethod()
	public Producto getProducto(String codigoProducto);
}
