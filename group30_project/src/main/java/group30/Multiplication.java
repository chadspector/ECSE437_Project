package group30;

import java.util.Scanner;

public class Multiplication {

    void calculate() {
        float x, y;

        Scanner kb = new Scanner(System.in);
        System.out.println("Multiplication");

        System.out.print("\nFirst Number: ");
        x = kb.nextFloat();

        System.out.print("\nSecond Number: ");
        y = kb.nextFloat();

        kb.close();
        float result = x * y;
        System.out.println("\nResult: " + x + " * " + y + " = " + result);
    }
}