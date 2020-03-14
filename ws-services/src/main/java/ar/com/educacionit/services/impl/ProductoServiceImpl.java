package ar.com.educacionit.services.impl;

import java.util.List;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.impl.ProductoDAOImpl;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoService;

public class ProductoServiceImpl implements ProductoService {

	private ProductoDAO productoDao;
	
	public ProductoServiceImpl() {
		this.productoDao = new ProductoDAOImpl();
	}
	
	@Override
	public Producto getProducto(String codigo) {
		return this.productoDao.getProducto(codigo);
	}

	@Override
	public List<Producto> findProductos() {
		return this.productoDao.findProductos();
	}
}
