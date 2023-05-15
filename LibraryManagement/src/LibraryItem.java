public abstract class LibraryItem {



    public String title;
    public int releaseYear;


    public LibraryItem(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public abstract String getType();

    public abstract String getItemDetails();
}
