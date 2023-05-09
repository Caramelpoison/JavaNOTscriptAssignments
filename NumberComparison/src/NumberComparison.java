import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {

        Scanner     numIn1      =       new Scanner(System.in);
        System.out.println("Choose a number:");
        double      num1        =       numIn1.nextDouble();

        Scanner     numIn2      =       new Scanner(System.in);
        System.out.println("Choose another number:");
        double      num2        =       numIn2.nextDouble();

        if(num1 > num2){
            System.out.println("The First number is greater than the Second");
        } else if (num1 < num2) {
            System.out.println("The Second number is greater than the First");
        }else {
            System.out.println("The two numbers are the same");
        }
    }
}