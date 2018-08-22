
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for edit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="edit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="demoserver" type="{http://service/}demoserver" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edit", propOrder = {
    "demoserver"
})
public class Edit {

    protected Demoserver demoserver;

    /**
     * Gets the value of the demoserver property.
     * 
     * @return
     *     possible object is
     *     {@link Demoserver }
     *     
     */
    public Demoserver getDemoserver() {
        return demoserver;
    }

    /**
     * Sets the value of the demoserver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Demoserver }
     *     
     */
    public void setDemoserver(Demoserver value) {
        this.demoserver = value;
    }

}
