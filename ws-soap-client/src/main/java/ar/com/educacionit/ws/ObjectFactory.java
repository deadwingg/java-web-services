
package ar.com.educacionit.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.educacionit.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InternalServerError_QNAME = new QName("http://ws.educacionit.com.ar/", "InternalServerError");
    private final static QName _FindProductos_QNAME = new QName("http://ws.educacionit.com.ar/", "findProductos");
    private final static QName _CreateProductoResponse_QNAME = new QName("http://ws.educacionit.com.ar/", "createProductoResponse");
    private final static QName _FindProductosResponse_QNAME = new QName("http://ws.educacionit.com.ar/", "findProductosResponse");
    private final static QName _GetProductoResponse_QNAME = new QName("http://ws.educacionit.com.ar/", "getProductoResponse");
    private final static QName _CreateProducto_QNAME = new QName("http://ws.educacionit.com.ar/", "createProducto");
    private final static QName _GetProducto_QNAME = new QName("http://ws.educacionit.com.ar/", "getProducto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.educacionit.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProducto }
     * 
     */
    public GetProducto createGetProducto() {
        return new GetProducto();
    }

    /**
     * Create an instance of {@link CreateProducto }
     * 
     */
    public CreateProducto createCreateProducto() {
        return new CreateProducto();
    }

    /**
     * Create an instance of {@link FindProductosResponse }
     * 
     */
    public FindProductosResponse createFindProductosResponse() {
        return new FindProductosResponse();
    }

    /**
     * Create an instance of {@link GetProductoResponse }
     * 
     */
    public GetProductoResponse createGetProductoResponse() {
        return new GetProductoResponse();
    }

    /**
     * Create an instance of {@link CreateProductoResponse }
     * 
     */
    public CreateProductoResponse createCreateProductoResponse() {
        return new CreateProductoResponse();
    }

    /**
     * Create an instance of {@link FindProductos }
     * 
     */
    public FindProductos createFindProductos() {
        return new FindProductos();
    }

    /**
     * Create an instance of {@link InternalServerError }
     * 
     */
    public InternalServerError createInternalServerError() {
        return new InternalServerError();
    }

    /**
     * Create an instance of {@link CreateProductoDTO }
     * 
     */
    public CreateProductoDTO createCreateProductoDTO() {
        return new CreateProductoDTO();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternalServerError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "InternalServerError")
    public JAXBElement<InternalServerError> createInternalServerError(InternalServerError value) {
        return new JAXBElement<InternalServerError>(_InternalServerError_QNAME, InternalServerError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "findProductos")
    public JAXBElement<FindProductos> createFindProductos(FindProductos value) {
        return new JAXBElement<FindProductos>(_FindProductos_QNAME, FindProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "createProductoResponse")
    public JAXBElement<CreateProductoResponse> createCreateProductoResponse(CreateProductoResponse value) {
        return new JAXBElement<CreateProductoResponse>(_CreateProductoResponse_QNAME, CreateProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "findProductosResponse")
    public JAXBElement<FindProductosResponse> createFindProductosResponse(FindProductosResponse value) {
        return new JAXBElement<FindProductosResponse>(_FindProductosResponse_QNAME, FindProductosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "getProductoResponse")
    public JAXBElement<GetProductoResponse> createGetProductoResponse(GetProductoResponse value) {
        return new JAXBElement<GetProductoResponse>(_GetProductoResponse_QNAME, GetProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "createProducto")
    public JAXBElement<CreateProducto> createCreateProducto(CreateProducto value) {
        return new JAXBElement<CreateProducto>(_CreateProducto_QNAME, CreateProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "getProducto")
    public JAXBElement<GetProducto> createGetProducto(GetProducto value) {
        return new JAXBElement<GetProducto>(_GetProducto_QNAME, GetProducto.class, null, value);
    }

}
