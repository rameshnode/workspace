
package de.unitymedia.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.unitymedia.webservice package. 
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

    private final static QName _ApplicationId_QNAME = new QName("http://webservice.unitymedia.de/xsd", "applicationId");
    private final static QName _RequestStateId_QNAME = new QName("http://webservice.unitymedia.de/xsd", "stateId");
    private final static QName _RequestCustomerId_QNAME = new QName("http://webservice.unitymedia.de/xsd", "customerId");
    private final static QName _RequestDataEncoding_QNAME = new QName("http://webservice.unitymedia.de/xsd", "dataEncoding");
    private final static QName _RequestData_QNAME = new QName("http://webservice.unitymedia.de/xsd", "data");
    private final static QName _GetOptInCorrespondenciesResultResultMsg_QNAME = new QName("http://webservice.unitymedia.de/xsd", "resultMsg");
    private final static QName _ResponseMimeType_QNAME = new QName("http://webservice.unitymedia.de/xsd", "mimeType");
    private final static QName _LookupPairDisplay_QNAME = new QName("http://webservice.unitymedia.de/xsd", "display");
    private final static QName _LookupPairValue_QNAME = new QName("http://webservice.unitymedia.de/xsd", "value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.unitymedia.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDocumentResponse }
     * 
     */
    public GetDocumentResponse createGetDocumentResponse() {
        return new GetDocumentResponse();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link GetCorrespondencyDocumentsCountResponse }
     * 
     */
    public GetCorrespondencyDocumentsCountResponse createGetCorrespondencyDocumentsCountResponse() {
        return new GetCorrespondencyDocumentsCountResponse();
    }

    /**
     * Create an instance of {@link UnlockDocument }
     * 
     */
    public UnlockDocument createUnlockDocument() {
        return new UnlockDocument();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link UpdateOptInCorrespondenciesParameter }
     * 
     */
    public UpdateOptInCorrespondenciesParameter createUpdateOptInCorrespondenciesParameter() {
        return new UpdateOptInCorrespondenciesParameter();
    }

    /**
     * Create an instance of {@link PriorityLookupResponse }
     * 
     */
    public PriorityLookupResponse createPriorityLookupResponse() {
        return new PriorityLookupResponse();
    }

    /**
     * Create an instance of {@link LookupPair }
     * 
     */
    public LookupPair createLookupPair() {
        return new LookupPair();
    }

    /**
     * Create an instance of {@link RequestDocumentDuplicateResponse }
     * 
     */
    public RequestDocumentDuplicateResponse createRequestDocumentDuplicateResponse() {
        return new RequestDocumentDuplicateResponse();
    }

    /**
     * Create an instance of {@link GetOptInCorrespondenciesResult }
     * 
     */
    public GetOptInCorrespondenciesResult createGetOptInCorrespondenciesResult() {
        return new GetOptInCorrespondenciesResult();
    }

    /**
     * Create an instance of {@link GetDocumentAuditTrailResponse }
     * 
     */
    public GetDocumentAuditTrailResponse createGetDocumentAuditTrailResponse() {
        return new GetDocumentAuditTrailResponse();
    }

    /**
     * Create an instance of {@link GetVersionResponse }
     * 
     */
    public GetVersionResponse createGetVersionResponse() {
        return new GetVersionResponse();
    }

    /**
     * Create an instance of {@link GetDocument }
     * 
     */
    public GetDocument createGetDocument() {
        return new GetDocument();
    }

    /**
     * Create an instance of {@link GetCorrespondencyDocumentsWithLockResponse }
     * 
     */
    public GetCorrespondencyDocumentsWithLockResponse createGetCorrespondencyDocumentsWithLockResponse() {
        return new GetCorrespondencyDocumentsWithLockResponse();
    }

    /**
     * Create an instance of {@link ProductLookup }
     * 
     */
    public ProductLookup createProductLookup() {
        return new ProductLookup();
    }

    /**
     * Create an instance of {@link GetCorrespondencyDocuments }
     * 
     */
    public GetCorrespondencyDocuments createGetCorrespondencyDocuments() {
        return new GetCorrespondencyDocuments();
    }

    /**
     * Create an instance of {@link LockDocument }
     * 
     */
    public LockDocument createLockDocument() {
        return new LockDocument();
    }

    /**
     * Create an instance of {@link GetOrdersResponse }
     * 
     */
    public GetOrdersResponse createGetOrdersResponse() {
        return new GetOrdersResponse();
    }

    /**
     * Create an instance of {@link StateLookup }
     * 
     */
    public StateLookup createStateLookup() {
        return new StateLookup();
    }

    /**
     * Create an instance of {@link CloseActivities }
     * 
     */
    public CloseActivities createCloseActivities() {
        return new CloseActivities();
    }

    /**
     * Create an instance of {@link StateLookupResponse }
     * 
     */
    public StateLookupResponse createStateLookupResponse() {
        return new StateLookupResponse();
    }

    /**
     * Create an instance of {@link GetCorrespondencyDocumentsCount }
     * 
     */
    public GetCorrespondencyDocumentsCount createGetCorrespondencyDocumentsCount() {
        return new GetCorrespondencyDocumentsCount();
    }

    /**
     * Create an instance of {@link UnlockDocumentResponse }
     * 
     */
    public UnlockDocumentResponse createUnlockDocumentResponse() {
        return new UnlockDocumentResponse();
    }

    /**
     * Create an instance of {@link ChangeDocumentsResponse }
     * 
     */
    public ChangeDocumentsResponse createChangeDocumentsResponse() {
        return new ChangeDocumentsResponse();
    }

    /**
     * Create an instance of {@link TypeLookupResponse }
     * 
     */
    public TypeLookupResponse createTypeLookupResponse() {
        return new TypeLookupResponse();
    }

    /**
     * Create an instance of {@link GetOptInCorrespondenciesParameter }
     * 
     */
    public GetOptInCorrespondenciesParameter createGetOptInCorrespondenciesParameter() {
        return new GetOptInCorrespondenciesParameter();
    }

    /**
     * Create an instance of {@link GetInboxDocumentsResponse }
     * 
     */
    public GetInboxDocumentsResponse createGetInboxDocumentsResponse() {
        return new GetInboxDocumentsResponse();
    }

    /**
     * Create an instance of {@link RequestDocumentDuplicate }
     * 
     */
    public RequestDocumentDuplicate createRequestDocumentDuplicate() {
        return new RequestDocumentDuplicate();
    }

    /**
     * Create an instance of {@link GetAllDocuments }
     * 
     */
    public GetAllDocuments createGetAllDocuments() {
        return new GetAllDocuments();
    }

    /**
     * Create an instance of {@link GetAllDocumentsResponse }
     * 
     */
    public GetAllDocumentsResponse createGetAllDocumentsResponse() {
        return new GetAllDocumentsResponse();
    }

    /**
     * Create an instance of {@link ProductLookupResponse }
     * 
     */
    public ProductLookupResponse createProductLookupResponse() {
        return new ProductLookupResponse();
    }

    /**
     * Create an instance of {@link GetOrders }
     * 
     */
    public GetOrders createGetOrders() {
        return new GetOrders();
    }

    /**
     * Create an instance of {@link GetServiceProviderResponse }
     * 
     */
    public GetServiceProviderResponse createGetServiceProviderResponse() {
        return new GetServiceProviderResponse();
    }

    /**
     * Create an instance of {@link TypeLookup }
     * 
     */
    public TypeLookup createTypeLookup() {
        return new TypeLookup();
    }

    /**
     * Create an instance of {@link PriorityLookup }
     * 
     */
    public PriorityLookup createPriorityLookup() {
        return new PriorityLookup();
    }

    /**
     * Create an instance of {@link GetCorrespondencyDocumentsResponse }
     * 
     */
    public GetCorrespondencyDocumentsResponse createGetCorrespondencyDocumentsResponse() {
        return new GetCorrespondencyDocumentsResponse();
    }

    /**
     * Create an instance of {@link GetInboxDocuments }
     * 
     */
    public GetInboxDocuments createGetInboxDocuments() {
        return new GetInboxDocuments();
    }

    /**
     * Create an instance of {@link CloseActivitiesResponse }
     * 
     */
    public CloseActivitiesResponse createCloseActivitiesResponse() {
        return new CloseActivitiesResponse();
    }

    /**
     * Create an instance of {@link GetCorrespondencyDocumentsWithLock }
     * 
     */
    public GetCorrespondencyDocumentsWithLock createGetCorrespondencyDocumentsWithLock() {
        return new GetCorrespondencyDocumentsWithLock();
    }

    /**
     * Create an instance of {@link ChangeDocuments }
     * 
     */
    public ChangeDocuments createChangeDocuments() {
        return new ChangeDocuments();
    }

    /**
     * Create an instance of {@link LockDocumentResponse }
     * 
     */
    public LockDocumentResponse createLockDocumentResponse() {
        return new LockDocumentResponse();
    }

    /**
     * Create an instance of {@link GetDocumentAuditTrail }
     * 
     */
    public GetDocumentAuditTrail createGetDocumentAuditTrail() {
        return new GetDocumentAuditTrail();
    }

    /**
     * Create an instance of {@link UpdateOptInCorrespondenciesResult }
     * 
     */
    public UpdateOptInCorrespondenciesResult createUpdateOptInCorrespondenciesResult() {
        return new UpdateOptInCorrespondenciesResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unitymedia.de/xsd", name = "applicationId")
    public JAXBElement<String> createApplicationId(String value) {
        return new JAXBElement<String>(_ApplicationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unitymedia.de/xsd", name = "stateId", scope = Request.class)
    public JAXBElement<String> createRequestStateId(String value) {
        return new JAXBElement<String>(_RequestStateId_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unitymedia.de/xsd", name = "customerId", scope = Request.class)
    public JAXBElement<String> createRequestCustomerId(String value) {
        return new JAXBElement<String>(_RequestCustomerId_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unitymedia.de/xsd", name = "dataEncoding", scope = Request.class)
    public JAXBElement<String> createRequestDataEncoding(String value) {
        return new JAXBElement<String>(_RequestDataEncoding_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unitymedia.de/xsd", name = "data", scope = Request.class)
    public JAXBElement<String> createRequestData(String value) {
        return new JAXBElement<String>(_RequestData_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unitymedia.de/xsd", name = "applicationId", scope = Request.class)
    public JAXBElement<String> createRequestApplicationId(String value) {
        return new JAXBElement<String>(_ApplicationId_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unitymedia.de/xsd", name = "resultMsg", scope = GetOptInCorrespondenciesResult.class)
    public JAXBElement<String> createGetOptInCorrespondenciesResultResultMsg(String value) {
        return new JAXBElement<String>(_GetOptInCorrespondenciesResultResultMsg_QNAME, String.class, GetOptInCorrespondenciesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unitymedia.de/xsd", name = "stateId", scope = Response.class)
    public JAXBElement<String> createResponseStateId(String value) {
        return new JAXBElement<String>(_RequestStateId_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unitymedia.de/xsd", name = "customerId", scope = Response.class)
    public JAXBElement<String> createResponseCustomerId(String value) {
        return new JAXBElement<String>(_RequestCustomerId_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unitymedia.de/xsd", name = "resultMsg", scope = Response.class)
    public JAXBElement<String> createResponseResultMsg(String value) {
        return new JAXBElement<String>(_GetOptInCorrespondenciesResultResultMsg_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unitymedia.de/xsd", name = "mimeType", scope = Response.class)
    public JAXBElement<String> createResponseMimeType(String value) {
        return new JAXBElement<String>(_ResponseMimeType_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unitymedia.de/xsd", name = "data", scope = Response.class)
    public JAXBElement<String> createResponseData(String value) {
        return new JAXBElement<String>(_RequestData_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unitymedia.de/xsd", name = "applicationId", scope = Response.class)
    public JAXBElement<String> createResponseApplicationId(String value) {
        return new JAXBElement<String>(_ApplicationId_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unitymedia.de/xsd", name = "display", scope = LookupPair.class)
    public JAXBElement<String> createLookupPairDisplay(String value) {
        return new JAXBElement<String>(_LookupPairDisplay_QNAME, String.class, LookupPair.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unitymedia.de/xsd", name = "value", scope = LookupPair.class)
    public JAXBElement<String> createLookupPairValue(String value) {
        return new JAXBElement<String>(_LookupPairValue_QNAME, String.class, LookupPair.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unitymedia.de/xsd", name = "resultMsg", scope = UpdateOptInCorrespondenciesResult.class)
    public JAXBElement<String> createUpdateOptInCorrespondenciesResultResultMsg(String value) {
        return new JAXBElement<String>(_GetOptInCorrespondenciesResultResultMsg_QNAME, String.class, UpdateOptInCorrespondenciesResult.class, value);
    }

}
