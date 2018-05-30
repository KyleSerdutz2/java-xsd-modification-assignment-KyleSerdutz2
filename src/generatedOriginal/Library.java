package generatedOriginal;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TreeSet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

@XmlAccessorType(XmlAccessType.FIELD) //For ignoring Get/Set Names
@XmlRootElement
public class Library {
	@XmlElement(name = "libraryBooks")
	private ArrayList<Book> books;
	@XmlElement(name = "libraryName")
	private String name;
	private String address;
	private HashSet<Librarian> librarians;
	
	Library(){}
	
	
	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public HashSet<Librarian> getLibrarians() {
		return librarians;
	}

	public void setLibrarians(HashSet<Librarian> librarians) {
		this.librarians = librarians;
	}
}
