import java.io.Serializable;

public class Book implements Serializable {
   private String name ;
   private String author;
   private String language;
   private int firstpublished;
   private int approximatesaleMillion;
   private String genre ;

    public Book() {
    }

    public Book(String name, String author, String language, int firstpublished, int approximatesaleMillion, String genre) {
        this.name = name;
        this.author = author;
        this.language = language;
        this.firstpublished = firstpublished;
        this.approximatesaleMillion = approximatesaleMillion;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getFirstpublished() {
        return firstpublished;
    }

    public void setFirstpublished(int firstpublished) {
        this.firstpublished = firstpublished;
    }

    public int getApproximatesaleMillion() {
        return approximatesaleMillion;
    }

    public void setApproximatesaleMillion(int approximatesaleMillion) {
        this.approximatesaleMillion = approximatesaleMillion;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", language='" + language + '\'' +
                ", firstpublished=" + firstpublished +
                ", approximatesaleMillion=" + approximatesaleMillion +
                ", genre='" + genre + '\'' +
                '}';
    }
}
