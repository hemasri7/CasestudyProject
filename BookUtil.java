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
		System.out.println("Enter the number :\n1)Add book\n2)modify book details\n3)delete the book\n4)display all\n5)display specific one\n6)search by title\n7)search by author\n8)exit");
		int a=sc.nextInt();
		String Title,Author,BookID,deleteid,modify;
		switch(a) 
		{
			case 1:System.out.println("Enter the  Book  Details: ");
				System.out.print("BookId:");
				String BookId=sc.nextLine();
				System.out.print("Title:");
				String Title1=sc.nextLine();
				System.out.print("Author:");
				String Author1=sc.nextLine();
				System.out.print("Category:");
				String Category=sc.nextLine();
				System.out.print("Price:");
				float Price=sc.nextFloat();
				Book b1=new Book(BookId,Title1,Author1,Category,Price);
				obj.addBook(b1);
				break;
			case 2:System.out.println("Enter the name of field to want modify them:");
				modify=sc.next();
				obj.modifyBook(modify);
				break;
			case 3:System.out.println("Enter the bood id to want delete");
				deleteid=sc.next();
				obj.deleteBook(deleteid);
				break;
			case 4:obj.displayAll();
				break;
			case 5:System.out.println("Search the specific  book id:");
				BookID=sc.next();
				obj.displaySpecificBookDetails(BookID);
				break;
			
			case 6:System.out.println("Search the book by Title:");
				Title=sc.next();
				obj.searchByTitle(Title);
				break;
			case 7:System.out.println("Search the book by Author:");
			Author=sc.next();
			obj.searchByAuthor(Author);
			break;
			case 8:System.exit(0);
				break;
			default:System.out.println("Thank you ");
		}
		sc.close();
				
	}

}