import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.HashMap;

class Library {
    private List<Book> books;
    private HashMap<Book, String> loans;
    private List<User> users;

    public Library(List<Book> books, HashMap<Book, String> loans, List<User> users) {
        this.books = books;
        this.loans = loans;
        this.users = users;
    }

    public Library() {
        this.books = new ArrayList<>();
        this.loans = new HashMap<>();
        this.users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBookByTitle(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    public List<Book> findBooksByYear(int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublicationYear() == year) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> bookByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> byCategory(String category) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getCategory().equals(category)) {
                result.add(book);
            }
        }
        return result;
    }

    public Book mostPages() {
        return books.stream()
                .max(Comparator.comparingInt(Book::getPages))
                .orElse(null);
    }

    public List<Book> pagesMoreThan(int n) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getPages() > n) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void loanBook(Book book, User user) {
        if (!book.isLoan()) {
            book.setLoan(true);
            loans.put(book, user.getName());
            user.addBook(book);
        } else {
            System.out.println("Book is already on loan.");
        }
    }

    public void returnBook(Book book, User user) {
        if (loans.containsKey(book) && loans.get(book).equals(user.getLibraryCardNumber())) {
            book.setLoan(false);
            loans.remove(book);
            user.removeBook(book);
        } else {
            System.out.println("Book is not on loan to the specified user.");
        }
    }

    public void makeNewU(User user) {
        users.add(user);
    }
}
