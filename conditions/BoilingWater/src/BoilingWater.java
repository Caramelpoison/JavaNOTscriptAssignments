import java.util.Scanner;


public class BoilingWater {
    public static void main(String[] args) {
        Scanner     tempIn      =       new Scanner(System.in);
        System.out.println("What's the temp of the water?");
        double     temp        =       tempIn.nextDouble();

        if(temp >= 212){
            System.out.println("Water is boiling!");
        }else {
            System.out.println("The water is not boiling yet");
        }
    }
}