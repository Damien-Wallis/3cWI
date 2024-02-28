package at.dam.oo.calculator;

public class BaseCalculator {

    public double add(double a, double b) {
        System.out.print("Summe: ");
        return a + b;
    }

    public double subtract(double a, double b) {
        System.out.print("Differenz: ");
        return a - b;
    }

    public double multiply(double a, double b) {
        System.out.print("Produkt: ");
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.print("Division durch 0 nicht möglich");
            return 0;
        } else {
            System.out.print("Quotient: ");
            return a / b;
        }
    }
}
