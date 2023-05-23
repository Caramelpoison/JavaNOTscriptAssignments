import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task One!!");
        Calculation<Integer> add = (a,b) -> System.out.println(a + b);
        Calculation<Integer> subtract = (a,b) -> System.out.println(a - b);
        Calculation<Integer> divide = (a,b) -> System.out.println(a / b);
        Calculation<Integer> multiply = (a,b) -> System.out.println(a * b);

        add.calculate(5,5);
        subtract.calculate(5,5);
        divide.calculate(5,5);
        multiply.calculate(5,5);

        System.out.println("#######################");
        System.out.println();
        System.out.println("Task Two!!");


        SayHello<String> greeting = (name) -> System.out.println("Hello " + name);
        ToLowerCase<String> mocking = (words) -> System.out.println(words + " <---- This has been converted to this ----> " + words.toLowerCase());

        greeting.hello("Alex");
        mocking.toLower("tHiS A MoCkInG TeXt fOrMaT");

        System.out.println("#######################");
        System.out.println();
        System.out.println("Task Three!!");

        Predicate<Integer> isEven = (num) -> num % 2 == 0;
        System.out.println(isEven.test(8));
        System.out.println(isEven.test(7));

        Function<String> yell = (words) -> System.out.println(words + "......You're too quiet say it like this ----> " + words.toUpperCase());
        yell.yellIt("this is me talking quiet.....");

        String fruits = "apple";
        Consumer<String> fruitPrinter = fruit -> System.out.println(fruit);
        fruitPrinter.accept(fruits);


        Random random = new Random();
        Supplier<Double> randomNumber = (num) -> random.nextDouble(num - 1);


        System.out.println(randomNumber.bound(510));







    }
}