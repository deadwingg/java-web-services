package ar.com.educacionit.ws.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.impl.ProductoServiceImpl;
import ar.com.educacionit.ws.ProductoWSService;
import ar.com.educacionit.ws.exception.NoExisteProductoException;
import ar.com.educacionit.ws.request.ProductoRequest;

@WebService(endpointInterface = "ar.com.educacionit.ws.ProductoWSService")
public class ProductoWSServiceImpl implements ProductoWSService {

	@WebMethod(operationName = "obtenerProdudcto")
	public Producto getProducto(
			@WebParam()
			ProductoRequest request) throws NoExisteProductoException {

		ProductoService productoService = new ProductoServiceImpl();
		
		Producto producto =  productoService.getProducto(request.getCodigoProducto());
		
		if(producto == null) {
			throw new NoExisteProductoException("No existe el producto con codigo="+request.getCodigoProducto(),"0001");
		}
		
		return producto;
	}
}
