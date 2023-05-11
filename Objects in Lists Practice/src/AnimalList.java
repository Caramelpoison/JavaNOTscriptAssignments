import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class AnimalList {
    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();
        Scanner     q1      =       new Scanner(System.in);
        System.out.println("Let's make a list of animals....");
        System.out.println("");
        System.out.println("What is the name of your animal?: ");
        String name         =       q1.nextLine();
        System.out.println("");

        Scanner     q2      =       new Scanner(System.in);
        System.out.println("Is it a dog? Y/N: ");
        String      yN      =       q2.nextLine();
        boolean     isDog   =       false;

        if (yN.equalsIgnoreCase("Y")){
            isDog       =       true;
        }else if (yN.equalsIgnoreCase("N")){
            isDog       =       false;
        }


        Animal newAnimal = new Animal(name, isDog);
        animalList.add(newAnimal);

        while(true){
            System.out.println("What is the name of your NEXT animal?: ");
            name         =       q1.nextLine();
            System.out.println("");
            if (name.isEmpty()){
                break;
            }

            Scanner     q3      =       new Scanner(System.in);
            System.out.println("Is it a dog? Y/N: ");
            yN      =       q3.nextLine();

            if (yN.equalsIgnoreCase("Y")){
                isDog       =       true;
            }else if (yN.equalsIgnoreCase("N")){
                isDog       =       false;
            }

            newAnimal = new Animal(name, isDog);
            animalList.add(newAnimal);
        }
        for (int i = 0; i < animalList.size(); i++) {
            animalList.toString();
            System.out.println(animalList.get(i));
        }

    }
}