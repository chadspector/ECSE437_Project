package group30;

import java.util.Scanner;

public class Division {

    void calculate() {
        float x, y;

        Scanner kb = new Scanner(System.in);
        System.out.println("Division");

        System.out.print("\nFirst Number: ");
        x = kb.nextFloat();

        System.out.print("\nSecond Number: ");
        y = kb.nextFloat();

        if (y == 0) {
            System.out.println("Error: Cannot perform division by zero");
        } else {
            float result = x / y;
            System.out.println("\nResult: " + x + " / " + y + " = " + result);
        }
        kb.close();
    }
}