import java.util.Scanner;

public class Count2Eleven {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = in1.nextInt();

        for (; i < 12; i++) {
            System.out.println(i);
        }
    }
}