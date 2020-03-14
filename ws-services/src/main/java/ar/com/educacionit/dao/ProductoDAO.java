package ar.com.educacionit.dao;

import java.util.List;

import ar.com.educacionit.domain.Producto;

public interface ProductoDAO {

	public Producto getProducto(String codigo);

	public List<Producto> findProductos();
}
