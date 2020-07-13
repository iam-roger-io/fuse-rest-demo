
package com.whois.endpoints.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for check complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="check"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="whois11" type="{http://soap.endpoints.whois.com/}SoapWhoisRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "check", propOrder = {
    "whois11"
})
public class Check {

    @XmlElement(required = true)
    protected SoapWhoisRequest whois11;

    /**
     * Gets the value of the whois11 property.
     * 
     * @return
     *     possible object is
     *     {@link SoapWhoisRequest }
     *     
     */
    public SoapWhoisRequest getWhois11() {
        return whois11;
    }

    /**
     * Sets the value of the whois11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapWhoisRequest }
     *     
     */
    public void setWhois11(SoapWhoisRequest value) {
        this.whois11 = value;
    }

}
