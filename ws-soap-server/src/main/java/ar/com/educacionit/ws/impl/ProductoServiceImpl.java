package ar.com.educacionit.ws.impl;

import java.util.Optional;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.hibernate.HibernateUtils;
import ar.com.educacionit.ws.ProductoService;

@WebService(endpointInterface = "ar.com.educacionit.ws.ProductoService")
public class ProductoServiceImpl implements ProductoService {

	@WebMethod()
	public Producto getProducto(String codigoProducto) {

		SessionFactory factory = HibernateUtils.getSessionFactory();

		Session session = factory.getCurrentSession();

		Producto producto = null;
		
		try {

			// All the action with DB via Hibernate
			// must be located in one transaction.
			// Start Transaction.
			session.getTransaction().begin();

			// Create an HQL statement, query the object.
			// Equivalent to the SQL statement:
			// Select e.* from EMPLOYEE e order by e.EMP_NAME, e.EMP_NO
			String sql = "Select e from " + Producto.class.getName() + " e where e.codigo=:codigo ";

			// Create Query object.
			Query<Producto> query = session.createQuery(sql);

			query.setParameter("codigo", codigoProducto);

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
