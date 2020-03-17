package ar.com.educacionit.dao;

import java.util.List;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.exception.InternalServerError;

public interface ProductoDAO {

	public Producto getProducto(String codigo);

	public List<Producto> findProductos() throws InternalServerError;

	public Producto createProducto(Producto producto) throws InternalServerError;
}
