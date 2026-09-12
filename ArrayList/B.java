
import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;                                          // increments each time a book is instantiated
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public void  setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getInfo() {
        return "Title: " + title + ", Author: " + author;
    }
 
}

class Library {
    private ArrayList<Book> bookL;

    public Library() {
        bookL = new ArrayList<Book>();
    }
    public void addBook(Book book) {
        bookL.add(book);
    }
    public void removeBook(Book book) {
        bookL.remove(book);
    }
    public ArrayList<Book> getBooks() {
        return bookL;
    }
}

public class B {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great House", " Firdaus");
        Book book2 = new Book("To Be a Mockingbird", " Lee");
        Book book3 = new Book("2030", "Dewan ");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Books in the library:");
        for (Book a : library.getBooks()) {                                                  // Iterate through each book in the library
            System.out.println(a.getInfo());                                                           // Get the total number of books
        }


    }    
}
