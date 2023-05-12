public class Main {
    public static void main(String[] args) {

        Animal tiger = new Animal("tiger", false);
        Animal dog = new Animal("Dog");

        Book Coco = new Book("Coco", 45, 1445);
        Book Barney = new Book("Barney", 45);
        Book Elmo = new Book("Elmo");

        TvShow Cocomelon = new TvShow("Cocomelon", 1000, "Kids");
        TvShow angryBarney = new TvShow("Barney", 45);
        TvShow Naruto = new TvShow("Naruto");

        System.out.println(tiger.toString());
        System.out.println(dog.toString());

        System.out.println(Coco.toString());
        System.out.println(Barney.toString());
        System.out.println(Elmo.toString());

        System.out.println(Cocomelon.toString());
        System.out.println(angryBarney.toString());
        System.out.println(Naruto.toString());
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");



        System.out.println("###### Counter Part ######");

        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter();

        counter1.increase();
        System.out.println("Counter 1 value: " + counter1.getStartValue());
        counter1.increase();
        System.out.println("Counter 1 value: " + counter1.getStartValue());


        counter2.decrease();
        System.out.println("Counter 2 value: " + counter2.getStartValue());
        counter2.decrease();
        System.out.println("Counter 2 value: " + counter2.getStartValue());

        counter1.decrease(2);
        System.out.println("Counter 1 value: " + counter1.getStartValue());
        counter1.increase(5);
        System.out.println("Counter 1 value: " + counter1.getStartValue());



    }
}