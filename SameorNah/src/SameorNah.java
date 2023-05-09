import java.util.Scanner;

public class SameorNah {
    public static void main(String[] args) {

        Scanner     wordIn     =       new Scanner(System.in);
        System.out.println("Choose the first word:");
        String      word1       =       wordIn.nextLine();

        Scanner     wordIn2     =       new Scanner(System.in);
        System.out.println("Choose the first word:");
        String      word2      =       wordIn2.nextLine();


        if(word1.equalsIgnoreCase(word2)){
            System.out.println("These are the same");
        } else {
            System.out.println("These are NOT the same");
        }

    }
}