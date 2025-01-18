class Library {

    String[] books;
    int no_of_books;

    Library() {
        // maximum book capacity
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[this.no_of_books] = book;
        this.no_of_books += 1;
        System.out.println(book + " book added successfully");
    }

    void showAvailableBooks() {
        System.out.println("Total bo. of books : " + this.no_of_books);
        System.out.println("Available books are :");
        for (String book : this.books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

       void issueBook(String mybook) {
        boolean bookFound = false; // Flag to check if the book exists
        for (int i = 0; i < this.no_of_books; i++) {
            String book = this.books[i];
            // Check if the book is not null before calling equals
            if (book != null && book.equals(mybook)) {
                System.out.println("The " + book + " book has been issued");
                this.books[i] = null; // Mark the book as issued
                this.no_of_books -= 1; // Decrease the count of available books
                bookFound = true; // Set the flag to true
                return; // Exit the method
            }
        }
        // If the book was not found, print a message
        if (!bookFound) {
            System.out.println("The " + mybook + " book does not exist in the library.");
        }
    }

    void returnedBook(String book){
        this.addBook(book);

    }

}

// Note : break vs return
// break : it is used to exit the loop
// return : it is used to exit the from the method

public class Java_30_Ex_4 {
    public static void main(String[] args) {
        Library centeralLibrary = new Library();
        centeralLibrary.addBook("Java");
        centeralLibrary.addBook("C++");
        centeralLibrary.addBook("C");
        centeralLibrary.showAvailableBooks();
        centeralLibrary.issueBook("Java");
        centeralLibrary.issueBook("Python");
        centeralLibrary.returnedBook("Java");
        centeralLibrary.showAvailableBooks();
    }
}