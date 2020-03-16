package ar.com.educacionit.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.exception.InternalServerError;

@WebService
public interface ProductoWSService {

	@WebMethod()
	public Producto getProducto(String codigoProducto);
	
	@WebMethod()
	public List<Producto> findProductos() throws InternalServerError;
}
