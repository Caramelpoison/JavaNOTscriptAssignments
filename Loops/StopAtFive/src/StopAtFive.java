import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {

        Scanner     in1     =       new Scanner(System.in);
        System.out.println("Type in 5");
        int      take     =        in1.nextInt();
        int      yes         =       5;

        while (take != yes){
            Scanner     in2    =       new Scanner(System.in);
            System.out.println("Dude pick 5!!");
            take     =        in2.nextInt();
        }
        System.out.println("Good job picking 5");

    }
}