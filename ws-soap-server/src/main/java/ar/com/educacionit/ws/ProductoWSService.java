package ar.com.educacionit.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.ws.dto.CreateProductoDTO;
import ar.com.educacionit.ws.faults.InternalServerError;

@WebService
public interface ProductoWSService {

	@WebMethod(operationName = "getProductoByCodigo")
	@WebResult(name = "producto")
	public Producto getProducto(
		@WebParam(name = "codigo") String codigoProducto
	) throws InternalServerError;

	@WebMethod(operationName = "findAllProductos")
	public List<Producto> findProductos() throws InternalServerError;

	@WebMethod(operationName = "createNewProducto")
	public Producto createProducto(CreateProductoDTO request) throws InternalServerError;
}
