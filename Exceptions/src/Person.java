public class Person {

    public String name;

    public int age;

    public Person(String name, int age) {
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Invalid name: " + name);
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid name: " + age);
        }



        this.name = name;
        this.age = age;
    }
}
