public class Main {
    public static void main(String[] args) {

        System.out.println("################### Bubble Sort ################## ");


        int[] arr = {4, 1, 3, 9, 7};
        bubbleSort(arr);
        System.out.print("Sorted array: ");
        System.out.println("");
        for (int i : arr) {
            System.out.println(i + " ");
        }
        System.out.println("");
        System.out.println("################### Counting Sort ################## ");

        String arr2 = "edsab";
        String sortedString = countSort(arr2);
        System.out.println("Sorted string: " + sortedString);

        
    }
    public static void bubbleSort(int[] arr) {
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
    }

    public static String countSort(String arr) {
        int[] count = new int[26];
        int n = arr.length();

        for (int i = 0; i < n; i++) {
            count[arr.charAt(i) - 'a']++;
        }

        StringBuilder sortedString = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sortedString.append(String.valueOf((char) (i + 'a')).repeat(Math.max(0, count[i]))); //Something cool happened here IntelliJ offered a different way of using a for loop
        }

        return sortedString.toString();
    }
}







