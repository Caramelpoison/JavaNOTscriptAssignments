import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    String Author;
    int publicationYear;
    int pages;
    String category;
    boolean isLoan;

    public Book(String title, String author, int publicationYear, int pages, String category) {
        this.title = title;
        this.Author = author;
        this.publicationYear = publicationYear;
        this.pages = pages;
        this.category = category;
        this.isLoan = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getPages() {
        return pages;
    }

    public String getCategory() {
        return category;
    }

    public boolean isLoan() {
        return isLoan;
    }

    public void setLoan(boolean loan) {
        isLoan = loan;
    }
}





