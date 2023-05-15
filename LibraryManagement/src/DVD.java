import java.util.ArrayList;
public class DVD extends LibraryItem{

    String director;

    int duration;

    public DVD(String title, int releaseYear, String director, int duration) {
        super(title, releaseYear);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public String getType() {
        return "DVD";
    }
    @Override
    public String getItemDetails() {
        return "Title: " + title + ", Release Year: " + releaseYear +  ", Director: " + director + ", Duration: " + duration;

    }
//
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
