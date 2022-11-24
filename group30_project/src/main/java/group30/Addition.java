package group30;

import java.util.Scanner;

public class Addition {

    void calculate() {
        double x, y;

        Scanner kb = new Scanner(System.in);
        System.out.println("Addition");

        System.out.print("\nFirst Number: ");
        x = kb.nextDouble();

        System.out.print("\nSecond Number: ");
        y = kb.nextDouble();

        kb.close();
        double result = x + y;
        System.out.println("\nResult: " + x + " + " + y + " = " + result);
    }
}