import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class User{
	private String name;
	private String username;
	private String password;
	public ArrayList<Books> booksBorr; //books borrowed
	private String borrowedTitle;
	
	public User(String name){
		this.name = name;
		this.booksBorr = new ArrayList <Books> (); //instantiate a list of books borrowed
	}
	
	// methods
	/*void signUp(){
		String username, password;
		
		System.out.print("Enter username: ");
		Scanner sc = new Scanner(System.in);
		username=sc.next();
		
		System.out.print("Enter password: ");
		sc= new Scanner(System.in);
		password = sc.next();
		
		User user = new User(username,password); //instantiate
	}*/
	void borrowBook(ArrayList<Books> books){ // borrow a book
		System.out.print("Book title: ");
		Scanner sc = new Scanner (System.in);
		borrowedTitle = sc.next(); // get the title of the book to be borrowed
		
		//check if may nageexist bang ganong title
		for(int i=0; i<books.size(); i++){
			if(borrowedTitle.equals(books.get(i))){
				booksBorr.add(books.get(i)); //add yung instance ng book sa booksBorrowed
				books.get(books.size()-1); //update size ng arrayList of books
				books.remove(books.get(i));  //remove yung instance ng book sa arrayList
			}
		}
		System.out.println("Successfully borrowed!");
	}
	
	void viewBorrowed(ArrayList<Books> booksBorr){
		System.out.println("ASDASd");
		for(int i=0; i< booksBorr.size(); i++){
			System.out.println("Title: " + booksBorr.get(i).getTitle());
			System.out.println("Author: " + booksBorr.get(i).getAuthor());
			System.out.println("Year Published: " + booksBorr.get(i).getPublished());
			System.out.println("Type: " + booksBorr.get(i).getType());
			System.out.println("-------------------------------------------");
		
		}
	}
	
	void returnBook(ArrayList<Books> books){
		System.out.print("Book title: ");
		Scanner sc = new Scanner (System.in);
		borrowedTitle = sc.next(); // get the title of the book that was borrowed
		
		
	}
}



