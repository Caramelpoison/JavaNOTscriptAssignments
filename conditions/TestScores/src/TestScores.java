import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {

        Scanner     scoreIn     =       new Scanner(System.in);
        System.out.println("What did you get on your test?");
        double      score       =       scoreIn.nextDouble();

        if(score >= 90){
            System.out.println("You got an A");
        } else if(score <= 89.9  && score >= 80 ){
            System.out.println("You got a B");
        } else if(score <= 79.9 && score >= 70 ){
            System.out.println("You got a C");
        } else if(score <= 69.9 && score >= 60 ){
            System.out.println("You got a D");
        } else {
            System.out.println("You got a F");
        }

    }
}