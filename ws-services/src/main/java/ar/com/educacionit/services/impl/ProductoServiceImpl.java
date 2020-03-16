package ar.com.educacionit.services.impl;

import java.util.List;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.jdbc.impl.ProductoDAOJDBCImpl;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.exception.InternalServerError;
import ar.com.educacionit.services.ProductoService;

public class ProductoServiceImpl implements ProductoService {

	private ProductoDAO productoDao;
	
	public ProductoServiceImpl() {
		//this.productoDao = new ProductoDAOHibernateImpl();
		this.productoDao = new ProductoDAOJDBCImpl();
	}
	
	@Override
	public Producto getProducto(String codigo) {
		return this.productoDao.getProducto(codigo);
	}

	@Override
	public List<Producto> findProductos() throws InternalServerError {
		return this.productoDao.findProductos();
	}
}
