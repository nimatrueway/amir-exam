import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookCollection {

    private List<Book> books = new ArrayList<>();

    public void sortByBookName() {
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getName().compareTo(b2.getName());
            }
        });
    }

    public void sortByAuthorName() {
        Collections.sort(books, (Book b1, Book b2) -> b1.getAuthor().compareTo(b2.getAuthor()));
    }

    public void sortByFirstPublication() {
        Collections.sort(books,new FirstPublicationComparator());
    }

    public void addBook(Book b1) {
        books.add(b1);
    }

    public void writeToConsole() {
        for (Book element: books) {
            System.out.println(element.toString());
        }
    }

    private class FirstPublicationComparator implements Comparator<Book> {

        @Override
        public int compare(Book b1, Book b2) {
            return b1.getFirstpublished()- b2.getFirstpublished();
        }
    }
}
