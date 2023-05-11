import java.util.ArrayList;
import java.util.Scanner;

public class BookList {
    public static void main(String[] args) {
        ArrayList<Book> BookList = new ArrayList<>();
        Scanner q1 = new Scanner(System.in);
        System.out.println("Let's make a list of books....");
        System.out.println("");
        System.out.println("What is a name of a book? : ");
        String name = q1.nextLine();
        System.out.println("");

        Scanner q2 = new Scanner(System.in);
        System.out.println("How many pages are there? : ");
        int numP = q2.nextInt();
        System.out.println("");

        Scanner q3 = new Scanner(System.in);
        System.out.println("What year was it publication? : ");
        int pubY = q3.nextInt();
        System.out.println("");


        Book newBook = new Book(name, numP, pubY);
        BookList.add(newBook);

        while (true) {
            Scanner q4 = new Scanner(System.in);
            System.out.println("What is a name of ANOTHER Book? : ");
            name = q4.nextLine();
            System.out.println("");

            if (name.equalsIgnoreCase("everything")) {
                for (int i = 0; i < BookList.size(); i++) {
                    BookList.toString();
                    System.out.println(BookList.get(i));
                }
                break;
            }else if(name.equalsIgnoreCase("name")){
                for (int i = 0; i < BookList.size(); i++) {
                    System.out.println(BookList.get(i).getName());
                }
                break;
            }
            Scanner q5 = new Scanner(System.in);
            System.out.println("How many pages are there? : ");
            numP = q5.nextInt();
            System.out.println("");

            Scanner q6 = new Scanner(System.in);
            System.out.println("What year was it publication? : ");
            pubY = q6.nextInt();
            System.out.println("");


            newBook = new Book(name, numP, pubY);
            BookList.add(newBook);


        }

    }
}
