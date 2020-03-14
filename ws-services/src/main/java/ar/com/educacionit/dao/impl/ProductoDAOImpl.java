package ar.com.educacionit.dao.impl;

import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.hibernate.HibernateUtils;

public class ProductoDAOImpl implements ProductoDAO {

	private SessionFactory factory;
	
	public ProductoDAOImpl() {
		
		factory = HibernateUtils.getSessionFactory();
	}
	
	@Override
	public Producto getProducto(String codigo) {
		
		Session session = factory.getCurrentSession();

		Producto producto = null;
		
		try {

			// All the action with DB via Hibernate
			// must be located in one transaction.
			// Start Transaction.
			session.getTransaction().begin();

			// Create an HQL statement, query the object.
			String sql = "Select e from " + Producto.class.getName() + " e where e.codigo=:codigo ";

			// Create Query object.
			Query<Producto> query = session.createQuery(sql);

			query.setParameter("codigo", codigo);

			// Execute query.
			Optional<Producto> employees = query.uniqueResultOptional();

			if(employees.isPresent()) {
				producto = employees.get();
			}
			
			// Commit data.
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			// Rollback in case of an error occurred.
			session.getTransaction().rollback();
		}
		return producto;
	}

}
