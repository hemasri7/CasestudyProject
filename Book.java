package com.book;
import com.book.exception.*;
public class Book {
	private String bookId;
	private String title;
	private String author;
	private String category;
	private float price;
	
	public Book(String bookId,String title,String author,String category,float price){
		try {
			//Validation Category check
			try {
				String sc="Science";
				String fc="Fiction";
				String te="Technology";
				String ot="Others";
				if(category.equals(sc)||category.equals(fc)||category.equals(te)||category.equals(ot)) {
					this.category=category;
				}
				else {
					throw new InvalidBookException("InvalidBookException");
					}
				}
			catch(InvalidBookException e) {
					System.out.println(e);
				}
			//Price check..
			try {
				if(price<0) {
					throw new InvalidBookException("InvalidBookException");
					}
				}
			catch(InvalidBookException e) {
				System.out.println(e);
				}
			//Book id check..
			try {
				char ch=bookId.charAt(0);
				int len=bookId.length();
				if((ch!='B')||(len<4)||(len>4)){
					throw new InvalidBookException("InvalidBookException");
					}
				}
			catch(InvalidBookException e) {
				System.out.println(e);
				}
			}
		catch(Exception e) {
			System.out.println(e);
		}
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.category=category;
		this.price=price;
	}

	public String getBookId(){
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId=bookId;
	}
	
	public String getTitle(){
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public String getCategory(){
		return category;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	
	public float getPrice(){
		return price;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	
	
}