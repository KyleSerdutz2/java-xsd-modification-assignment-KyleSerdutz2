//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.30 at 07:05:38 AM CDT 
//


package generatedPost;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="libraryBooks" type="{}Book" maxOccurs="unbounded"/>
 *         &lt;element name="libraryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="librarians" type="{}Librarian" maxOccurs="unbounded"/>
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
    "libraryBooks",
    "libraryName",
    "address",
    "librarians"
})
@XmlRootElement(name = "library")
public class Library {

    @XmlElement(required = true)
    protected List<Book> libraryBooks;
    @XmlElement(required = true)
    protected String libraryName;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected List<Librarian> librarians;

    /**
     * Gets the value of the libraryBooks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libraryBooks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibraryBooks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Book }
     * 
     * 
     */
    public List<Book> getLibraryBooks() {
        if (libraryBooks == null) {
            libraryBooks = new ArrayList<Book>();
        }
        return this.libraryBooks;
    }

    /**
     * Gets the value of the libraryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryName() {
        return libraryName;
    }

    /**
     * Sets the value of the libraryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryName(String value) {
        this.libraryName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the librarians property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the librarians property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibrarians().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Librarian }
     * 
     * 
     */
    public List<Librarian> getLibrarians() {
        if (librarians == null) {
            librarians = new ArrayList<Librarian>();
        }
        return this.librarians;
    }

}
