import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in1.nextInt();

        for (int i = 1 ; i < 11; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}