import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        Scanner     int1    =   new Scanner(System.in);
        System.out.println("Enter a number:");
        float         num1     =   int1.nextFloat();

        Scanner     int2    =   new Scanner(System.in);
        System.out.println("Enter a number:");
        float         num2     =   int2.nextFloat();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

    }
}