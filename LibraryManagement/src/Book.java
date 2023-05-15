public class Book extends LibraryItem {
    String ISBN;
    String Author;

    public Book(String title, int releaseYear, String ISBN, String author) {
        super(title, releaseYear);
        this.ISBN = ISBN;
        Author = author;
    }

    @Override
    public String getType() {
        return "Book";
    }

    @Override
    public String getItemDetails() {
        return "Title: " + title + ", Release Year: " + releaseYear + ", ISBN: " + ISBN + ", Author: " + Author;

    }
//    @Override
//    public void addItem(Object item) {
//
//    }
//
//    @Override
//    public void removeItem(Object item) {
//
//    }
//
//    @Override
//    public void displayItems() {
//
//    }
}
