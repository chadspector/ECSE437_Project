package group30;

import java.util.Scanner;

public class SquareRoot {

    void calculate() {
        double x;

        Scanner kb = new Scanner(System.in);
        System.out.println("Square Root");

        System.out.print("\nNumber: ");
        x = kb.nextDouble();

        kb.close();
        double result = Math.sqrt(x);
        System.out.println("\nResult: sqrt(" + x + ") = " + result);
    }
}