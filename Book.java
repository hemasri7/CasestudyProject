package com.book;
import com.book.exception.*;
import com.bookutil.*;

public class Book {
	private String bookId;
	private String title;
	private String author;
	private String category;
	private float price;
	
	public Book(String bookId,String title,String author,String category,float price){
		try {
			// validation ofvalidateCategory(category) method
			try {
				String s="Science";
				String f="Fiction";
				String t="Technology";
				String o="Others";
				if(category.equals(s) || category.equals(f) || category.equals(t) || category.equals(o) ){
					this.category=category;
					//String msg="Invalid Book Exception";
					//throw  new InvalidBookException(msg);
						
				}
				else{
					String msg="Category choose either be Science or Fiction or Technology or Others";
					throw  new InvalidBookException(msg);
					}
				}
				catch(InvalidBookException msg) {
					System.out.println(msg);
				}
			//validation of validatePrice() method
			try {
				if(price < 0) {
					String msg="Price should not be negative";
					throw new  InvalidBookException(msg);
				}}
				catch(InvalidBookException msg) {
					System.out.println(msg);
				}
			//validation of validatebookId() method
			try {
				char ch=bookId.charAt(0);
				int len=bookId.length();
				if((ch!='B') || (len<4)) {
					String msg="BoodId should start with B and lenth not be less than 4";
					throw new InvalidBookException(msg);
				}}
				catch(InvalidBookException msg) {
					System.out.println(msg);
				}}
				catch(Exception e) {
					System.out.println(e);
				
			
			}
			this.bookId=bookId;
			this.title=title;
			this.author=author;
			this.category=category;
			this.price=price;
		}
		
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId=bookId;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price=price;
	}
}
