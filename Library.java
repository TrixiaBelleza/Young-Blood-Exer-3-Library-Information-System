import java.util.Scanner;
import java.util.HashMap;
public class Library{
	private String libName; 
	public HashMap<String, Books> bookmap;  // hash map with book title as the key and array of books with same title as the value
	
	public Library(String libName){
		this.libName= libName;
		this.bookmap = new HashMap<String, Books>();
	}
}

/* 
in adding a book, 
check muna yung title 
if title exists in one of the keys in a hashmap
add the new book to that key 


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
}
*/