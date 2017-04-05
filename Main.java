import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		//public ArrayList <Books> books; //list of books
		//instantiate a user
		String name;
		System.out.print("Enter name: ");
		Scanner sc = new Scanner(System.in);
		name=sc.next();
		
		User user = new User(name);
		
		//add books to library 
		Books book1 = new Books("Hello world", "Darna", "1997", "novel");
		Books book2 = new Books("Young Blood", "Jhon Jerme", "2017", "textbook");
		Books book3 = new Books("Hello world", "Enteng Kabisote", "1992", "novel");
		Books book4 = new Books("Hello world", "Trixia", "2017", "dictionary");
		Books book5 = new Books("Perks of Being a Cute Student", "Cute Person", "2000", "encyclopedia");
		
		int choice;
		//Menu
		
		do{
			System.out.println("*********DASHBOARD**********");
			System.out.println("[1] Borrow a book");
			System.out.println("[2] Return a book");
			System.out.println("[3] View books in library");
			System.out.println("[4] View books borrowed");
			System.out.println("[5] Exit");
			System.out.println("****************************");
			
			System.out.print("Enter choice: ");
			sc = new Scanner(System.in);
			choice=sc.nextInt();
			
			switch(choice){
				case 1:
					user.borrowBook(Books.books);
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					user.viewBorrowed(user.booksBorr);
					break;
			}
		}while(choice!=5);
	}
}
