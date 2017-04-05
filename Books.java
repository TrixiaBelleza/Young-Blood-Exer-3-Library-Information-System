import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Books{
  // attributes
  private static int idNum; // used for books id
  private String id; // id in hexadecimal
  private String title; // title of the book (used for searching/borrowing)
  private String author; // author of the book
  private int inventory; // remaining instance of  a book
  private String publication; // year of publication
  private String type; // type of book
  public static ArrayList <Books> books; //list of books
  public Library library;
  // constructor
  public Books(String title, String author, String publication, String type){
    Random r = new Random(); // used to randomize the inventory of the book
    this.id = Integer.toHexString(this.idNum++); // giving a hexadecimal id to the book
    this.title = title;
    this.author = author;
    this.publication = publication;
    this.type = type;
    this.inventory = r.nextInt(6)+15; // randomizing the number of instance
	
	//pag-add ng books sa library
	Library library = new Library("LIBRARY"); //instantiate a library para maaccess yung hashmap
	if(library.bookmap.containsKey(title)){ //if the book already exists in hashmap 
		books.add(this); //add to list of books
	}
	else{
		//if the book does not exist in hashmap yet
		//create new ArrayList<String> books, add the value and put it in the array list w/ the new key
		books = new ArrayList<Books>();
		books.add(this); //add to arrayList using book title
		library.bookmap.put(this.title, this); //add to hashmap using title of book as key and BOOK object instance
	}
  }
	//getters
	public String getTitle(){
		return this.title;
	}
	public String getAuthor(){
		return this.author;
	}
	public String getType(){
		return this.type;
	}
	public String getPublished(){
		return this.publication;
	}


}

/*

ArrayList <String> books ay para mapaglagyan ng books na naiinstantiate.

Everytime na magiinstantiate ng book, ichecheck if nageexist na yung title sa hashMap bookmap. 
Paano machecheck? use the containsKey() method.

If nageexist na sa hashmap, hindi mo na kailangan maginstantiate ng bagong ArrayList for that specific bookTitle kasi meron na.
just add it to the existing ArrayList for that specific bookTitle.

else,
make a new instance of an ArrayList and add the object book.
Also, iupdate din yung hashmap



/*
ArrayList<String> list;
if(myHashMap.containsKey(key)){
    // if the key has already been used,
    // we'll just grab the array list and add the value to it
    list = myHashMap.get(key);
    list.add(value);
} else {
    // if the key hasn't been used yet,
    // we'll create a new ArrayList<String> object, add the value
    // and put it in the array list with the new key
    list = new ArrayList<String>();
    list.add(value);
    myHashMap.put(key, list);
}*/