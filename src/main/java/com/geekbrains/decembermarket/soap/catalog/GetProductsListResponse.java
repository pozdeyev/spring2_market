//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.28 at 07:28:51 PM MSK 
//


package com.geekbrains.decembermarket.soap.catalog;

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
 *         &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productsList" type="{http://www.decembermarket.geekbrains.com/soap/catalog}productsList"/>
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
    "clientName",
    "productsList"
})
@XmlRootElement(name = "getProductsListResponse")
public class GetProductsListResponse {

    @XmlElement(required = true)
    protected String clientName;
    @XmlElement(required = true)
    protected ProductsList productsList;

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the productsList property.
     * 
     * @return
     *     possible object is
     *     {@link ProductsList }
     *     
     */
    public ProductsList getProductsList() {
        return productsList;
    }

    /**
     * Sets the value of the productsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductsList }
     *     
     */
    public void setProductsList(ProductsList value) {
        this.productsList = value;
    }

}
