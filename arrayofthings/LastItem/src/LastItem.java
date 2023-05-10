import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {
    public static void main(String[] args) {

        ArrayList       array       =       new ArrayList<>();

        Scanner     string1     =       new Scanner(System.in);
        System.out.println("Start your array:");
        String      take     =        string1.nextLine();
        array.add(take);
        String      stop         =       "";

        while (!take.equals(stop)){
            Scanner     string2    =       new Scanner(System.in);
            take     =        string2.nextLine();
            array.add(take);
        }

        int length = array.size();
        array.remove(length - 1);
        length = array.size();

        System.out.println("The input for this array is:   " + array.get(length - 1));
    }
}