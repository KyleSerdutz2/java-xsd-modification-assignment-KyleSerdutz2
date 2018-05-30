XSD Modification
===
In this assignment, students will clone a repository containing an XSD file that describes a “Book” object. The student will then import that XSD as a JAXB class. Once that is done, the student will design a “Library” JAXB class that contains a collection of books, along with an LibraryName tag, an Address, and a collection of “Librarian” JAXB objects which will be defined with Name, Age, and Salary fields. The student will then use JAXB to generate an XML document that matches the example document provided. Once the student confirms their XML document matches the provided example, the student will then generate a new XSD and submit their assignment.

## Task List
- [ ] Generate the “Book” class from the book.xsd file
- [ ] Create the “Librarian” class and annotate it using JAXB
- [ ] Create the “Library” class and annotate it using JAXB
- [ ] Write a main method that will generate a “Library.xml” file in the working directory
- [ ] Compare this file to the supplied example
- [ ] Generate a new .xsd file to the working directory