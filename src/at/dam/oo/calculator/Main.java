package at.dam.oo.calculator;

public class Main {
    public static void main(String[] args) {
        BaseCalculator baseCalculator = new BaseCalculator();
        RootCalculator rootCalculator = new RootCalculator();
        ScienceCalculator scienceCalculator = new ScienceCalculator();

        //BaseCalculater-Funktionen
        System.out.println(baseCalculator.add(3, 5));
        System.out.println(baseCalculator.subtract(2, 3));
        System.out.println(baseCalculator.multiply(8, 7));
        System.out.println(baseCalculator.divide(2, 3));
        System.out.println(" ");

        //RootCalculator-Funktionen
        System.out.println(rootCalculator.sqrrt(4));
        System.out.println(rootCalculator.add(2, 4));
        System.out.println(" ");

        //ScienceCalculator-Funktionen
        System.out.println(scienceCalculator.sinus(360));
        System.out.println(scienceCalculator.cosinus(360));
        System.out.println(scienceCalculator.sqrrt(9));
        System.out.println(scienceCalculator.add(5,9));
    }
}
