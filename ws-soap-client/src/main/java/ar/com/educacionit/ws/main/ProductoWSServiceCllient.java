package ar.com.educacionit.ws.main;

import ar.com.educacionit.ws.CreateProductoDTO;
import ar.com.educacionit.ws.impl.InternalServerError;
import ar.com.educacionit.ws.impl.ProductoWSService;
import ar.com.educacionit.ws.impl.ProductoWSServiceImplService;

public class ProductoWSServiceCllient {

	public static void main(String[] args) {

		ProductoWSServiceImplService service = new ProductoWSServiceImplService();
		ProductoWSService servicePort = service.getProductoWSServiceImplPort();
		
		//crear producto
		CreateProductoDTO newProducto = new CreateProductoDTO();
		newProducto.setCodigo("a001");
		newProducto.setDescripcion("vaso");
		newProducto.setPrecio(150F);
		try {
			servicePort.createNewProducto(newProducto);
		} catch (InternalServerError e) {
			e.printStackTrace();
		}
	}

}
