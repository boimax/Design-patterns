package Observer.Exam;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Enter Text: ");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println("Received response: " + line);
            System.out.println("Character count: " + line.length());
            System.out.println("Uppercase: " + line.toUpperCase());
        }
        scanner.close();
    }
}
