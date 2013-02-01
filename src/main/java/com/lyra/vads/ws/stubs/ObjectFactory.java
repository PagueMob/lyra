
package com.lyra.vads.ws.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lyra.vads.ws.stubs package. 
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

    private final static QName _StandardResponseTimestamp_QNAME = new QName("", "timestamp");
    private final static QName _StandardResponseErrorCode_QNAME = new QName("", "errorCode");
    private final static QName _StandardResponseTransactionStatus_QNAME = new QName("", "transactionStatus");
    private final static QName _StandardResponseSignature_QNAME = new QName("", "signature");
    private final static QName _StandardResponseExtendedErrorCode_QNAME = new QName("", "extendedErrorCode");
    private final static QName _TransactionInfoVadsStatus_QNAME = new QName("", "vadsStatus");
    private final static QName _TransactionInfoAuthDevise_QNAME = new QName("", "authDevise");
    private final static QName _TransactionInfoMarkAmount_QNAME = new QName("", "markAmount");
    private final static QName _TransactionInfoCustomerLanguage_QNAME = new QName("", "customerLanguage");
    private final static QName _TransactionInfoVadsEnrolled_QNAME = new QName("", "vadsEnrolled");
    private final static QName _TransactionInfoCustomerCity_QNAME = new QName("", "customerCity");
    private final static QName _TransactionInfoCustomerPhone_QNAME = new QName("", "customerPhone");
    private final static QName _TransactionInfoType_QNAME = new QName("", "type");
    private final static QName _TransactionInfoAuthResult_QNAME = new QName("", "authResult");
    private final static QName _TransactionInfoAmount_QNAME = new QName("", "amount");
    private final static QName _TransactionInfoOrderInfo_QNAME = new QName("", "orderInfo");
    private final static QName _TransactionInfoAuthNb_QNAME = new QName("", "authNb");
    private final static QName _TransactionInfoTransactionCondition_QNAME = new QName("", "transactionCondition");
    private final static QName _TransactionInfoShopId_QNAME = new QName("", "shopId");
    private final static QName _TransactionInfoCustomerCountry_QNAME = new QName("", "customerCountry");
    private final static QName _TransactionInfoContractNumber_QNAME = new QName("", "contractNumber");
    private final static QName _TransactionInfoInitialAmount_QNAME = new QName("", "initialAmount");
    private final static QName _TransactionInfoVadsECI_QNAME = new QName("", "vadsECI");
    private final static QName _TransactionInfoRefundDevise_QNAME = new QName("", "refundDevise");
    private final static QName _TransactionInfoDirectoryServer_QNAME = new QName("", "directoryServer");
    private final static QName _TransactionInfoMarkDate_QNAME = new QName("", "markDate");
    private final static QName _TransactionInfoAuthAmount_QNAME = new QName("", "authAmount");
    private final static QName _TransactionInfoCvDevise_QNAME = new QName("", "cvDevise");
    private final static QName _TransactionInfoCvAmount_QNAME = new QName("", "cvAmount");
    private final static QName _TransactionInfoCardType_QNAME = new QName("", "cardType");
    private final static QName _TransactionInfoWarrantlyResult_QNAME = new QName("", "warrantlyResult");
    private final static QName _TransactionInfoMarkNb_QNAME = new QName("", "markNb");
    private final static QName _TransactionInfoAuthCVV2CVC2_QNAME = new QName("", "authCVV2_CVC2");
    private final static QName _TransactionInfoMarkCVV2CVC2_QNAME = new QName("", "markCVV2_CVC2");
    private final static QName _TransactionInfoCustomerZipCode_QNAME = new QName("", "customerZipCode");
    private final static QName _TransactionInfoCardCountry_QNAME = new QName("", "cardCountry");
    private final static QName _TransactionInfoCustomerMail_QNAME = new QName("", "customerMail");
    private final static QName _TransactionInfoAuthMode_QNAME = new QName("", "authMode");
    private final static QName _TransactionInfoTransactionId_QNAME = new QName("", "transactionId");
    private final static QName _TransactionInfoTransmissionDate_QNAME = new QName("", "transmissionDate");
    private final static QName _TransactionInfoPresentationDate_QNAME = new QName("", "presentationDate");
    private final static QName _TransactionInfoVadsXID_QNAME = new QName("", "vadsXID");
    private final static QName _TransactionInfoMarkDevise_QNAME = new QName("", "markDevise");
    private final static QName _TransactionInfoCustomerIP_QNAME = new QName("", "customerIP");
    private final static QName _TransactionInfoSequenceNb_QNAME = new QName("", "sequenceNb");
    private final static QName _TransactionInfoCustomerId_QNAME = new QName("", "customerId");
    private final static QName _TransactionInfoMarkResult_QNAME = new QName("", "markResult");
    private final static QName _TransactionInfoCtxMode_QNAME = new QName("", "ctxMode");
    private final static QName _TransactionInfoVadsCAVVAlgorithm_QNAME = new QName("", "vadsCAVVAlgorithm");
    private final static QName _TransactionInfoCaptureNumber_QNAME = new QName("", "captureNumber");
    private final static QName _TransactionInfoCaptureDate_QNAME = new QName("", "captureDate");
    private final static QName _TransactionInfoOrderId_QNAME = new QName("", "orderId");
    private final static QName _TransactionInfoCustomerTitle_QNAME = new QName("", "customerTitle");
    private final static QName _TransactionInfoCustomerName_QNAME = new QName("", "customerName");
    private final static QName _TransactionInfoVadsCAVV_QNAME = new QName("", "vadsCAVV");
    private final static QName _TransactionInfoLocalControl_QNAME = new QName("", "localControl");
    private final static QName _TransactionInfoMultiplePaiement_QNAME = new QName("", "multiplePaiement");
    private final static QName _TransactionInfoOrderInfo2_QNAME = new QName("", "orderInfo2");
    private final static QName _TransactionInfoOrderInfo3_QNAME = new QName("", "orderInfo3");
    private final static QName _TransactionInfoCardNetwork_QNAME = new QName("", "cardNetwork");
    private final static QName _TransactionInfoRefoundAmount_QNAME = new QName("", "refoundAmount");
    private final static QName _TransactionInfoRapprochementStatut_QNAME = new QName("", "rapprochementStatut");
    private final static QName _TransactionInfoDevise_QNAME = new QName("", "devise");
    private final static QName _TransactionInfoCustomerAddress_QNAME = new QName("", "customerAddress");
    private final static QName _TransactionInfoCardExpirationDate_QNAME = new QName("", "cardExpirationDate");
    private final static QName _TransactionInfoVadsSignatureValid_QNAME = new QName("", "vadsSignatureValid");
    private final static QName _TransactionInfoAuthDate_QNAME = new QName("", "authDate");
    private final static QName _TransactionInfoPaymentMethod_QNAME = new QName("", "paymentMethod");
    private final static QName _TransactionInfoCardNumber_QNAME = new QName("", "cardNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lyra.vads.ws.stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransactionInfo }
     * 
     */
    public TransactionInfo createTransactionInfo() {
        return new TransactionInfo();
    }

    /**
     * Create an instance of {@link StandardResponse }
     * 
     */
    public StandardResponse createStandardResponse() {
        return new StandardResponse();
    }

    /**
     * Create an instance of {@link CreatePaiementInfo }
     * 
     */
    public CreatePaiementInfo createCreatePaiementInfo() {
        return new CreatePaiementInfo();
    }

    /**
     * Create an instance of {@link ExtInfo }
     * 
     */
    public ExtInfo createExtInfo() {
        return new ExtInfo();
    }

    /**
     * Create an instance of {@link LocalControl }
     * 
     */
    public LocalControl createLocalControl() {
        return new LocalControl();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "timestamp", scope = StandardResponse.class)
    public JAXBElement<Long> createStandardResponseTimestamp(Long value) {
        return new JAXBElement<Long>(_StandardResponseTimestamp_QNAME, Long.class, StandardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "errorCode", scope = StandardResponse.class)
    public JAXBElement<Integer> createStandardResponseErrorCode(Integer value) {
        return new JAXBElement<Integer>(_StandardResponseErrorCode_QNAME, Integer.class, StandardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transactionStatus", scope = StandardResponse.class)
    public JAXBElement<Integer> createStandardResponseTransactionStatus(Integer value) {
        return new JAXBElement<Integer>(_StandardResponseTransactionStatus_QNAME, Integer.class, StandardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "signature", scope = StandardResponse.class)
    public JAXBElement<String> createStandardResponseSignature(String value) {
        return new JAXBElement<String>(_StandardResponseSignature_QNAME, String.class, StandardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "extendedErrorCode", scope = StandardResponse.class)
    public JAXBElement<String> createStandardResponseExtendedErrorCode(String value) {
        return new JAXBElement<String>(_StandardResponseExtendedErrorCode_QNAME, String.class, StandardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vadsStatus", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoVadsStatus(String value) {
        return new JAXBElement<String>(_TransactionInfoVadsStatus_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "authDevise", scope = TransactionInfo.class)
    public JAXBElement<Integer> createTransactionInfoAuthDevise(Integer value) {
        return new JAXBElement<Integer>(_TransactionInfoAuthDevise_QNAME, Integer.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "markAmount", scope = TransactionInfo.class)
    public JAXBElement<Long> createTransactionInfoMarkAmount(Long value) {
        return new JAXBElement<Long>(_TransactionInfoMarkAmount_QNAME, Long.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customerLanguage", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoCustomerLanguage(String value) {
        return new JAXBElement<String>(_TransactionInfoCustomerLanguage_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vadsEnrolled", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoVadsEnrolled(String value) {
        return new JAXBElement<String>(_TransactionInfoVadsEnrolled_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customerCity", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoCustomerCity(String value) {
        return new JAXBElement<String>(_TransactionInfoCustomerCity_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customerPhone", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoCustomerPhone(String value) {
        return new JAXBElement<String>(_TransactionInfoCustomerPhone_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = TransactionInfo.class)
    public JAXBElement<Integer> createTransactionInfoType(Integer value) {
        return new JAXBElement<Integer>(_TransactionInfoType_QNAME, Integer.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "authResult", scope = TransactionInfo.class)
    public JAXBElement<Integer> createTransactionInfoAuthResult(Integer value) {
        return new JAXBElement<Integer>(_TransactionInfoAuthResult_QNAME, Integer.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "amount", scope = TransactionInfo.class)
    public JAXBElement<Long> createTransactionInfoAmount(Long value) {
        return new JAXBElement<Long>(_TransactionInfoAmount_QNAME, Long.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "orderInfo", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoOrderInfo(String value) {
        return new JAXBElement<String>(_TransactionInfoOrderInfo_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "authNb", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoAuthNb(String value) {
        return new JAXBElement<String>(_TransactionInfoAuthNb_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transactionCondition", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoTransactionCondition(String value) {
        return new JAXBElement<String>(_TransactionInfoTransactionCondition_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "shopId", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoShopId(String value) {
        return new JAXBElement<String>(_TransactionInfoShopId_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customerCountry", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoCustomerCountry(String value) {
        return new JAXBElement<String>(_TransactionInfoCustomerCountry_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "signature", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoSignature(String value) {
        return new JAXBElement<String>(_StandardResponseSignature_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "contractNumber", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoContractNumber(String value) {
        return new JAXBElement<String>(_TransactionInfoContractNumber_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "extendedErrorCode", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoExtendedErrorCode(String value) {
        return new JAXBElement<String>(_StandardResponseExtendedErrorCode_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "initialAmount", scope = TransactionInfo.class)
    public JAXBElement<Long> createTransactionInfoInitialAmount(Long value) {
        return new JAXBElement<Long>(_TransactionInfoInitialAmount_QNAME, Long.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vadsECI", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoVadsECI(String value) {
        return new JAXBElement<String>(_TransactionInfoVadsECI_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "refundDevise", scope = TransactionInfo.class)
    public JAXBElement<Integer> createTransactionInfoRefundDevise(Integer value) {
        return new JAXBElement<Integer>(_TransactionInfoRefundDevise_QNAME, Integer.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "directoryServer", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoDirectoryServer(String value) {
        return new JAXBElement<String>(_TransactionInfoDirectoryServer_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "markDate", scope = TransactionInfo.class)
    public JAXBElement<XMLGregorianCalendar> createTransactionInfoMarkDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransactionInfoMarkDate_QNAME, XMLGregorianCalendar.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "authAmount", scope = TransactionInfo.class)
    public JAXBElement<Long> createTransactionInfoAuthAmount(Long value) {
        return new JAXBElement<Long>(_TransactionInfoAuthAmount_QNAME, Long.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cvDevise", scope = TransactionInfo.class)
    public JAXBElement<Integer> createTransactionInfoCvDevise(Integer value) {
        return new JAXBElement<Integer>(_TransactionInfoCvDevise_QNAME, Integer.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cvAmount", scope = TransactionInfo.class)
    public JAXBElement<Long> createTransactionInfoCvAmount(Long value) {
        return new JAXBElement<Long>(_TransactionInfoCvAmount_QNAME, Long.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cardType", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoCardType(String value) {
        return new JAXBElement<String>(_TransactionInfoCardType_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "warrantlyResult", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoWarrantlyResult(String value) {
        return new JAXBElement<String>(_TransactionInfoWarrantlyResult_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "markNb", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoMarkNb(String value) {
        return new JAXBElement<String>(_TransactionInfoMarkNb_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "authCVV2_CVC2", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoAuthCVV2CVC2(String value) {
        return new JAXBElement<String>(_TransactionInfoAuthCVV2CVC2_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "markCVV2_CVC2", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoMarkCVV2CVC2(String value) {
        return new JAXBElement<String>(_TransactionInfoMarkCVV2CVC2_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customerZipCode", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoCustomerZipCode(String value) {
        return new JAXBElement<String>(_TransactionInfoCustomerZipCode_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cardCountry", scope = TransactionInfo.class)
    public JAXBElement<Long> createTransactionInfoCardCountry(Long value) {
        return new JAXBElement<Long>(_TransactionInfoCardCountry_QNAME, Long.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customerMail", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoCustomerMail(String value) {
        return new JAXBElement<String>(_TransactionInfoCustomerMail_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "authMode", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoAuthMode(String value) {
        return new JAXBElement<String>(_TransactionInfoAuthMode_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transactionId", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoTransactionId(String value) {
        return new JAXBElement<String>(_TransactionInfoTransactionId_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transmissionDate", scope = TransactionInfo.class)
    public JAXBElement<XMLGregorianCalendar> createTransactionInfoTransmissionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransactionInfoTransmissionDate_QNAME, XMLGregorianCalendar.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "presentationDate", scope = TransactionInfo.class)
    public JAXBElement<XMLGregorianCalendar> createTransactionInfoPresentationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransactionInfoPresentationDate_QNAME, XMLGregorianCalendar.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vadsXID", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoVadsXID(String value) {
        return new JAXBElement<String>(_TransactionInfoVadsXID_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "markDevise", scope = TransactionInfo.class)
    public JAXBElement<Integer> createTransactionInfoMarkDevise(Integer value) {
        return new JAXBElement<Integer>(_TransactionInfoMarkDevise_QNAME, Integer.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customerIP", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoCustomerIP(String value) {
        return new JAXBElement<String>(_TransactionInfoCustomerIP_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sequenceNb", scope = TransactionInfo.class)
    public JAXBElement<Integer> createTransactionInfoSequenceNb(Integer value) {
        return new JAXBElement<Integer>(_TransactionInfoSequenceNb_QNAME, Integer.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "timestamp", scope = TransactionInfo.class)
    public JAXBElement<Long> createTransactionInfoTimestamp(Long value) {
        return new JAXBElement<Long>(_StandardResponseTimestamp_QNAME, Long.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customerId", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoCustomerId(String value) {
        return new JAXBElement<String>(_TransactionInfoCustomerId_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "markResult", scope = TransactionInfo.class)
    public JAXBElement<Integer> createTransactionInfoMarkResult(Integer value) {
        return new JAXBElement<Integer>(_TransactionInfoMarkResult_QNAME, Integer.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ctxMode", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoCtxMode(String value) {
        return new JAXBElement<String>(_TransactionInfoCtxMode_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vadsCAVVAlgorithm", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoVadsCAVVAlgorithm(String value) {
        return new JAXBElement<String>(_TransactionInfoVadsCAVVAlgorithm_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "captureNumber", scope = TransactionInfo.class)
    public JAXBElement<Integer> createTransactionInfoCaptureNumber(Integer value) {
        return new JAXBElement<Integer>(_TransactionInfoCaptureNumber_QNAME, Integer.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "captureDate", scope = TransactionInfo.class)
    public JAXBElement<XMLGregorianCalendar> createTransactionInfoCaptureDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransactionInfoCaptureDate_QNAME, XMLGregorianCalendar.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transactionStatus", scope = TransactionInfo.class)
    public JAXBElement<Integer> createTransactionInfoTransactionStatus(Integer value) {
        return new JAXBElement<Integer>(_StandardResponseTransactionStatus_QNAME, Integer.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "orderId", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoOrderId(String value) {
        return new JAXBElement<String>(_TransactionInfoOrderId_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customerTitle", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoCustomerTitle(String value) {
        return new JAXBElement<String>(_TransactionInfoCustomerTitle_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customerName", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoCustomerName(String value) {
        return new JAXBElement<String>(_TransactionInfoCustomerName_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vadsCAVV", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoVadsCAVV(String value) {
        return new JAXBElement<String>(_TransactionInfoVadsCAVV_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "localControl", scope = TransactionInfo.class)
    public JAXBElement<LocalControl> createTransactionInfoLocalControl(LocalControl value) {
        return new JAXBElement<LocalControl>(_TransactionInfoLocalControl_QNAME, LocalControl.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "multiplePaiement", scope = TransactionInfo.class)
    public JAXBElement<Integer> createTransactionInfoMultiplePaiement(Integer value) {
        return new JAXBElement<Integer>(_TransactionInfoMultiplePaiement_QNAME, Integer.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "orderInfo2", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoOrderInfo2(String value) {
        return new JAXBElement<String>(_TransactionInfoOrderInfo2_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "orderInfo3", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoOrderInfo3(String value) {
        return new JAXBElement<String>(_TransactionInfoOrderInfo3_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cardNetwork", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoCardNetwork(String value) {
        return new JAXBElement<String>(_TransactionInfoCardNetwork_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "refoundAmount", scope = TransactionInfo.class)
    public JAXBElement<Long> createTransactionInfoRefoundAmount(Long value) {
        return new JAXBElement<Long>(_TransactionInfoRefoundAmount_QNAME, Long.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rapprochementStatut", scope = TransactionInfo.class)
    public JAXBElement<Integer> createTransactionInfoRapprochementStatut(Integer value) {
        return new JAXBElement<Integer>(_TransactionInfoRapprochementStatut_QNAME, Integer.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "devise", scope = TransactionInfo.class)
    public JAXBElement<Integer> createTransactionInfoDevise(Integer value) {
        return new JAXBElement<Integer>(_TransactionInfoDevise_QNAME, Integer.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "errorCode", scope = TransactionInfo.class)
    public JAXBElement<Integer> createTransactionInfoErrorCode(Integer value) {
        return new JAXBElement<Integer>(_StandardResponseErrorCode_QNAME, Integer.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customerAddress", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoCustomerAddress(String value) {
        return new JAXBElement<String>(_TransactionInfoCustomerAddress_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cardExpirationDate", scope = TransactionInfo.class)
    public JAXBElement<XMLGregorianCalendar> createTransactionInfoCardExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransactionInfoCardExpirationDate_QNAME, XMLGregorianCalendar.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vadsSignatureValid", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoVadsSignatureValid(String value) {
        return new JAXBElement<String>(_TransactionInfoVadsSignatureValid_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "authDate", scope = TransactionInfo.class)
    public JAXBElement<XMLGregorianCalendar> createTransactionInfoAuthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransactionInfoAuthDate_QNAME, XMLGregorianCalendar.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "paymentMethod", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoPaymentMethod(String value) {
        return new JAXBElement<String>(_TransactionInfoPaymentMethod_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cardNumber", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoCardNumber(String value) {
        return new JAXBElement<String>(_TransactionInfoCardNumber_QNAME, String.class, TransactionInfo.class, value);
    }

}
