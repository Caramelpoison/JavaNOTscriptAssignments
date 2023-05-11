import java.util.ArrayList;
import java.util.Scanner;

public class TvList {

    public static void main(String[] args) {
        ArrayList<TvShow> TvList = new ArrayList<>();
        Scanner q1 = new Scanner(System.in);
        System.out.println("Let's make a list of Tv Shows....");
        System.out.println("");
        System.out.println("What is a name of a Tv show? : ");
        String name = q1.nextLine();
        System.out.println("");

        Scanner q2 = new Scanner(System.in);
        System.out.println("How many episodes are there? : ");
        int numEp = q2.nextInt();
        System.out.println("");

        Scanner q3 = new Scanner(System.in);
        System.out.println("What genre is it? : ");
        String genre = q3.nextLine();
        System.out.println("");


        TvShow newShow = new TvShow(name, numEp, genre);
        TvList.add(newShow);

        while (true) {
            Scanner q4 = new Scanner(System.in);
            System.out.println("What is a name of ANOTHER Tv show? : ");
            name = q4.nextLine();
            System.out.println("");

            if (name.isEmpty()) {
                break;
            }
            Scanner q5 = new Scanner(System.in);
            System.out.println("How many episodes are there? : ");
            numEp = q5.nextInt();
            System.out.println("");

            Scanner q6 = new Scanner(System.in);
            System.out.println("What genre is it? : ");
            genre = q6.nextLine();
            System.out.println("");


            newShow = new TvShow(name, numEp, genre);
            TvList.add(newShow);


        }
        for (int i = 0; i < TvList.size(); i++) {
            TvList.toString();
            System.out.println(TvList.get(i));
        }
    }
}
