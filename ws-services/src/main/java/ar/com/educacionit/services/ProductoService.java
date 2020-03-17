package ar.com.educacionit.services;

import java.util.List;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.exception.InternalServerError;

public interface ProductoService {

	public Producto getProducto(String codigo);

	public List<Producto> findProductos() throws InternalServerError;

	public Producto createProducto(Producto producto) throws InternalServerError;
}
