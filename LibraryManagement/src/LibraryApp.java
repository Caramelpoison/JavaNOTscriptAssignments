import java.lang.reflect.Array;
import java.util.ArrayList;

public class LibraryApp {
    public static void main(String[] args) {

        LibraryManager<LibraryItem> libraryList = new LibraryManager<>();

        Book Barney = new Book("Just Imagine with Barney", 1992, "1234-ABCD","Mary Shrode");

        Book Cocomelon = new Book("Counting with Cocomelon", 2021, "2021-1234", " Cottage Door Press");

        DVD Elmo = new DVD("Elmo's World", 1994, "Judy Freudberg", 120 );

        DVD Franklin = new DVD("Franklin does his dance", 2006, "Brenda Clark", 72);

        libraryList.addItem(Barney);
        libraryList.addItem(Cocomelon);
        libraryList.addItem(Elmo);
        libraryList.addItem(Elmo);


        libraryList.displayItems();

        System.out.println("####### Now to remove the Cocomelon Book #########");
        System.out.println("##################");
        libraryList.removeItem(Cocomelon);

        libraryList.displayItems();





    }
}