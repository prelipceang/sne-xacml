//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.01 at 04:14:23 PM CEST 
//


package nl.uva.sne.xacml.profiles._2_0_.context;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for RequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:context:schema:os}Subject" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:context:schema:os}Resource" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:context:schema:os}Action"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:context:schema:os}Environment"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
        "subject",
        "resource",
        "action",
        "environment"
})
public class RequestType {

    @XmlElement(name = "Action", required = true)
    protected ActionType action;
    @XmlElement(name = "Environment", required = true)
    protected EnvironmentType environment;
    @XmlElement(name = "Resource", required = true)
    protected List<ResourceType> resource;
    @XmlElement(name = "Subject", required = true)
    protected List<SubjectType> subject;

    /**
     * Gets the value of the action property.
     *
     * @return possible object is {@link ActionType }
     */
    public ActionType getAction() {
        return action;
    }

    /**
     * Gets the value of the environment property.
     *
     * @return possible object is {@link EnvironmentType }
     */
    public EnvironmentType getEnvironment() {
        return environment;
    }

    /**
     * Gets the value of the resource property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the resource property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResource().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list {@link ResourceType }
     */
    public List<ResourceType> getResource() {
        if (resource == null) {
            resource = new ArrayList<ResourceType>();
        }
        return this.resource;
    }

    /**
     * Gets the value of the subject property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the subject property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubject().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list {@link SubjectType }
     */
    public List<SubjectType> getSubject() {
        if (subject == null) {
            subject = new ArrayList<SubjectType>();
        }
        return this.subject;
    }

    /**
     * Sets the value of the action property.
     *
     * @param value allowed object is {@link ActionType }
     */
    public void setAction(ActionType value) {
        this.action = value;
    }

    /**
     * Sets the value of the environment property.
     *
     * @param value allowed object is {@link EnvironmentType }
     */
    public void setEnvironment(EnvironmentType value) {
        this.environment = value;
    }

}
