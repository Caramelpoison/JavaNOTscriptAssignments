package healthWealth;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

public class DataWriter {
    private static final HealthDataAnalyzer dataAnalyzer = new HealthDataAnalyzer();

    public void writeHealthDataToFile(String filename, String healthSummary) {
        try (FileWriter writer = new FileWriter(filename)) {

            writer.write(healthSummary);

            System.out.println("Health data has been successfully written to the file: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}
