import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> numB = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5); // could not put numbers directly into array like int nums = [1,2,3,4,5]

        System.out.println(nums); //Created to make sure array was created correctly

        double avg = avg(nums); //tried to print out with just avg(nums);
        System.out.println("The average is: " + avg);

//        nums = null;
//        avg = avg(nums);
//        System.out.println("The average is: " + avg);

        avg = avg(numB);


    }

    public static double avg(ArrayList<Integer> array){ //originally had avg(int[] array) as a parameter
        double sum = 0;
        if (array == null || array.size() == 0) {
            throw new IllegalArgumentException("Array is empty"); //created a breakpoint to catch empty arrays
        }
        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("This is the sum: " + sum); //had this line originally inside the for loop causing to print each iteration
        double avg = sum / array.size(); //changed from array.length
        //double avg = sum / (array.size() -1) ; This made a logical error but with the debugger I able to step through the code find the incorrect calculation
        return avg;
    }
}