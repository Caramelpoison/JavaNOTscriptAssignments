import java.io.*;
import java.util.*;

public class TextSort {
    public static void main(String[] args) {
        String inputFilePath ="src/colors.txt";
        String outputFilePath = "src/colors2.txt";
        List <String> lines = new ArrayList<>();

try(BufferedReader reader = new BufferedReader((new FileReader(inputFilePath)))){
    String line;
    while((line = reader.readLine()) != null) {
        lines.add(line);
    }
    }catch (IOException e){
        System.out.print("Error reading file");
        e.printStackTrace();
    }
System.out.println("Unsorted: " + lines);
Collections.sort(lines);
System.out.println("Sorted: " + lines);

try {
    File outputFile = new File(outputFilePath);
    if (outputFile.createNewFile()) {
        System.out.println("File created: " + outputFile.getName());

    } else {
        System.out.println("File already exists. Will be updated with new content");
    }
    BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
    for (String sortedLine: lines){
        writer.write(sortedLine);
        writer.newLine();
    }
    writer.close();
    System.out.println("Data written to file.");
}catch (IOException e) {
    e.printStackTrace();
}

}
    }
