
package com.handisala.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for postReciepeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="postReciepeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="greetings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postReciepeResponse", propOrder = {
    "greetings"
})
public class PostReciepeResponse {

    protected String greetings;

    /**
     * Gets the value of the greetings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGreetings() {
        return greetings;
    }

    /**
     * Sets the value of the greetings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGreetings(String value) {
        this.greetings = value;
    }

}
