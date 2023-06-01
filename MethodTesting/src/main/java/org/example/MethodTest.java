package org.example;

public class MethodTest {
    public int add(int num1, int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        return num1 + num2;
    }

    public double multiply(double num1, double num2){
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        return num1 * num2;
    }

    public int[] sorter(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("The Sorted array: " );
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        return arr;
    }

    public static String countSort(String arr) {
        int[] count = new int[26];
        int n = arr.length();

        for (int i = 0; i < n; i++) {
            count[arr.charAt(i) - 'a']++;
        }

        StringBuilder sortedString = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sortedString.append(String.valueOf((char) (i + 'a')).repeat(Math.max(0, count[i])));


        }
        String sorted = sortedString.toString();
        System.out.println("The Sorted String " + sorted);

        return sorted;    }

    public static double avg(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = sum / arr.length;
        System.out.println("The avg of the array is " + average);
        return average;
    }

}