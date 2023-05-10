import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger {
    public static void main(String[] args) {

        ArrayList<Integer>       array       =       new ArrayList<>();

        Scanner     int1        =       new Scanner(System.in);
        System.out.println("Start your array of integers:");
        int      take           =        int1.nextInt();
        array.add(take);

        while (take != 0){
            Scanner     int2    =       new Scanner(System.in);
            take     =        int2.nextInt();
            array.add(take);
        }

        System.out.println("Done entering integers into the list");
        Scanner     int3     =       new Scanner(System.in);
        System.out.println("What number are you looking for in the list?");
        int     look            =        int3.nextInt();

        for(int i = 0; i < array.size(); i++ ){
            int     num     =       array.get(i);
            if ( num == look){
                int     index       =       i;
                System.out.println(look + " is at the index " + index);
            }
        }



    }
}