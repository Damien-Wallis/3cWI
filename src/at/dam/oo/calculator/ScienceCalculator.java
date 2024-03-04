package at.dam.oo.calculator;

public class ScienceCalculator extends RootCalculator {
    public double sinus(double a){
        double sum = 0;
        if (a >= -360 && a <= 360){
            sum = Math.sin(a);
            System.out.print("Sinus von " + a + " = ");
        }return sum;
    }

    public double cosinus(double a){
        double sum = 0;
        if (a >= -360 && a <= 360){
            sum = Math.cos(a);
            System.out.print("Cosinus von " + a + " = ");
        }return sum;
    }
}