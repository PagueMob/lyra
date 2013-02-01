package com.lyra.vads.ws.stubs;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.2
 * 2013-01-10T14:38:30.380-02:00
 * Generated source version: 2.7.2
 * 
 */
@WebServiceClient(name = "StandardWS", 
                  wsdlLocation = "v2.xml",
                  targetNamespace = "http://v2.ws.vads.lyra.com/") 
public class StandardWS extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://v2.ws.vads.lyra.com/", "StandardWS");
    public final static QName StandardBeanPort = new QName("http://v2.ws.vads.lyra.com/", "StandardBeanPort");
    static {
        URL url = StandardWS.class.getResource("v2.xml");
        if (url == null) {
            java.util.logging.Logger.getLogger(StandardWS.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "v2.xml");
        }       
        WSDL_LOCATION = url;
    }

    public StandardWS(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public StandardWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StandardWS() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns Standard
     */
    @WebEndpoint(name = "StandardBeanPort")
    public Standard getStandardBeanPort() {
        return super.getPort(StandardBeanPort, Standard.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Standard
     */
    @WebEndpoint(name = "StandardBeanPort")
    public Standard getStandardBeanPort(WebServiceFeature... features) {
        return super.getPort(StandardBeanPort, Standard.class, features);
    }

}