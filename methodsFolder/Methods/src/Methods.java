import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {

        Scanner     in1     =       new Scanner(System.in);
        System.out.println("Choose your first number:");
        double      take     =        in1.nextDouble();

        Scanner     in2     =       new Scanner(System.in);
        System.out.println("Choose your second number:");
        double      take2    =        in2.nextDouble();

        divide(take,take2);
    }
    public static void divide(double num,double num2) {
        double      answer      =       num/num2;
        System.out.println(num + " / " + num2 + " = " + answer);
    }
}