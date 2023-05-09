import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {

            Scanner     in1     =       new Scanner(System.in);
            System.out.println("Enter a number");
            int      take     =        in1.nextInt();

            while (take != 0) {
                if (take > 0) {
                    System.out.println("The number is " + take);
                    Scanner in2 = new Scanner(System.in);
                    take = in2.nextInt();
                }else{
                    System.out.println("The number must be psotive");
                    Scanner in2 = new Scanner(System.in);
                    System.out.println("Enter a number");
                    take = in2.nextInt();

                }
            }
        }
}