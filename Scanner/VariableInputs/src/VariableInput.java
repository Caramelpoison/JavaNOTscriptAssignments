import java.util.Scanner;


public class VariableInput {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a string of text: ");
        String string = s1.nextLine();

        Scanner i1 = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String num = i1.nextInt();

        Scanner d1 = new Scanner(System.in);
        System.out.println("Enter a double: ");
        String dub = d1.nextDouble();

        Scanner b1 = new Scanner(System.in);
        System.out.println("Enter a Boolean: ");
        String boo = b1.nextBoolean();

        System.out.println("Your string is " + string );
        System.out.println("Your integer is " + num);
        System.out.println("Your double is " + dub );
        System.out.println("Your boolean is " + boo );



    }
}
