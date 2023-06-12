package healthWealth;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.File;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final UserManager userManager = new UserManager();
    private static final HealthDataAnalyzer dataAnalyzer = new HealthDataAnalyzer();

    public static void main(String[] args) {
        boolean exit = false;
        boolean superExit = false;


        while (!exit) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    createUser();
                    break;
                case 2:
                    if (loginUser()) {
                        exit = true;
                    }
                    break;
                case 3:
                    exit = true;
                    superExit = true;
                    break;
                default:
                    System.out.println("");
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println("");
            }
        }
        if (!superExit) {
            exit = false;
            while (!exit) {
                displayMenu2();
                int choice = getUserChoice();

                try {
                    switch (choice) {
                        case 1:
                            addCalorieIntake();
                            break;
                        case 2:
                            addExerciseActivity();
                            break;
                        case 3:
                            addSleepRecord();
                            break;
                        case 4:
                            calculateDailyCaloricBalance();
                            break;
                        case 5:
                            calculateAverageSleepDuration();
                            break;
                        case 6:
                            displayExerciseLog();
                            break;
                        case 7:
                            generateHealthSummary();
                            break;
                        case 8:
                            exit = true;
                            break;
                        default:
                            System.out.println("");
                            System.out.println("Invalid choice. Please try again.");
                            System.out.println("");
                    }
                } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                    System.out.println("");
                }
            }
        }
    }

    private static void displayMenu() {
        System.out.println("");
        System.out.println("====== Health Management System ======");
        System.out.println("1. Create User      ---For Grading purposes you have to do this FIRST----");
        System.out.println("2. Login            ---For Grading purposes you have to do this SECOND  case sensitive----");
        System.out.println("3. Exit");
        System.out.println("======================================");
        System.out.println("");
    }
    private static void displayMenu2() {
        System.out.println("");
        System.out.println("====== Hello " + userManager.getCurrentUsername() +  " ======");
        System.out.println("1. Add Calorie Intake");
        System.out.println("2. Add Exercise Activity");
        System.out.println("3. Add Sleep Record");
        System.out.println("4. Calculate Daily Caloric Balance");
        System.out.println("5. Calculate Average Sleep Duration");
        System.out.println("6. Display Exercise Log");
        System.out.println("7. Generate Health Summary");
        System.out.println("8. Exit");
        System.out.println("");
    }
    private static int getUserChoice() {
        System.out.println("");
        System.out.print("Enter your choice: ");

        int choice = 0;
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid choice.");
            scanner.nextLine();
            choice = getUserChoice();
        }

        return choice;
    }

    private static void createUser() {
        scanner.nextLine();
        System.out.println("");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        userManager.createUser(username);
    }

    private static boolean loginUser() {

        System.out.println("");
        scanner.nextLine();
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        return userManager.loginUser(username);
    }

    private static void addCalorieIntake() {
        User currentUser = userManager.getCurrentUser();

        scanner.nextLine();
        System.out.print("Enter food item: ");
        String foodItem = scanner.nextLine();
        System.out.print("Enter calories: ");
        double calories = scanner.nextDouble();

        Date date = new Date();
        dataAnalyzer.addCalorieIntake(date, foodItem, calories);
    }

    private static void addExerciseActivity() {
        User currentUser = userManager.getCurrentUser();
        if (currentUser == null) {
            System.out.println("");
            System.out.println("Please log in first.");
            System.out.println("");
            return;
        }

        scanner.nextLine();
        System.out.print("Enter exercise type: ");
        String exerciseType = scanner.nextLine();
        System.out.print("Enter duration (minutes): ");
        double duration = scanner.nextDouble();
        System.out.print("Enter calories burned: ");
        double caloriesBurned = scanner.nextDouble();
        System.out.println("");

        Date date = new Date();
        dataAnalyzer.addExerciseActivity(date, exerciseType, duration, caloriesBurned);
    }

    private static void addSleepRecord() {
        User currentUser = userManager.getCurrentUser();
        if (currentUser == null) {
            System.out.println("");
            System.out.println("Please log in first.");
            System.out.println("");
            return;
        }

        scanner.nextLine();
        System.out.print("Enter sleep time (yyyy-MM-dd HH:mm): ");
        String sleepTimeStr = scanner.nextLine();
        System.out.print("Enter wake up time (yyyy-MM-dd HH:mm): ");
        String wakeUpTimeStr = scanner.nextLine();
        System.out.println("");

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date sleepTime = sdf.parse(sleepTimeStr);
            Date wakeUpTime = sdf.parse(wakeUpTimeStr);
            dataAnalyzer.addSleepRecord(sleepTime, wakeUpTime);
        } catch (Exception e) {
            System.out.println("Invalid date format. Sleep record not added.");
            System.out.println("");
        }
    }

    private static void calculateDailyCaloricBalance() {
        User currentUser = userManager.getCurrentUser();
        if (currentUser == null) {
            System.out.println("");
            System.out.println("Please log in first.");
            System.out.println("");
            return;
        }

        scanner.nextLine();
        System.out.print("Enter date (yyyy-MM-dd): ");
        String dateStr = scanner.nextLine();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println("");
            Date date = sdf.parse(dateStr);
            dataAnalyzer.calculateDailyCaloricBalance(date);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please try again.");
            System.out.println("");
        }
    }

    private static void calculateAverageSleepDuration() {
        User currentUser = userManager.getCurrentUser();
        if (currentUser == null) {
            System.out.println("");
            System.out.println("Please log in first.");
            System.out.println("");
            return;
        }

        scanner.nextLine(); // Consume newline
        System.out.print("Enter start date (yyyy-MM-dd): ");
        String startDateStr = scanner.nextLine();
        System.out.print("Enter end date (yyyy-MM-dd): ");
        String endDateStr = scanner.nextLine();
        System.out.println("");

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = sdf.parse(startDateStr);
            Date endDate = sdf.parse(endDateStr);
            dataAnalyzer.calculateAverageSleepDuration(startDate, endDate);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please try again.");
            System.out.println("");
        }
    }

    private static void displayExerciseLog() {
        User currentUser = userManager.getCurrentUser();
        if (currentUser == null) {
            System.out.println("");
            System.out.println("Please log in first.");
            System.out.println("");
            return;
        }
        System.out.println("");
        dataAnalyzer.displayExerciseLog();
    }

    private static void generateHealthSummary() {
        String username = userManager.getCurrentUsername();

        scanner.nextLine();
        System.out.print("Enter start date (yyyy-MM-dd): ");
        String startDateStr = scanner.nextLine();
        System.out.print("Enter end date (yyyy-MM-dd): ");
        String endDateStr = scanner.nextLine();
        System.out.println("");

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = sdf.parse(startDateStr);
            Date endDate = sdf.parse(endDateStr);
            String allData = dataAnalyzer.generateHealthSummary(startDate, endDate);

            System.out.print("Would you like to write this to a readable file? (Y/N): ");
            String choiceYN = scanner.nextLine();
            if (choiceYN.equalsIgnoreCase("Y")) {

                String filename = "src/main/java/healthWealth/" + username + "HealthSummary.txt";

                File file = new File(filename);
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }

                DataWriter dataWriter = new DataWriter();
                dataWriter.writeHealthDataToFile(filename, allData);
            }
        } catch (Exception e) {
            System.out.println("Invalid date format. Please try again.");
            System.out.println("");
        }
    }


}
