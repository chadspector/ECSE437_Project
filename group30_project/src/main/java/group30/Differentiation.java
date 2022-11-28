package group30;

public class Differentiation {

    long derivTerm(String term, long x) {

        String stringCoeff = "";
        int i;
        for (i = 0; term.charAt(i) != 'x'; i++) {
            if (term.charAt(i) == ' ')
                continue;
            stringCoeff += (term.charAt(i));
        }

        long coeff = Long.parseLong(stringCoeff);

        String stringExp = "";
        for (i = i + 2; i != term.length() && term.charAt(i) != ' '; i++) {
            stringExp += term.charAt(i);
        }

        long exp = Long.parseLong(stringExp);

        return coeff * exp * (long) Math.pow(x, exp - 1);
    }

    long findDerivative(String eq, int x) {
        long res = 0;

        int i = 0;
        String[] terms = eq.split("\\+");
        while (i < terms.length) {
            res = (res + derivTerm(terms[i], x));
            i++;
        }
        return res;
    }

    long calculate(String str, int val) {

        long result = findDerivative(str, val);

        return result;
    }
}