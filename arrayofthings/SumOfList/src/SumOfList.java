import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList {
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
        int     total       =       0;

        for(int i = 0; i < array.size(); i++ ){
            int     num     =       array.get(i);
            total       =       total       +       num;
            if ((array.size() - 2) == i){
                System.out.print("and " + num);
            }else if (i < array.size()  && i != (array.size() - 1) ) {
                System.out.print(num + ", ");
            }
        }

        System.out.println(" were the the items in the list. The sum of that list is: " + total );



    }
}