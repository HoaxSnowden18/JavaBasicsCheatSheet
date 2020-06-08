
public class Book {
	//Class Variables/Attributes
	String title;
	String author;
	int pages;
	String language;
	
	//This is a constructor (Like __init__ in py)
	//this - refers to the class itself
	//this.title - refers to the class title attribute
	// title; - referse to the title in the constructor
	public Book(String title, String author, int pages, String language) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.language = language;
	}
	
	
}