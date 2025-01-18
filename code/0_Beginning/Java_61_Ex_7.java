
import java.util.*;

class Book {
    public String name, author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    @Override
    public String toString(){
        return "Book{" + " name=\"" + this.name + "\","+ "author=\""+ this.author + "\"" +"}";
    }


}

class Library {

    public ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void returntBook(Book book) {
        this.books.add(book);
        System.out.println("book has been added");
    }

    public void issuBook(Book book) {
        this.books.remove(book);
        System.out.println("your has been issue");
    }

    public void showBook(){
        for (Book book : books) {
            System.out.println(book);
        }
    }


}

public class Java_61_Ex_7 {
    public static void main(String[] args) {
        // library management system
        // capable of issue book 



        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Algorithms","CH verma"));
        books.add(new Book("Algorithms2","CH verma2"));
        books.add(new Book("Algorithms3","CH verma3"));

        Book b1=  new Book("Algorithms5","CH verma5");
        books.add(b1);

        Library l = new Library(books);
        l.addBook(new Book("Algo4","CH verma4"));
        
        
        l.showBook();

    }
}
