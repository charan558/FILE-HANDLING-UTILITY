import java.io.*;
import java.util.Scanner;

public class task1 {
    
    // Method to read a file
    public static void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("\nFile Contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Method to write to a file (overwrites existing content)
    public static void writeFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("\nFile written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    // Method to modify (append) content to a file
    public static void modifyFile(String filePath, String newContent) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.newLine();  // Move to the next line
            writer.write(newContent);
            System.out.println("\nFile modified successfully.");
        } catch (IOException e) {
            System.out.println("Error modifying file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter file path (or filename): ");
        String filePath = scanner.nextLine();

        System.out.print("Enter content to write to the file: ");
        String content = scanner.nextLine();
        writeFile(filePath, content);

        readFile(filePath);

        System.out.print("\nEnter content to append to the file: ");
        String additionalContent = scanner.nextLine();
        modifyFile(filePath, additionalContent);

        readFile(filePath);

        scanner.close();
    }
}
