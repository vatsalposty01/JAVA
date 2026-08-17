import library.*;

public class LibrarySystem {
    public static void main(String[] args) {
        System.out.println("\nLibrary Management\n");

        Book book1 = new Book(101, "JAVA", "Joshua Bloch", 450.99);
        Book book2 = new Book(102, "DSA", "Robert Sedgewick", 399.99);

        book1.displayBookInfo();
        System.out.println();
        book2.displayBookInfo();
    }
}