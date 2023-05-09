import java.util.Scanner;
public class TakeABreak {
    public static void main(String[] args) {

        Scanner     in1     =       new Scanner(System.in);
        System.out.println("Wanna take a break from Grading?");
        String      grading     =        in1.nextLine();
        String      yes         =       "yes";

        while (!grading.equalsIgnoreCase(yes)){
            Scanner     in2    =       new Scanner(System.in);
            System.out.println("Are you sure?");
            grading     =        in2.nextLine();
        }
        System.out.println("Good because you look like you need one!!");

    }
}