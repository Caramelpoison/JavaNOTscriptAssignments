import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                String file1 = "src/integer1.txt";
                String file2 = "src/integer2.txt";
                String merge = "src/merge.txt";
                String common = "src/common.txt";
                List<String> nums = new ArrayList<>();
                List<String> common1 = new ArrayList<>();
                List<String> common2 = new ArrayList<>();
                List<String> common3 = new ArrayList<>();

                try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
                        String num;
                        while ((num = reader.readLine()) != null) {
                                nums.add(num);
                                common1.add(num);
                        }
                } catch (IOException e) {
                        System.out.print("Error reading file");
                        e.printStackTrace();
                }
                System.out.println("Integers from the first file: " + common1);

                try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
                        String num;
                        while ((num = reader.readLine()) != null) {
                                nums.add(num);
                                common2.add(num);
                        }
                } catch (IOException e) {
                        System.out.print("Error reading file");
                        e.printStackTrace();
                }

                System.out.println("Integers from the second file: " + common2);
                System.out.println("Integers from both files: " + nums);
                System.out.println("");



                try {
                        File outputFile = new File(merge);
                        if (outputFile.createNewFile()) {
                                System.out.println("File created: " + outputFile.getName());
                        } else {
                                System.out.println("File already exists. Will be updated with new content");
                        }
                        BufferedWriter writer = new BufferedWriter(new FileWriter(merge));
                        for (String integers : nums) {
                                writer.write(integers);
                                writer.newLine();
                        }
                        writer.close();
                        System.out.println("Data written to the MERGED file.");
                } catch (IOException e) {
                        e.printStackTrace();
                }
                System.out.println("");
                for (String num1 : common1) {
                        for (String num2 : common2) {
                                if (num1.equals(num2)) {
                                        common3.add(num2);
                                        break;
                                }
                        }
                }
                System.out.println("Integers that are shared among both files: " + common3);
                System.out.println("");
                try {
                        File outputFile = new File(common);
                        if (outputFile.createNewFile()) {
                                System.out.println("File created: " + outputFile.getName());
                        } else {
                                System.out.println("File already exists. Will be updated with new content");
                        }
                        BufferedWriter writer = new BufferedWriter(new FileWriter(common));
                        for (String integers : common3) {
                                writer.write(integers);
                                writer.newLine();
                        }
                        writer.close();
                        System.out.println("Data written to COMMON file.");
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
}
