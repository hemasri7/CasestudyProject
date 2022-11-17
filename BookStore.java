package com.book;
import java.util.*;
public class BookStore{
	ArrayList<Book> arraylist=new ArrayList<Book>();
	//Add the book Details
	public void addBook(Book b) {
		arraylist.add(b);
		}
	//Search the book by title and author
	public ArrayList<Book> searchByAuthorTitle(String author,String title){
		ArrayList<Book> newlist=new ArrayList<Book>();
		for(Book b:arraylist) {
			if(b.getAuthor().equals(author)||b.getTitle().equals(title)) {
				newlist.add(b);
				}
		}
	return newlist;
	}
	//Search Book By Title
	public void searchByTitle(String title){
		ArrayList<Book> newlist=new ArrayList<Book>();
		for(Book b:arraylist) {
			if(b.getTitle().equals(title)) {
				newlist.add(b);
				System.out.println(newlist);
			}	
		}
		
		
	}
	//Search Book By Author
	public void searchByAuthor(String author){
		ArrayList<Book> newlist=new ArrayList<Book>();
		for(Book b:arraylist) {
			if(b.getAuthor().equals(author)) {
				newlist.add(b);
				System.out.println(newlist);
			}
		}
	
	}
	//Display All the Book details
	public void displayAll() {
		System.out.println("Display Details of All the Books");
		for(Book b:arraylist) {
			System.out.println("Bookid: "+b.getBookId()+"\t"+"Title: "+b.getTitle()+"\t"+"Author:"+b.getAuthor()+"\t"+"Category: "+b.getCategory()+"\t"+"Price: "+b.getPrice());
			System.out.println();
		}
	}
	//Display Specific Book details
	public void displaySpecificBookDetails(String bookId) {
		for(Book b:arraylist) {
			if (b.getBookId().equals(bookId)) {
				System.out.println("Display Details of Specific book");
				System.out.println("Bookid Title Author Category Price");
				System.out.println(b.getBookId()+" "+b.getTitle()+" "+b.getAuthor()+" "+b.getCategory()+" "+b.getPrice());
			}
		}
		
	}
	//Delete the Book Details
	public void deleteBook(String bookId){
		for(Book b:arraylist) {
			if(b.getBookId().equals(bookId)) {
				arraylist.remove(b);
			}
		}
	}

}
