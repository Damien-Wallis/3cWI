package at.dam.oo.calculator;

public class BaseCalculator {

    public double add(double a, double b) {
        System.out.print("Summe von " + a + " und " + b +": ");
        return a + b;
    }

    public double subtract(double a, double b) {
        System.out.print("Differenz von " + a + " und " + b +": ");
        return a - b;
    }

    public double multiply(double a, double b) {
        System.out.print("Produkt von " + a + " und " + b +": ");
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.print("Division durch 0 nicht möglich");
            return 0;
        } else {
            System.out.print("Quotient von " + a + " und " + b +": ");
            return a / b;
        }
    }
}
