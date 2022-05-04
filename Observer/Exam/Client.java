/*
This example is taken from the SWE Design final exam of previous intake CS2018
*/

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        LineSource lineSource = new LineSource();

        ReceivedResponse receivedResponse = new ReceivedResponse(lineSource);
        CharacterCount characterCount = new CharacterCount(lineSource);
        Uppercase uppercase = new Uppercase(lineSource);

        System.out.println("Enter Text: ");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String lineSourceScanner = scanner.nextLine();
            lineSource.setLineSource(lineSourceScanner);
        }
        scanner.close();
    }
}
