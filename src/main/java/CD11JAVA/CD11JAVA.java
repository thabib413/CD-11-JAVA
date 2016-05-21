package CD11JAVA;

import java.util.Scanner;

/**
 * Created by taiseerhabib on 5/21/16.
 */
public class CD11JAVA {

    public static void main(String[] args) {

        String alice = "Alice";
        String bob = "Bob";
        String userInput;

        System.out.println("Please Enter your name below: \n(type 'exit' to quit)\n");

        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextLine();

        while (!(userInput.equals(alice)) || !(userInput.equals(bob))) {
            if (userInput.equals(alice)) {
                System.out.println("Hello Alice!");
                break;
            } else if (userInput.equals(bob)) {
                System.out.println("Hello Bob!");
                break;
            } else if(userInput.equals("exit")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Please enter your name again: \n");
                userInput = scanner.nextLine();
            }
        }
    }
}
