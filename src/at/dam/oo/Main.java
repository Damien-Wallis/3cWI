package at.dam.oo;

public class Main {
    public static void main(String[] args) {
        int a = 7;

        Car c1 = new Car();
        c1.brand = "Porsche";
        c1.fuelConsumption = 9;
        c1.serialNumber = "P911";

        Car c2 = new Car();
        c2.brand = "Honda";
        c2.fuelConsumption = 4;
        c2.serialNumber = "H123";

        System.out.println(c1.serialNumber);
        System.out.println(c2.brand);
    }
}
