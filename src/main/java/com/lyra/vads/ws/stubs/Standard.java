package com.lyra.vads.ws.stubs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.2
 * 2013-01-10T14:38:30.292-02:00
 * Generated source version: 2.7.2
 * 
 */
@WebService(targetNamespace = "http://v2.ws.vads.lyra.com/", name = "Standard")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Standard {

    @WebResult(name = "return", targetNamespace = "http://v2.ws.vads.lyra.com/", partName = "return")
    @WebMethod
    public StandardResponse force(
        @WebParam(partName = "shopId", name = "shopId")
        java.lang.String shopId,
        @WebParam(partName = "transmissionDate", name = "transmissionDate")
        javax.xml.datatype.XMLGregorianCalendar transmissionDate,
        @WebParam(partName = "transactionId", name = "transactionId")
        java.lang.String transactionId,
        @WebParam(partName = "sequenceNb", name = "sequenceNb")
        int sequenceNb,
        @WebParam(partName = "ctxMode", name = "ctxMode")
        java.lang.String ctxMode,
        @WebParam(partName = "autorisationNb", name = "autorisationNb")
        java.lang.String autorisationNb,
        @WebParam(partName = "autorisationDate", name = "autorisationDate")
        javax.xml.datatype.XMLGregorianCalendar autorisationDate,
        @WebParam(partName = "comment", name = "comment")
        java.lang.String comment,
        @WebParam(partName = "wsSignature", name = "wsSignature")
        java.lang.String wsSignature
    );

    @WebResult(name = "return", targetNamespace = "http://v2.ws.vads.lyra.com/", partName = "return")
    @WebMethod
    public TransactionInfo refund(
        @WebParam(partName = "shopId", name = "shopId")
        java.lang.String shopId,
        @WebParam(partName = "transmissionDate", name = "transmissionDate")
        javax.xml.datatype.XMLGregorianCalendar transmissionDate,
        @WebParam(partName = "transactionId", name = "transactionId")
        java.lang.String transactionId,
        @WebParam(partName = "sequenceNb", name = "sequenceNb")
        int sequenceNb,
        @WebParam(partName = "ctxMode", name = "ctxMode")
        java.lang.String ctxMode,
        @WebParam(partName = "newTransactionId", name = "newTransactionId")
        java.lang.String newTransactionId,
        @WebParam(partName = "amount", name = "amount")
        long amount,
        @WebParam(partName = "devise", name = "devise")
        int devise,
        @WebParam(partName = "presentationDate", name = "presentationDate")
        javax.xml.datatype.XMLGregorianCalendar presentationDate,
        @WebParam(partName = "validationMode", name = "validationMode")
        int validationMode,
        @WebParam(partName = "comment", name = "comment")
        java.lang.String comment,
        @WebParam(partName = "wsSignature", name = "wsSignature")
        java.lang.String wsSignature
    );

    @WebResult(name = "return", targetNamespace = "http://v2.ws.vads.lyra.com/", partName = "return")
    @WebMethod
    public TransactionInfo duplicate(
        @WebParam(partName = "shopId", name = "shopId")
        java.lang.String shopId,
        @WebParam(partName = "transmissionDate", name = "transmissionDate")
        javax.xml.datatype.XMLGregorianCalendar transmissionDate,
        @WebParam(partName = "transactionId", name = "transactionId")
        java.lang.String transactionId,
        @WebParam(partName = "sequenceNb", name = "sequenceNb")
        int sequenceNb,
        @WebParam(partName = "ctxMode", name = "ctxMode")
        java.lang.String ctxMode,
        @WebParam(partName = "orderId", name = "orderId")
        java.lang.String orderId,
        @WebParam(partName = "orderInfo", name = "orderInfo")
        java.lang.String orderInfo,
        @WebParam(partName = "orderInfo2", name = "orderInfo2")
        java.lang.String orderInfo2,
        @WebParam(partName = "orderInfo3", name = "orderInfo3")
        java.lang.String orderInfo3,
        @WebParam(partName = "amount", name = "amount")
        long amount,
        @WebParam(partName = "devise", name = "devise")
        int devise,
        @WebParam(partName = "newTransactionId", name = "newTransactionId")
        java.lang.String newTransactionId,
        @WebParam(partName = "presentationDate", name = "presentationDate")
        javax.xml.datatype.XMLGregorianCalendar presentationDate,
        @WebParam(partName = "validationMode", name = "validationMode")
        int validationMode,
        @WebParam(partName = "comment", name = "comment")
        java.lang.String comment,
        @WebParam(partName = "wsSignature", name = "wsSignature")
        java.lang.String wsSignature
    );

    @WebResult(name = "return", targetNamespace = "http://v2.ws.vads.lyra.com/", partName = "return")
    @WebMethod
    public StandardResponse validate(
        @WebParam(partName = "shopId", name = "shopId")
        java.lang.String shopId,
        @WebParam(partName = "transmissionDate", name = "transmissionDate")
        javax.xml.datatype.XMLGregorianCalendar transmissionDate,
        @WebParam(partName = "transactionId", name = "transactionId")
        java.lang.String transactionId,
        @WebParam(partName = "sequenceNb", name = "sequenceNb")
        int sequenceNb,
        @WebParam(partName = "ctxMode", name = "ctxMode")
        java.lang.String ctxMode,
        @WebParam(partName = "comment", name = "comment")
        java.lang.String comment,
        @WebParam(partName = "wsSignature", name = "wsSignature")
        java.lang.String wsSignature
    );

    @WebResult(name = "return", targetNamespace = "http://v2.ws.vads.lyra.com/", partName = "return")
    @WebMethod
    public TransactionInfo create(
        @WebParam(partName = "createInfo", name = "createInfo")
        CreatePaiementInfo createInfo,
        @WebParam(partName = "wsSignature", name = "wsSignature")
        java.lang.String wsSignature
    );

    @WebResult(name = "return", targetNamespace = "http://v2.ws.vads.lyra.com/", partName = "return")
    @WebMethod
    public StandardResponse modify(
        @WebParam(partName = "shopId", name = "shopId")
        java.lang.String shopId,
        @WebParam(partName = "transmissionDate", name = "transmissionDate")
        javax.xml.datatype.XMLGregorianCalendar transmissionDate,
        @WebParam(partName = "transactionId", name = "transactionId")
        java.lang.String transactionId,
        @WebParam(partName = "sequenceNb", name = "sequenceNb")
        int sequenceNb,
        @WebParam(partName = "ctxMode", name = "ctxMode")
        java.lang.String ctxMode,
        @WebParam(partName = "amount", name = "amount")
        long amount,
        @WebParam(partName = "devise", name = "devise")
        int devise,
        @WebParam(partName = "remiseDate", name = "remiseDate")
        javax.xml.datatype.XMLGregorianCalendar remiseDate,
        @WebParam(partName = "comment", name = "comment")
        java.lang.String comment,
        @WebParam(partName = "wsSignature", name = "wsSignature")
        java.lang.String wsSignature
    );

    @WebResult(name = "return", targetNamespace = "http://v2.ws.vads.lyra.com/", partName = "return")
    @WebMethod
    public TransactionInfo getInfo(
        @WebParam(partName = "shopId", name = "shopId")
        java.lang.String shopId,
        @WebParam(partName = "transmissionDate", name = "transmissionDate")
        javax.xml.datatype.XMLGregorianCalendar transmissionDate,
        @WebParam(partName = "transactionId", name = "transactionId")
        java.lang.String transactionId,
        @WebParam(partName = "sequenceNb", name = "sequenceNb")
        int sequenceNb,
        @WebParam(partName = "ctxMode", name = "ctxMode")
        java.lang.String ctxMode,
        @WebParam(partName = "wsSignature", name = "wsSignature")
        java.lang.String wsSignature
    );

    @WebResult(name = "return", targetNamespace = "http://v2.ws.vads.lyra.com/", partName = "return")
    @WebMethod
    public StandardResponse cancel(
        @WebParam(partName = "shopId", name = "shopId")
        java.lang.String shopId,
        @WebParam(partName = "transmissionDate", name = "transmissionDate")
        javax.xml.datatype.XMLGregorianCalendar transmissionDate,
        @WebParam(partName = "transactionId", name = "transactionId")
        java.lang.String transactionId,
        @WebParam(partName = "sequenceNb", name = "sequenceNb")
        int sequenceNb,
        @WebParam(partName = "ctxMode", name = "ctxMode")
        java.lang.String ctxMode,
        @WebParam(partName = "comment", name = "comment")
        java.lang.String comment,
        @WebParam(partName = "wsSignature", name = "wsSignature")
        java.lang.String wsSignature
    );
}
