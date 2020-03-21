package ar.com.educacionit.ws.impl;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.BindingType;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.exception.InternalServerError;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.impl.ProductoServiceImpl;
import ar.com.educacionit.ws.ProductoWSService;
import ar.com.educacionit.ws.dto.CreateProductoDTO;

@WebService(
		endpointInterface = "ar.com.educacionit.ws.ProductoWSService", 
		serviceName = "ProductoWSServiceImpl", 
		targetNamespace = "http://ar.com.educacionit.ws.impl/")
@BindingType(value = "http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/")
public class ProductoWSServiceImpl implements ProductoWSService {

	public Producto getProducto(String codigoProducto) {

		ProductoService productoService = new ProductoServiceImpl();

		return productoService.getProducto(codigoProducto);
	}

	public List<Producto> findProductos() throws InternalServerError {

		ProductoService productoService = new ProductoServiceImpl();

		try {
			return productoService.findProductos();
		} catch (Exception e) {
			throw new InternalServerError(e);
		}
	}

	public Producto createProducto(CreateProductoDTO request) throws InternalServerError {
		ProductoService productoService = new ProductoServiceImpl();

		try {
			Producto producto = new Producto();
			producto.setCodigo(request.getCodigo());
			producto.setDescripcion(request.getDescripcion());
			producto.setPrecio(request.getPrecio());
			return productoService.createProducto(producto);
		} catch (Exception e) {
			throw new InternalServerError(e);
		}
	}
}
