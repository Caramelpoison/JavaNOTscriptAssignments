import java.util.Scanner;
import java.util.ArrayList;

public class FifthItem {
    public static void main(String[] args) {

        ArrayList       fifth       =       new ArrayList<>();

        Scanner     string1     =       new Scanner(System.in);
        System.out.println("Start your array:");
        String      take     =        string1.nextLine();
        fifth.add(take);
        String      stop         =       "";

        while (!take.equals(stop)){
            Scanner     string2    =       new Scanner(System.in);
            take     =        string2.nextLine();
            fifth.add(take);
        }

        System.out.println("The fifth index is:   " + fifth.get(4));
    }
}