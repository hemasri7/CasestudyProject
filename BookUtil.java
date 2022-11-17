package com.bookutil;
import java.util.Scanner;

import com.book.Book;
import com.book.BookStore;

public class BookUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BookStore obj=new BookStore();
		for(int i=0;i<1;i++) {
			
			System.out.println("Enter the  Book  Details: ");
			System.out.print("BookId:");
			String BookId=sc.nextLine();
			System.out.print("Title:");
			String Title=sc.nextLine();
			System.out.print("Author:");
			String Author=sc.nextLine();
			System.out.print("Category:");
			String Category=sc.nextLine();
			System.out.print("Price:");
			float Price=sc.nextFloat();
			Book b1=new Book(BookId,Title,Author,Category,Price);
			obj.addBook(b1);
			
		}
		obj.displayAll();
		System.out.println("Search the book by Author:");
		String Author=sc.nextLine();
		obj.searchByAuthor(Author);
		System.out.println("Search the book by Title:");
		String Title=sc.nextLine();
		obj.searchByTitle(Title);
		sc.close();
				
	}

}