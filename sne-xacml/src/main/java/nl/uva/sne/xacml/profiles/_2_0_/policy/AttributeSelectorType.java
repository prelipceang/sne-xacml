//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.01 at 04:14:23 PM CEST 
//


package nl.uva.sne.xacml.profiles._2_0_.policy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeSelectorType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="AttributeSelectorType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}ExpressionType">
 *       &lt;attribute name="RequestContextPath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="MustBePresent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeSelectorType")
public class AttributeSelectorType
        extends ExpressionType {

    @XmlAttribute(name = "DataType", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String dataType;
    @XmlAttribute(name = "MustBePresent")
    protected Boolean mustBePresent;
    @XmlAttribute(name = "RequestContextPath", required = true)
    protected String requestContextPath;

    /**
     * Gets the value of the dataType property.
     *
     * @return possible object is {@link String }
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Gets the value of the requestContextPath property.
     *
     * @return possible object is {@link String }
     */
    public String getRequestContextPath() {
        return requestContextPath;
    }

    /**
     * Gets the value of the mustBePresent property.
     *
     * @return possible object is {@link Boolean }
     */
    public boolean isMustBePresent() {
        if (mustBePresent == null) {
            return false;
        } else {
            return mustBePresent;
        }
    }

    /**
     * Sets the value of the dataType property.
     *
     * @param value allowed object is {@link String }
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Sets the value of the mustBePresent property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setMustBePresent(Boolean value) {
        this.mustBePresent = value;
    }

    /**
     * Sets the value of the requestContextPath property.
     *
     * @param value allowed object is {@link String }
     */
    public void setRequestContextPath(String value) {
        this.requestContextPath = value;
    }

}
