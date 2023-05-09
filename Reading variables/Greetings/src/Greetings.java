import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        Scanner newScan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = newScan.nextLine();

        System.out.println("hello " + name);
    }
}