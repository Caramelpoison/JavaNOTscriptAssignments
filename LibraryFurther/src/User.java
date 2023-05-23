import java.util.ArrayList;
import java.util.List;
public class User {
    String name;
    int libraryCardNumber;
    List<Book> booksOnLoan;

    public User(String name, int libraryCardNumber) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.booksOnLoan = new ArrayList<>();;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooksOnLoan() {
        return booksOnLoan;
    }

    public void addBook(Book book) {
        booksOnLoan.add(book);
    }

    public void removeBook(Book book) {
        booksOnLoan.remove(book);
    }
}
