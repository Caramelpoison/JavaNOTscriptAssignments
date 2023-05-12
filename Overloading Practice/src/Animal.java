import java.util.Scanner;
import java.util.ArrayList;

public class Animal {
    public String name;
    public boolean isDog;

    public Animal(String name, boolean isDog){
        this.name       =       name;
        this.isDog         =       isDog;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isDog() {
        return isDog;
    }

    @Override
    public String toString() {
        return  getName() + " is a dog. = " + isDog();
    }
}



