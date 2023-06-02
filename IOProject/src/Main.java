import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        String directoryPath = getDirectoryPathFromUser();
        Menu(directoryPath);
    }

    private static String getDirectoryPathFromUser() {
        System.out.println("Enter the directory path: ");
        return scanner.nextLine();
    }

    private static void Menu(String directoryPath) {
        System.out.println("--- File Menu ---");
        System.out.println("1. Display directory contents");
        System.out.println("2. Copy file");
        System.out.println("3. Move file");
        System.out.println("4. Delete file");
        System.out.println("5. Create directory");
        System.out.println("6. Delete directory");
        System.out.println("7. Search files by name");
        System.out.println("8. Search files by extension");
        System.out.println("0. Exit");

        int choice = getUserChoice();
        if (choice == 1) {
            displayDirectoryContents(directoryPath);
        } else if (choice == 2) {
            copyFile(directoryPath);
        } else if (choice == 3) {
            moveFile(directoryPath);
        } else if (choice == 4) {
            deleteFile(directoryPath);
        } else if (choice == 5) {
            createDirectory(directoryPath);
        } else if (choice == 6) {
            deleteDirectory(directoryPath);
        } else if (choice == 7) {
            searchFileName(directoryPath);
        } else if (choice == 8) {
            searchFileExtension(directoryPath);
        } else if (choice == 0) {
            System.out.println("Exiting...");
            return;
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        Menu(directoryPath);
    }

    private static int getUserChoice() {
        System.out.println("Enter your choice: ");
        return scanner.nextInt();
    }

    private static void displayDirectoryContents(String directoryPath) {
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(directoryPath))) {
            System.out.println("Directory Contents:");
            for (Path path : directoryStream) {
                File file = path.toFile();
                String fileName = file.getName();
                long fileSize = file.length();
                String lastModified = dateFormat.format(file.lastModified());
                System.out.printf("Name: %s, Size: %d bytes, Last Modified: %s%n", fileName, fileSize, lastModified);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while displaying directory contents: " + e.getMessage());
        }
    }

    private static void copyFile(String directoryPath) {
        System.out.println("Enter the source file name: ");
        String sourceFileName = scanner.next();
        System.out.println("Enter the destination file name: ");
        String destinationFileName = scanner.next();

        try {
            Files.copy(Paths.get(directoryPath, sourceFileName), Paths.get(directoryPath, destinationFileName),
                    StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }
    }

    private static void moveFile(String directoryPath) {
        System.out.println("Enter the source file name: ");
        String sourceFileName = scanner.next();
        System.out.println("Enter the destination file name: ");
        String destinationFileName = scanner.next();

        try {
            Files.move(Paths.get(directoryPath, sourceFileName), Paths.get(directoryPath, destinationFileName),
                    StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while moving the file: " + e.getMessage());
        }
    }

    private static void deleteFile(String directoryPath) {
        System.out.println("Enter the file name to delete: ");
        String fileName = scanner.next();

        try {
            Files.delete(Paths.get(directoryPath, fileName));
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while deleting the file: " + e.getMessage());
        }
    }

    private static void createDirectory(String directoryPath) {
        System.out.println("Enter the directory name to create: ");
        String directoryName = scanner.next();

        try {
            Files.createDirectory(Paths.get(directoryPath, directoryName));
            System.out.println("Directory created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the directory: " + e.getMessage());
        }
    }

    private static void deleteDirectory(String directoryPath) {
        System.out.println("Enter the directory name to delete: ");
        String directoryName = scanner.next();

        try {
            Path directory = Paths.get(directoryPath, directoryName);
            Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    Files.delete(file);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    Files.delete(dir);
                    return FileVisitResult.CONTINUE;
                }
            });
            System.out.println("Directory deleted successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while deleting the directory: " + e.getMessage());
        }
    }

    private static void searchFileName(String directoryPath) {
        System.out.println("Enter the file name to search: ");
        String fileName = scanner.next();

        try {
            Files.walkFileTree(Paths.get(directoryPath), new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    String currentFileName = file.getFileName().toString();
                    if (currentFileName.equalsIgnoreCase(fileName)) {
                        System.out.println("File found: " + file.toAbsolutePath());
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            System.out.println("An error occurred while searching for files: " + e.getMessage());
        }
    }

    private static void searchFileExtension(String directoryPath) {
        System.out.println("Enter the file extension to search (e.g., .txt): ");
        String extension = scanner.next();

        try {
            Files.walkFileTree(Paths.get(directoryPath), new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    String currentFileName = file.getFileName().toString();
                    if (currentFileName.toLowerCase().endsWith(extension.toLowerCase())) {
                        System.out.println("File found: " + file.toAbsolutePath());
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            System.out.println("An error occurred while searching for files: " + e.getMessage());
        }
    }
}
