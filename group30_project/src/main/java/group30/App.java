package group30;

import java.util.Scanner;

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

        double x, y, res;

        switch (choice) {
            case 1:

                System.out.println("Addition");

                System.out.print("\nFirst Number: ");
                x = kb.nextDouble();

                System.out.print("\nSecond Number: ");
                y = kb.nextDouble();

                Addition add = new Addition();
                res = add.calculate(x, y);

                System.out.println("\nResult: " + x + " + " + y + " = " + res);
                break;
            case 2:

                System.out.println("Subtraction");

                System.out.print("\nFirst Number: ");
                x = kb.nextDouble();

                System.out.print("\nSecond Number: ");
                y = kb.nextDouble();

                Subtraction sub = new Subtraction();
                res = sub.calculate(x, y);

                System.out.println("\nResult: " + x + " - " + y + " = " + res);
                break;
            case 3:
                System.out.println("Multiplication");

                System.out.print("\nFirst Number: ");
                x = kb.nextDouble();

                System.out.print("\nSecond Number: ");
                y = kb.nextDouble();

                Multiplication mult = new Multiplication();
                res = mult.calculate(x, y);

                System.out.println("\nResult: " + x + " * " + y + " = " + res);
                break;
            case 4:
                System.out.println("Division");

                System.out.print("\nFirst Number: ");
                x = kb.nextDouble();

                System.out.print("\nSecond Number: ");
                y = kb.nextDouble();

                if (y == 0) {
                    System.out.println("Error: Cannot perform division by zero");
                } else {
                    Division div = new Division();
                    res = div.calculate(x, y);
                    System.out.println("\nResult: " + x + " / " + y + " = " + res);
                }
                break;
            case 5:
                System.out.println("Polynomial Differentiation (e.g. 4x^3 + 3x^2 + 2x)");
                System.out.println(
                        "Note: The input format is such that there is a white space between a term and the ‘+’ symbol");

                System.out.print("\nPolynomial: ");
                String str = kb.nextLine();

                System.out.print("\nValue of x (Integer): ");
                int val = kb.nextInt();

                Differentiation diff = new Differentiation();

                long result = diff.calculate(str, val);

                System.out.println(
                        "\nDerivative of p(x) = " + str + " with x = " + val + " is p'(" + val + ") = " + result);
                break;
            case 6:
                System.out.println("Exponential (x^y)");

                System.out.print("\nFirst Number (x): ");
                x = kb.nextDouble();

                System.out.print("\nSecond Number (y): ");
                y = kb.nextDouble();

                Exponent exp = new Exponent();

                res = exp.calculate(x, y);

                System.out.println("\nResult: " + x + "^" + y + " = " + res);
                break;
            case 7:
                System.out.println("Square Root");

                System.out.print("\nNumber: ");
                x = kb.nextDouble();

                SquareRoot sqrt = new SquareRoot();
                res = sqrt.calculate(x);

                System.out.println("\nResult: sqrt(" + x + ") = " + res);
                break;
            default:
                System.out.print("Please pick a valid option!");

        }
        System.out.println();
        kb.close();

    }
}
