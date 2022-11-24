package group30;

import java.util.Scanner;

public class Exponent {

    void calculate() {
        double x, y;

        Scanner kb = new Scanner(System.in);
        System.out.println("Exponential (x^y)");

        System.out.print("\nFirst Number (x): ");
        x = kb.nextFloat();

        System.out.print("\nSecond Number (y): ");
        y = kb.nextFloat();

        kb.close();
        double result = Math.pow(x, y);
        System.out.println("\nResult: " + x + "^" + y + " = " + result);
    }
}