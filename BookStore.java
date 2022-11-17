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
		for(Book b:arraylist) {
			if(b.getTitle().equals(title)) {
				System.out.println("Bookid: "+b.getBookId()+"\t"+"Title: "+b.getTitle()+"\t"+"Author:"+b.getAuthor()+"\t"+"Category: "+b.getCategory()+"\t"+"Price: "+b.getPrice());
			}	
		}
		
		
	}
	//Search Book By Author
	public void searchByAuthor(String author){
		for(Book b:arraylist) {
			if(b.getAuthor().equals(author)) {
				System.out.println("Bookid: "+b.getBookId()+"\t"+"Title: "+b.getTitle()+"\t"+"Author:"+b.getAuthor()+"\t"+"Category: "+b.getCategory()+"\t"+"Price: "+b.getPrice());
			}
		}
	
	}
	//Display All the Book details
	public void displayAll() {
		System.out.println("Display Details of All the Books");
		for(Book b:arraylist) {
			System.out.println("|Bookid| Title| Author| Category| Price|");
			System.out.println("  "+b.getBookId()+ "   "+b.getTitle()+ "   "+b.getAuthor()+"   "+b.getCategory()+"   "+b.getPrice());
			System.out.println();
		}
	}
	//Display Specific Book details
	public void displaySpecificBookDetails(String bookId) {
		for(Book b:arraylist) {
			if (b.getBookId().equals(bookId)) {
				System.out.println("Display Details of Specific book");
				System.out.println("|Bookid | Title | Author | Category | Price|");
				System.out.println("  "+b.getBookId()+"   "+b.getTitle()+"   "+b.getAuthor()+"   "+b.getCategory()+"   "+b.getPrice());
			}
		}
		
	}
	//Delete the Book Details
	public void deleteBook(String bookId){
		Iterator<Book> itr=arraylist.iterator();
		while(itr.hasNext()) {
			if(itr.next().getBookId().equals(bookId)) {
				itr.remove();
			}
		}
	}
	Scanner s=new Scanner(System.in);
	public void modifyBook(String idname) {
		Iterator itr=arraylist.iterator();
		while(itr.hasNext()) {
			Book st1=(Book)itr.next();
			String idname1=st1.getBookId();
			if(idname1.equals(idname)) {
				System.out.println("Enter to want modify the filed :");
				String fid=s.nextLine();
				switch(fid) {
				case "idname":System.out.println("enter the modified the book id:");
					String mdfybid=s.nextLine();
					st1.setBookId(mdfybid);
					break;
				case "title":System.out.println("enter the modified the title of book:");
					String mdfytit=s.nextLine();
					st1.setTitle(mdfytit);
					break;
				case "author":System.out.println("enter the modified the author name");
					String mdfyauth=s.nextLine();
					st1.setAuthor(mdfyauth);
					break;
				case "category":System.out.println("enter the modified the category name");
					String mdfycat=s.nextLine();
					st1.setCategory(mdfycat);
					break;
				case "price":System.out.println("enter the modified the price field");
					float mdfyprice=s.nextFloat();
					st1.setPrice(mdfyprice);
					break;
				default:System.out.println("wrong details");
				}
			}
		}
		s.close();
	}

}
