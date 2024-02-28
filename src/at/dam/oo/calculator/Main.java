package at.dam.oo.calculator;

public class Main {
    public static void main(String[] args) {
        BaseCalculator baseCalculator = new BaseCalculator();
        System.out.println(baseCalculator.add(3,5));
        System.out.println(baseCalculator.subtract(2,3));
        System.out.println(baseCalculator.multiply(8,7));
        System.out.println(baseCalculator.divide(2,3));
    }
}
