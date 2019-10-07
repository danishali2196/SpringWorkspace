
package com.nt.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nt.service package. 
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

    private final static QName _UserDetail_QNAME = new QName("http://service.nt.com/", "User-Detail");
    private final static QName _FetchRecord_QNAME = new QName("http://service.nt.com/", "fetchRecord");
    private final static QName _InsertRecord_QNAME = new QName("http://service.nt.com/", "insertRecord");
    private final static QName _InsertRecordResponse_QNAME = new QName("http://service.nt.com/", "insertRecordResponse");
    private final static QName _FetchRecordResponse_QNAME = new QName("http://service.nt.com/", "fetchRecordResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nt.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FetchRecordResponse }
     * 
     */
    public FetchRecordResponse createFetchRecordResponse() {
        return new FetchRecordResponse();
    }

    /**
     * Create an instance of {@link InsertRecordResponse }
     * 
     */
    public InsertRecordResponse createInsertRecordResponse() {
        return new InsertRecordResponse();
    }

    /**
     * Create an instance of {@link UserRDTO }
     * 
     */
    public UserRDTO createUserRDTO() {
        return new UserRDTO();
    }

    /**
     * Create an instance of {@link FetchRecord }
     * 
     */
    public FetchRecord createFetchRecord() {
        return new FetchRecord();
    }

    /**
     * Create an instance of {@link InsertRecord }
     * 
     */
    public InsertRecord createInsertRecord() {
        return new InsertRecord();
    }

    /**
     * Create an instance of {@link UserDTO }
     * 
     */
    public UserDTO createUserDTO() {
        return new UserDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nt.com/", name = "User-Detail")
    public JAXBElement<UserRDTO> createUserDetail(UserRDTO value) {
        return new JAXBElement<UserRDTO>(_UserDetail_QNAME, UserRDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nt.com/", name = "fetchRecord")
    public JAXBElement<FetchRecord> createFetchRecord(FetchRecord value) {
        return new JAXBElement<FetchRecord>(_FetchRecord_QNAME, FetchRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nt.com/", name = "insertRecord")
    public JAXBElement<InsertRecord> createInsertRecord(InsertRecord value) {
        return new JAXBElement<InsertRecord>(_InsertRecord_QNAME, InsertRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nt.com/", name = "insertRecordResponse")
    public JAXBElement<InsertRecordResponse> createInsertRecordResponse(InsertRecordResponse value) {
        return new JAXBElement<InsertRecordResponse>(_InsertRecordResponse_QNAME, InsertRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nt.com/", name = "fetchRecordResponse")
    public JAXBElement<FetchRecordResponse> createFetchRecordResponse(FetchRecordResponse value) {
        return new JAXBElement<FetchRecordResponse>(_FetchRecordResponse_QNAME, FetchRecordResponse.class, null, value);
    }

}
