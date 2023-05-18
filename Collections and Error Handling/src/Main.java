import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

            public static void main(String[] args) {
                List<Integer> ints = new ArrayList<>();
                ints.add(8);
                ints.add(5);
                ints.add(3);
                ints.add(2);
                ints.add(5);
                ints.add(3);
                ints.add(4);
                ints.add(7);
                ints.add(0);
                ints.add(9);

                try {
                    Set<Integer> noDupes = new HashSet<>(ints);

                    int sum = 0;
                    for (Integer num : noDupes) {
                        sum += num;
                    }

                    double avg = (double) sum / noDupes.size();

                    System.out.println("Original list: " + ints);
                    System.out.println("List without duplicates: " + noDupes);
                    System.out.println("Sum: " + sum);
                    System.out.println("Average: " + avg);

                } catch (IndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
                    System.err.println("An error occurred: " + e.getMessage());
                } finally {
                    System.out.println("IT WORKED!!");
                }
            }
}

