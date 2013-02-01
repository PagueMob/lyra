
package com.lyra.vads.ws.stubs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for transactionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v2.ws.vads.lyra.com/}abstractTransactionInfo">
 *       &lt;sequence>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="extendedErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shopId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderInfo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderInfo3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transmissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sequenceNb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="initialAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="devise" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cvAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cvDevise" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="presentationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="multiplePaiement" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ctxMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNetwork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCountry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cardExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vadsEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vadsStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vadsECI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vadsXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vadsCAVVAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vadsCAVV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vadsSignatureValid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directoryServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="markDevise" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="markDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="markNb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="markCVV2_CVC2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="authDevise" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="authDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="authNb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="authCVV2_CVC2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warrantlyResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localControl" type="{http://v2.ws.vads.lyra.com/}localControl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="captureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="captureNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rapprochementStatut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refoundAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="refundDevise" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionInfo", propOrder = {
    "rest"
})
public class TransactionInfo
    extends AbstractTransactionInfo
{

    @XmlElementRefs({
        @XmlElementRef(name = "type", type = JAXBElement.class),
        @XmlElementRef(name = "contractNumber", type = JAXBElement.class),
        @XmlElementRef(name = "devise", type = JAXBElement.class),
        @XmlElementRef(name = "vadsSignatureValid", type = JAXBElement.class),
        @XmlElementRef(name = "customerPhone", type = JAXBElement.class),
        @XmlElementRef(name = "customerIP", type = JAXBElement.class),
        @XmlElementRef(name = "captureDate", type = JAXBElement.class),
        @XmlElementRef(name = "paymentMethod", type = JAXBElement.class),
        @XmlElementRef(name = "cvDevise", type = JAXBElement.class),
        @XmlElementRef(name = "authNb", type = JAXBElement.class),
        @XmlElementRef(name = "markResult", type = JAXBElement.class),
        @XmlElementRef(name = "customerId", type = JAXBElement.class),
        @XmlElementRef(name = "localControl", type = JAXBElement.class),
        @XmlElementRef(name = "customerName", type = JAXBElement.class),
        @XmlElementRef(name = "extendedErrorCode", type = JAXBElement.class),
        @XmlElementRef(name = "directoryServer", type = JAXBElement.class),
        @XmlElementRef(name = "refundDevise", type = JAXBElement.class),
        @XmlElementRef(name = "transactionCondition", type = JAXBElement.class),
        @XmlElementRef(name = "signature", type = JAXBElement.class),
        @XmlElementRef(name = "rapprochementStatut", type = JAXBElement.class),
        @XmlElementRef(name = "multiplePaiement", type = JAXBElement.class),
        @XmlElementRef(name = "authCVV2_CVC2", type = JAXBElement.class),
        @XmlElementRef(name = "orderId", type = JAXBElement.class),
        @XmlElementRef(name = "customerAddress", type = JAXBElement.class),
        @XmlElementRef(name = "customerLanguage", type = JAXBElement.class),
        @XmlElementRef(name = "cardNetwork", type = JAXBElement.class),
        @XmlElementRef(name = "authDate", type = JAXBElement.class),
        @XmlElementRef(name = "authAmount", type = JAXBElement.class),
        @XmlElementRef(name = "vadsEnrolled", type = JAXBElement.class),
        @XmlElementRef(name = "vadsCAVV", type = JAXBElement.class),
        @XmlElementRef(name = "markNb", type = JAXBElement.class),
        @XmlElementRef(name = "cardNumber", type = JAXBElement.class),
        @XmlElementRef(name = "initialAmount", type = JAXBElement.class),
        @XmlElementRef(name = "markDevise", type = JAXBElement.class),
        @XmlElementRef(name = "orderInfo3", type = JAXBElement.class),
        @XmlElementRef(name = "customerZipCode", type = JAXBElement.class),
        @XmlElementRef(name = "shopId", type = JAXBElement.class),
        @XmlElementRef(name = "customerCountry", type = JAXBElement.class),
        @XmlElementRef(name = "cardType", type = JAXBElement.class),
        @XmlElementRef(name = "vadsStatus", type = JAXBElement.class),
        @XmlElementRef(name = "authMode", type = JAXBElement.class),
        @XmlElementRef(name = "orderInfo2", type = JAXBElement.class),
        @XmlElementRef(name = "vadsCAVVAlgorithm", type = JAXBElement.class),
        @XmlElementRef(name = "ctxMode", type = JAXBElement.class),
        @XmlElementRef(name = "markDate", type = JAXBElement.class),
        @XmlElementRef(name = "amount", type = JAXBElement.class),
        @XmlElementRef(name = "transactionStatus", type = JAXBElement.class),
        @XmlElementRef(name = "customerTitle", type = JAXBElement.class),
        @XmlElementRef(name = "errorCode", type = JAXBElement.class),
        @XmlElementRef(name = "markAmount", type = JAXBElement.class),
        @XmlElementRef(name = "transactionId", type = JAXBElement.class),
        @XmlElementRef(name = "sequenceNb", type = JAXBElement.class),
        @XmlElementRef(name = "customerMail", type = JAXBElement.class),
        @XmlElementRef(name = "cvAmount", type = JAXBElement.class),
        @XmlElementRef(name = "transmissionDate", type = JAXBElement.class),
        @XmlElementRef(name = "captureNumber", type = JAXBElement.class),
        @XmlElementRef(name = "cardExpirationDate", type = JAXBElement.class),
        @XmlElementRef(name = "refoundAmount", type = JAXBElement.class),
        @XmlElementRef(name = "warrantlyResult", type = JAXBElement.class),
        @XmlElementRef(name = "vadsECI", type = JAXBElement.class),
        @XmlElementRef(name = "authResult", type = JAXBElement.class),
        @XmlElementRef(name = "timestamp", type = JAXBElement.class),
        @XmlElementRef(name = "customerCity", type = JAXBElement.class),
        @XmlElementRef(name = "orderInfo", type = JAXBElement.class),
        @XmlElementRef(name = "presentationDate", type = JAXBElement.class),
        @XmlElementRef(name = "authDevise", type = JAXBElement.class),
        @XmlElementRef(name = "markCVV2_CVC2", type = JAXBElement.class),
        @XmlElementRef(name = "vadsXID", type = JAXBElement.class),
        @XmlElementRef(name = "cardCountry", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "ErrorCode" is used by two different parts of a schema. See: 
     * line 30 of file:/Users/dirceu/Documents/wsdl/v2.xml
     * line 135 of file:/Users/dirceu/Documents/wsdl/v2.xml
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalControl }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
