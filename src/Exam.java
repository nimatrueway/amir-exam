import java.io.*;
import java.util.Collections;
import java.util.HashSet;

public class Exam {

    public static BookCollection generateSample() {
        BookCollection bookCollection = new BookCollection();
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "English", 1954, 150, "fantasy");
        Book book2 = new Book("Le Petti Prince", "Antonie de Saint-Exupery", "French", 1943, 140, "novel");
        Book book3 = new Book("Harry Potter and Philosopher’s Stone", "J.K Rowling", "English", 1997, 120, "fantasy");
        Book book4 = new Book("The Hobbit", "J.R.R. Tolkien", "English", 1937, 103, "fantasy");
        Book book5 = new Book("And Then There Were None", "Agatha Christies", "English", 1939, 102, "fantasy");
        Book book6 = new Book("Drama of the Red Chamber", "Cao Xueqin", "Chinese", 1754, 100, "Family saga");
        Book book7 = new Book("Alice’s Adventures in Wonder land", "Lewis Carroll", "English", 1865, 100, "fantasy");
        Book book8 = new Book("Quran", "Muhammed", "Arabic", 600, 100, "SciFi");
        Book book9 = new Book("Harry Potter", "Muhammed", "Arabic", 600, 100, "SciFi");
        bookCollection.addBook(book1);
        bookCollection.addBook(book2);
        bookCollection.addBook(book3);
        bookCollection.addBook(book4);
        bookCollection.addBook(book5);
        bookCollection.addBook(book6);
        bookCollection.addBook(book7);
        bookCollection.addBook(book8);
        bookCollection.addBook(book9);
        return bookCollection;
    }

    public static BookCollection readDataFile(String file) throws IOException, ClassNotFoundException {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            return (BookCollection) (input.readObject());
        }
    }

    public static void writeDataFile(String file, BookCollection bookCollection) throws IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file, false))) {
            output.writeObject(bookCollection);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        BookCollection books = generateSample();
        System.out.println("sort by AuthorName");
        System.out.println("-----------------------------------------------");
        books.sortByAuthorName();
        books.writeToConsole();
        System.out.println("sort by BookName");
        System.out.println("-----------------------------------------------");
        books.sortByBookName();
        books.writeToConsole();
        System.out.println("sort by sortByFirstPublication");
        System.out.println("-----------------------------------------------");
        books.sortByFirstPublication();
        books.writeToConsole();

    }
}
