package ar.com.educacionit.ws.soap.client;

import java.util.List;

import ar.com.educacionit.ws.Producto;
import ar.com.educacionit.ws.impl.InternalServerError;
import ar.com.educacionit.ws.impl.ProductoWSService;
import ar.com.educacionit.ws.impl.ProductoWSServiceImplService;

public class ProdcutoWSSoapClient {

	public static void main(String[] args) {
		
		ProductoWSServiceImplService wsClient = new ProductoWSServiceImplService();
		
		ProductoWSService ws = wsClient.getProductoWSServiceImplPort();
		
		try {
			List<Producto> productos = ws.findProductos();
			System.out.println(productos);
		} catch (InternalServerError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
