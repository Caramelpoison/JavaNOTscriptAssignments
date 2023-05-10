import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class ChatBot {
    public static void main(String[] args) {


        greet();
        Ager();
        counter();
        testAnswer();
    }

    public static void greet(){
        Scanner name = new Scanner(System.in);
        System.out.println("Hello User! What is your name?");
        String takeN = name.nextLine();

        name = new Scanner(System.in);
        System.out.println("Sorry I error'd out what was that?");
        takeN = name.nextLine();
        System.out.println("Nice to meet you " + takeN + "!!");
        System.out.println("");

    }

    public static void Ager(){
        Scanner y1 = new Scanner(System.in);
        System.out.println("hmmm I bet I can guess your age!! What year were you born?");
        int a1 = y1.nextInt();

        Scanner y2 = new Scanner(System.in);
        System.out.println("Ok what month? Tell me like MM i.e. 05 or 11");
        int a2 = y2.nextInt();

        Scanner y3 = new Scanner(System.in);
        System.out.println("Finally what year is it?");
        int a3 = y3.nextInt();

        int age = a3 - a1;


        System.out.println("So you're like " + age + "ish years old, or at least about to be soon");
        System.out.println("");

        Scanner y4 = new Scanner(System.in);
        System.out.println("Was I right? Y/N?");
        String a4 = y4.nextLine();
        if (a4.equals("N") ) {
            System.out.println("Then you must be " + (age - 1) + " years old.....moving on.....");
        }
        else{
            System.out.println("I got skills");
        }

    }


    public static void counter() {
        Scanner     in1     =       new Scanner(System.in);
        System.out.println("Ok, now pick any number and I'll count from 0 to that number!!");
        int         num     =       in1.nextInt();
        System.out.print("Ok here I go!! ");
        System.out.println("");

        for (int i = 0; i <= num; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("");
        System.out.println("");
    }

    public static void testAnswer(){
        System.out.print("Let's see how smart you are!!");
        System.out.println("");
        System.out.println("What is a correct syntax to output \"Hello World\" in Java? Enter either A, B, C, or D");
        System.out.println("");

        Scanner q2 = new Scanner(System.in);
        System.out.println("A: print(\"Hello World\");");
        System.out.println("B: System.out.println(\"Hello World\");");
        System.out.println("C: echo(\"Hello World\");");
        System.out.println("D: Console.WriteLine(\"Hello World\");");
        String a2 = q2.nextLine();

        while(!a2.equalsIgnoreCase("B")){
                Scanner q3 = new Scanner(System.in);
                System.out.println("OOOOhhh wow someone needs to study try again");
                a2 = q3.nextLine();
            }
        System.out.println("I knew you would get it!! I had no doubt.");


    }
}




