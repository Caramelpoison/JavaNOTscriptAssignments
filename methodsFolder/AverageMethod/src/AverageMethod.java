import java.util.Scanner;
public class AverageMethod {
    public static void main(String[] args) {

        Scanner     in1         =       new Scanner(System.in);
        System.out.println("Choose your first number:");
        double      take        =        in1.nextDouble();

        Scanner     in2         =       new Scanner(System.in);
        System.out.println("Choose your second number:");
        double      take2       =        in2.nextDouble();

        Scanner     in3         =       new Scanner(System.in);
        System.out.println("Choose your third number:");
        double      take3       =        in3.nextDouble();

        double      total       =       sum(take,take2,take3);
        average(total);
    }
    public static double sum(double x, double y, double z) {
        double      total       =     x + y + z;
        return total;
    }
    public static void average(double x) {
        double      answer      =       x/3;
        System.out.println("The average is: " + answer);

    }
}