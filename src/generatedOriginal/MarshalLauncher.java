package generatedOriginal;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;


/*
In this assignment,
students will clone a repository containing an XSD file
that describes a “Book” object.

The student will then import that XSD as a JAXB class.

Once that is done, the student will design a “Library” JAXB class
that contains a collection of books,
along with an LibraryName tag,
an Address,
and a collection of “Librarian” JAXB objects
which will be defined with Name, Age, and Salary fields.

The student will then use JAXB to generate an XML document
that matches the example document provided.
Once the student confirms their XML document matches the provided example,
the student will then generate a new XSD and submit their assignment.
*/
public class MarshalLauncher {
	public static void main(String[] args) throws JAXBException{
		marshalLibrary();
	}
	
	public static void marshalLibrary() throws JAXBException{
		boolean bPrintToFile = false;

		/*Books*/
		GregorianCalendar c = new GregorianCalendar();
		
		Author[] aliceAuthors = new Author[2];
		aliceAuthors[0] = new Author();
		aliceAuthors[0].setFirstName("Lewis");
		aliceAuthors[0].setLastName("Carroll");
		aliceAuthors[1] = new Author();
		aliceAuthors[1].setFirstName("Charles");
		aliceAuthors[1].setLastName("Lutwidge Dodgson");
		Book.Authors aliceBookAuthors = new Book.Authors();
		for(int i = 0; i < aliceAuthors.length; i++)
			aliceBookAuthors.getAuthor().add(aliceAuthors[i]);
		
		Author[] catAuthors = new Author[1];
		catAuthors[0] = new Author();
		catAuthors[0].setFirstName("Theodor");
		catAuthors[0].setLastName("Seuss Geisel");
		Book.Authors catBookAuthors = new Book.Authors();
		for(int i = 0; i < catAuthors.length; i++)
			catBookAuthors.getAuthor().add(catAuthors[i]);
		
		Date aliceDate = new Date(2010, 3, 5);//(year, month, date)
		c.setTime(aliceDate);
		javax.xml.datatype.XMLGregorianCalendar aliceGregDate = null;
		try {
			aliceGregDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date catDate = new Date(2010, 3, 5);//(year, month, date)
		c.setTime(aliceDate);
		javax.xml.datatype.XMLGregorianCalendar catGregDate = null;
		try {
			catGregDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Book aliceInWonderland = new Book();
		aliceInWonderland.setTitle("Alice In Wonderland");
		aliceInWonderland.setGenre("Fantasy");
		aliceInWonderland.setDate(aliceGregDate);
		aliceInWonderland.setAuthors(aliceBookAuthors);
		//
		Book catInTheHat = new Book();
		catInTheHat.setTitle("Cat In The Hat");
		catInTheHat.setGenre("Children's Fiction");
		catInTheHat.setDate(catGregDate);
		catInTheHat.setAuthors(catBookAuthors);
		
		ArrayList<Book> arrayOfBooks1 = new ArrayList<Book>();
		arrayOfBooks1.add(catInTheHat);
		arrayOfBooks1.add(aliceInWonderland);
		
		ArrayList<Book> arrayOfBooks2 = new ArrayList<Book>();
		arrayOfBooks2.add(catInTheHat);
		arrayOfBooks2.add(catInTheHat);
		arrayOfBooks2.add(catInTheHat);
		arrayOfBooks2.add(catInTheHat);
		arrayOfBooks2.add(catInTheHat);
		arrayOfBooks2.add(catInTheHat);
		
		/*Libraries*/
		Library lib01 = new Library();
		lib01.setName("Memphis Public");
		lib01.setAddress("123 Fake Street");
		HashSet<Librarian> lib01Librarians = new HashSet<Librarian>();
		lib01Librarians.add(new Librarian("Larry", 17, 10));
		lib01Librarians.add(new Librarian("Jerry", 41, 20));
		lib01Librarians.add(new Librarian("Marry", 50, 8));
		lib01.setLibrarians(lib01Librarians);
		lib01.setBooks(arrayOfBooks1);
		
		Library lib02 = new Library();
		lib02.setName("Orange Country Library");
		lib02.setAddress("11111 Orange Ln");
		HashSet<Librarian> lib02Librarians = new HashSet<Librarian>();
		lib02Librarians.add(new Librarian("Jen", 21, 5));
		lib02Librarians.add(new Librarian("Len", 35, 5));
		lib02.setLibrarians(lib02Librarians);
		lib01.setBooks(arrayOfBooks2);

		/*Marshalling*/
		JAXBContext context = JAXBContext.newInstance(Library.class);
		Marshaller marshaller = context.createMarshaller();
		
		if(bPrintToFile) {
			/*Writing-Out to Desktop*/
			File marshallFile = new File("marshall.xml");
			FileOutputStream fos = null;
			try {
				marshallFile.createNewFile();
				fos = new FileOutputStream(marshallFile);
				
				//For the ease of Formatting:
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
				marshaller.marshal(lib01, fos);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}else{
			/*Print to Console*/
			
			//For the ease of Formatting:
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
			marshaller.marshal(lib01, System.out);
		}
	}
}
