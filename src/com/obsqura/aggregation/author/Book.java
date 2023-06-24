package com.obsqura.aggregation.author;

public class Book {
	String bookName;
	String bookPrice;
	Author author;
	
	public Book(String bookName, String bookPrice, Author author) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.author = author;
	}
	public void display() {
		System.out.println("Book details");
		System.out.println(bookName +" "+ bookPrice);
		System.out.println("Author:" +" "+ author.authorName +" " + author.authorAge +" "+ author.authorPlace);
		
	}
	public static void main(String[] args) {
		Author author1 = new Author("Dan Brown","USA", 58);
		Book book1 = new Book("The Davinci Code","RS 200",author1);
		book1.display();
		
	}

}
