package healthWealth;

import java.text.SimpleDateFormat;
import java.util.*;

class HealthDataAnalyzer {
    private List<CalorieIntake> calorieIntakes;
    private List<ExerciseActivity> exerciseActivities;
    private List<SleepRecord> sleepRecords;
    int totalConsumedCalories = 0;
    int totalBurnedCalories = 0;
    int totalSleepHours = 0;
    int sleepRecordCount = 0;
    Map<String, Double> exerciseSummary = new HashMap<>();

    public HealthDataAnalyzer() {
        calorieIntakes = new ArrayList<>();
        exerciseActivities = new ArrayList<>();
        sleepRecords = new ArrayList<>();
    }

    public void addCalorieIntake(Date date, String foodItem, double calories) {
        CalorieIntake calorieIntake = new CalorieIntake(date, foodItem, calories);
        calorieIntakes.add(calorieIntake);
        System.out.println("Calorie intake added successfully.");
    }

    public void addExerciseActivity(Date date, String exerciseType, double duration, double caloriesBurned) {
        ExerciseActivity exerciseActivity = new ExerciseActivity(date, exerciseType, duration, caloriesBurned);
        exerciseActivities.add(exerciseActivity);
        System.out.println("Exercise activity added successfully.");
    }

    public void addSleepRecord(Date sleepTime, Date wakeUpTime) {
        SleepRecord sleepRecord = new SleepRecord(sleepTime, wakeUpTime);
        sleepRecords.add(sleepRecord);
        System.out.println("Sleep record added successfully.");
    }

    public List<CalorieIntake> getCalorieIntake() {
        return calorieIntakes;
    }

    public List<ExerciseActivity> getExerciseActivity() {
        return exerciseActivities;
    }

    public List<SleepRecord> getSleepRecord() {
        return sleepRecords;
    }

    public void calculateDailyCaloricBalance(Date date) {
        double consumedCalories = 0;
        double burnedCalories = 0;

        for (CalorieIntake calorieIntake : calorieIntakes) {
            if (isSameDay(calorieIntake.getDate(), date)) {
                consumedCalories += calorieIntake.getCalories();
            }
        }

        for (ExerciseActivity exerciseActivity : exerciseActivities) {
            if (isSameDay(exerciseActivity.getDate(), date)) {
                burnedCalories += exerciseActivity.getCaloriesBurned();
            }
        }

        double dailyCaloricBalance = consumedCalories - burnedCalories;
        System.out.println("Daily Caloric Balance on " + formatDate(date) + ": " + dailyCaloricBalance);
    }

    public void calculateAverageSleepDuration(Date startDate, Date endDate) {
        double totalSleepHours = 0;
        double sleepRecordCount = 0;

        for (SleepRecord sleepRecord : sleepRecords) {
            if (isBetweenDates(sleepRecord.getSleepTime(), startDate, endDate)) {
                long sleepDuration = sleepRecord.getWakeUpTime().getTime() - sleepRecord.getSleepTime().getTime();
                double hours = (double) (sleepDuration / (1000 * 60 * 60));
                totalSleepHours += hours;
                sleepRecordCount++;
            }
        }

        if (sleepRecordCount > 0) {
            double averageSleepHours = totalSleepHours / sleepRecordCount;
            System.out.println("Average Sleep Duration between " + formatDate(startDate) + " and " + formatDate(endDate) + ": " + averageSleepHours + " hours");
        } else {
            System.out.println("No sleep records found between " + formatDate(startDate) + " and " + formatDate(endDate));
        }
    }

    public void displayExerciseLog() {
        for (ExerciseActivity exerciseActivity : exerciseActivities) {
            System.out.println("Date: " + formatDate(exerciseActivity.getDate()));
            System.out.println("Exercise Type: " + exerciseActivity.getExerciseType());
            System.out.println("Duration: " + exerciseActivity.getDuration() + " minutes");
            System.out.println("Calories Burned: " + exerciseActivity.getCaloriesBurned());
            System.out.println("");
        }
    }

    public String generateHealthSummary(Date startDate, Date endDate) {


        for (CalorieIntake calorieIntake : calorieIntakes) {
            if (isBetweenDates(calorieIntake.getDate(), startDate, endDate)) {
                totalConsumedCalories += calorieIntake.getCalories();
            }
        }

        for (ExerciseActivity exerciseActivity : exerciseActivities) {
            if (isBetweenDates(exerciseActivity.getDate(), startDate, endDate)) {
                totalBurnedCalories += exerciseActivity.getCaloriesBurned();

                String exerciseType = exerciseActivity.getExerciseType();
                double caloriesBurned = exerciseActivity.getCaloriesBurned();

                if (exerciseSummary.containsKey(exerciseType)) {
                    caloriesBurned += exerciseSummary.get(exerciseType);
                }
                exerciseSummary.put(exerciseType, caloriesBurned);
            }
        }

        for (SleepRecord sleepRecord : sleepRecords) {
            if (isBetweenDates(sleepRecord.getSleepTime(), startDate, endDate)) {
                long sleepDuration = sleepRecord.getWakeUpTime().getTime() - sleepRecord.getSleepTime().getTime();
                double hours = (double) (sleepDuration / (1000 * 60 * 60));
                totalSleepHours += hours;
                sleepRecordCount++;
            }
        }

        double averageSleepHours = 0;
        if (sleepRecordCount > 0) {
            averageSleepHours = totalSleepHours / sleepRecordCount;
        }

        System.out.println("");
        System.out.println("Health Summary between " + formatDate(startDate) + " and " + formatDate(endDate));
        System.out.println("Total Calories Consumed: " + totalConsumedCalories);
        System.out.println("Total Calories Burned: " + totalBurnedCalories);
        System.out.println("Average Sleep Duration: " + averageSleepHours + " hours");
        System.out.println("Exercise Summary:");
        for (String exerciseType : exerciseSummary.keySet()) {
            System.out.println(exerciseType + ": " + exerciseSummary.get(exerciseType) + " calories burned");
            System.out.println("");
        }

        StringBuilder summaryBuilder = new StringBuilder();
        summaryBuilder.append("\nHealth Summary between ").append(formatDate(startDate)).append(" and ").append(formatDate(endDate)).append("\n");
        summaryBuilder.append("Total Calories Consumed: ").append(totalConsumedCalories).append("\n");
        summaryBuilder.append("Total Calories Burned: ").append(totalBurnedCalories).append("\n");
        summaryBuilder.append("Average Sleep Duration: ").append(averageSleepHours).append(" hours").append("\n");
        summaryBuilder.append("Exercise Summary:").append("\n");
        for (String exerciseType : exerciseSummary.keySet()) {
            summaryBuilder.append(exerciseType).append(": ").append(exerciseSummary.get(exerciseType)).append(" calories burned").append("\n");
            summaryBuilder.append("\n");
        }
        return summaryBuilder.toString();
    }

    private boolean isSameDay(Date date1, Date date2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date1).equals(sdf.format(date2));
    }

    private boolean isBetweenDates(Date date, Date startDate, Date endDate) {
        return date.compareTo(startDate) >= 0 && date.compareTo(endDate) <= 0;
    }

    private String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
}
