
package ar.com.educacionit.ws.impl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import ar.com.educacionit.ws.CreateProductoDTO;
import ar.com.educacionit.ws.ObjectFactory;
import ar.com.educacionit.ws.Producto;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductoWSService", targetNamespace = "http://ws.educacionit.com.ar/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductoWSService {


    /**
     * 
     * @param codigo
     * @return
     *     returns ar.com.educacionit.ws.Producto
     * @throws InternalServerError
     */
    @WebMethod
    @WebResult(name = "producto", targetNamespace = "")
    @RequestWrapper(localName = "getProductoByCodigo", targetNamespace = "http://ws.educacionit.com.ar/", className = "ar.com.educacionit.ws.GetProductoByCodigo")
    @ResponseWrapper(localName = "getProductoByCodigoResponse", targetNamespace = "http://ws.educacionit.com.ar/", className = "ar.com.educacionit.ws.GetProductoByCodigoResponse")
    public Producto getProductoByCodigo(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo)
        throws InternalServerError
    ;

    /**
     * 
     * @return
     *     returns java.util.List<ar.com.educacionit.ws.Producto>
     * @throws InternalServerError
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllProductos", targetNamespace = "http://ws.educacionit.com.ar/", className = "ar.com.educacionit.ws.FindAllProductos")
    @ResponseWrapper(localName = "findAllProductosResponse", targetNamespace = "http://ws.educacionit.com.ar/", className = "ar.com.educacionit.ws.FindAllProductosResponse")
    public List<Producto> findAllProductos()
        throws InternalServerError
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns ar.com.educacionit.ws.Producto
     * @throws InternalServerError
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createNewProducto", targetNamespace = "http://ws.educacionit.com.ar/", className = "ar.com.educacionit.ws.CreateNewProducto")
    @ResponseWrapper(localName = "createNewProductoResponse", targetNamespace = "http://ws.educacionit.com.ar/", className = "ar.com.educacionit.ws.CreateNewProductoResponse")
    public Producto createNewProducto(
        @WebParam(name = "arg0", targetNamespace = "")
        CreateProductoDTO arg0)
        throws InternalServerError
    ;

}
