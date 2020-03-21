package ar.com.educacionit.ws;

import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.exception.InternalServerError;
import ar.com.educacionit.ws.dto.CreateProductoDTO;

@WebService(name = "ProductoWSService")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface ProductoWSService {

	public Producto getProducto(String codigoProducto);
	
	public List<Producto> findProductos() throws InternalServerError;
	
	public Producto createProducto(CreateProductoDTO request) throws InternalServerError;

}
