import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {

        Scanner q1 = new Scanner(System.in);
        System.out.println("Hello there! How are you doing today?");
        String Q1 = q1.nextLine();


        Scanner q2 = new Scanner(System.in);
        System.out.println("Wow - Interesting! Tell me more!");
        String Q2 = q2.nextLine();
        System.out.println("Alright enough talking I gotta go.");
    }
}