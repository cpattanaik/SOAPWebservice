
package com.handisala.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.handisala.stub package. 
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

    private final static QName _PostReciepe_QNAME = new QName("http://webservice.handisala.com", "postReciepe");
    private final static QName _PostReciepeResponse_QNAME = new QName("http://webservice.handisala.com", "postReciepeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.handisala.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostReciepeResponse }
     * 
     */
    public PostReciepeResponse createPostReciepeResponse() {
        return new PostReciepeResponse();
    }

    /**
     * Create an instance of {@link PostReciepe }
     * 
     */
    public PostReciepe createPostReciepe() {
        return new PostReciepe();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostReciepe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.handisala.com", name = "postReciepe")
    public JAXBElement<PostReciepe> createPostReciepe(PostReciepe value) {
        return new JAXBElement<PostReciepe>(_PostReciepe_QNAME, PostReciepe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostReciepeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.handisala.com", name = "postReciepeResponse")
    public JAXBElement<PostReciepeResponse> createPostReciepeResponse(PostReciepeResponse value) {
        return new JAXBElement<PostReciepeResponse>(_PostReciepeResponse_QNAME, PostReciepeResponse.class, null, value);
    }

}
