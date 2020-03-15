package ar.com.educacionit.ws.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ProductoRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductoRequest {

	@XmlElement(name="codigoProducto", required = true )
	private String codigoProducto;
	
	@XmlElement(name="idProducto", required = true )
	private String id;

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
