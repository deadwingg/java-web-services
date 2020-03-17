package ar.com.educacionit.ws.main;

import javax.xml.ws.Endpoint;

import ar.com.educacionit.ws.impl.ProductoWSServiceImpl;

public class ProductoServicesWSMain {

	public static void main(String[] args) {
		
		System.out.println("publicanod ws soap en el puerto 8000");
		
		Endpoint.publish("http://localhost:8000/", new ProductoWSServiceImpl());
		
		System.out.println("Se ha iniciado el ws ProductoWSService: en http://localhost:8000/");
		System.out.println("La direccion del wsdl es: http://localhost:8000/?wsdl");
	}
}
