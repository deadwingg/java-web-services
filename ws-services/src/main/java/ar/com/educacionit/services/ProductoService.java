package ar.com.educacionit.services;

import java.util.List;

import ar.com.educacionit.domain.Producto;

public interface ProductoService {

	public Producto getProducto(String codigo);

	public List<Producto> findProductos();
}
