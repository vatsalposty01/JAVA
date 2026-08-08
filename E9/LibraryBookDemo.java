class LibraryBook {
    
    final String isbn;
    String title;
    String author;
    double price;

    
    LibraryBook(String bookIsbn, String bookTitle, String bookAuthor, double bookPrice) {
        isbn = bookIsbn;
        title = bookTitle;
        author = bookAuthor;
        price = bookPrice;
    }

    void display() {
        System.out.println("ISBN   : " + isbn);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
}

public class LibraryBookDemo {
    public static void main(String[] args) {

        LibraryBook book = new LibraryBook("987", "Java", "Yash", 350.00);
        
        book.display();

        // Attempting to change the ISBN
        // book.isbn = "123"; 
        // ^ ERROR: cannot assign a value to final variable isbn
    }
}