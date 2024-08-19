
package https.soap_home_erzi_ch.services;

import java.net.URL;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 4.0.0-M4
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "HelloPortService", targetNamespace = "https://soap.home.erzi.ch/services", wsdlLocation = "/wsdl/HelloService.wsdl")
public class HelloPortService
    extends Service
{

    private final static URL HELLOPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOPORTSERVICE_EXCEPTION;
    private final static QName HELLOPORTSERVICE_QNAME = new QName("https://soap.home.erzi.ch/services", "HelloPortService");

    static {
        HELLOPORTSERVICE_WSDL_LOCATION = null;// new URL();//https.soap_home_erzi_ch.services.HelloPortService.class.getResource("/wsdl/HelloService.wsdl");
        WebServiceException e = null;
        if (HELLOPORTSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find '/wsdl/HelloService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        HELLOPORTSERVICE_EXCEPTION = e;
    }

    public HelloPortService() {
        super(__getWsdlLocation(), HELLOPORTSERVICE_QNAME);
    }

    public HelloPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOPORTSERVICE_QNAME, features);
    }

    public HelloPortService(URL wsdlLocation) {
        super(wsdlLocation, HELLOPORTSERVICE_QNAME);
    }

    public HelloPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOPORTSERVICE_QNAME, features);
    }

    public HelloPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloPort
     */
    @WebEndpoint(name = "HelloPortSoap11")
    public HelloPort getHelloPortSoap11() {
        return super.getPort(new QName("https://soap.home.erzi.ch/services", "HelloPortSoap11"), HelloPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloPort
     */
    @WebEndpoint(name = "HelloPortSoap11")
    public HelloPort getHelloPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("https://soap.home.erzi.ch/services", "HelloPortSoap11"), HelloPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOPORTSERVICE_EXCEPTION!= null) {
            throw HELLOPORTSERVICE_EXCEPTION;
        }
        return HELLOPORTSERVICE_WSDL_LOCATION;
    }

}
