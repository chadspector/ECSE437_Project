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
        System.out.println("6. Exponential");
        System.out.println("7. Square Root");

        System.out.print("\nWhat operation would you like to do: ");

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
                Multiplication mult = new Multiplication();
                mult.calculate();
                break;
            case 4:
                Division div = new Division();
                div.calculate();
                break;
            case 5:
                Differentiation diff = new Differentiation();
                diff.calculate();
                break;
            case 6:
                Exponent exp = new Exponent();
                exp.calculate();
                break;
            case 7:
                break;
            default:
                System.out.print("Please pick a valid option!");

        }
        System.out.println();
        kb.close();

    }
}
