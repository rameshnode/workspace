
package de.unitymedia.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rObjectId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "newCustomerNumber",
    "rObjectId"
})
@XmlRootElement(name = "updateOptInCorrespondenciesParameter")
public class UpdateOptInCorrespondenciesParameter {

    @XmlElement(required = true)
    protected String newCustomerNumber;
    @XmlElement(required = true)
    protected String rObjectId;

    /**
     * Gets the value of the newCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCustomerNumber() {
        return newCustomerNumber;
    }

    /**
     * Sets the value of the newCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCustomerNumber(String value) {
        this.newCustomerNumber = value;
    }

    /**
     * Gets the value of the rObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRObjectId() {
        return rObjectId;
    }

    /**
     * Sets the value of the rObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRObjectId(String value) {
        this.rObjectId = value;
    }

}
