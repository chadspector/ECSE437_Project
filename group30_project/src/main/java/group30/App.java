package group30;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Advanced Calculator");

        System.out.println("\nHere are your options:");
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Differentiation");
        System.out.println("6. Integration (using Simpson's rule)");

        System.out.print("\nWhat would you like to do?: ");

        int choice = kb.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                break;
            case 2:
                Subtraction sub = new Subtraction();
                sub.calculate();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.print("Please pick a valid option!");

        }
        System.out.println();
        kb.close();

    }
}
