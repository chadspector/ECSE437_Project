package group30;

import java.util.Scanner;

public class Differentiation {

    long derivTerm(String term, long x) {

        // Get coefficient
        String coeffStr = "";
        int i;
        for (i = 0; term.charAt(i) != 'x'; i++) {
            if (term.charAt(i) == ' ')
                continue;
            coeffStr += (term.charAt(i));
        }

        long coeff = Long.parseLong(coeffStr);

        String powStr = "";
        for (i = i + 2; i != term.length() && term.charAt(i) != ' '; i++) {
            powStr += term.charAt(i);
        }

        long power = Long.parseLong(powStr);

        return coeff * power * (long) Math.pow(x, power - 1);
    }

    long findDerivative(String poly, int x) {
        long res = 0;

        int i = 0;
        String[] terms = poly.split("\\+");
        while (i < terms.length) {
            res = (res + derivTerm(terms[i], x));
            i++;
        }
        return res;
    }

    void calculate() {
        String str;
        int x;

        Scanner kb = new Scanner(System.in);
        System.out.println("Polynomial Differentiation (e.g. 4x^3 + 3x^2 + 2x)");
        System.out.println(
                "Note: The input format is such that there is a white space between a term and the ‘+’ symbol");

        System.out.print("\nPolynomial: ");
        str = kb.nextLine();

        System.out.print("\nValue of x (Integer): ");
        x = kb.nextInt();

        kb.close();

        long result = findDerivative(str, x);

        System.out.println("\nDerivative of p(x) = " + str + " with x = " + x + " is p'(" + x + ") = " + result);
    }
}