// Java program to illustrate
// the concept of Composition
import java.util.*;

// class book
class Book {

    public String title;
    public String author;

    Book(String t, String a)
    {
        this.title = t;
        this.author = a;
    }
}

// Library class contains
// list of books.
class Library {

    // reference to refer to the list of books.
    private final List<Book> books;

    Library(){
      	books = new ArrayList<>();
    }
  
  	public void add(Book b){
      	books.add(b);
    }

    public List<Book> getTotalBooksInLibrary(){
        return books;
    }
}

class Composition
{
    public static void main(String[] args)
    {

        // Creating the Objects of Book class.
        Book b1 = new Book("EffectiveJ Java","Joshua Bloch");
        Book b2 = new Book("Thinking in Java","Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference","Herbert Schildt");

        // Creating the list which contains the
        // no. of books.
        Library library = new Library();      
        
      	library.add(b1);
        library.add(b2);
        library.add(b3);

        List<Book> bks = library.getTotalBooksInLibrary();
      
        for (Book bk : bks) {
            System.out.println("Title : " + bk.title + " and "
                               + " Author : " + bk.author);
        }
    }
}