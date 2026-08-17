package library;

public class Book {
    int bookId;
    String title;
    String author;
    double price;

    public Book(int id, String bookTitle, String bookAuthor, double bookPrice) {
        bookId = id;
        title = bookTitle;
        author = bookAuthor;
        price = bookPrice;
    }

    public void displayBookInfo() {
        System.out.println("Book Details");
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Price   : " + price);
    }
}