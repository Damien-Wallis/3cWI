package at.dam.oo;

public class Main {
    public static void main(String[] args) {
        int a = 7;

        //Auto 1
        Car c1 = new Car();
        c1.brand = "Porsche";
        c1.fuelConsumption = 9;
        c1.serialNumber = "P911";
        c1.fuelAmount = 20;
        c1.color = "cyan";

        //Auto 2
        Car c2 = new Car();
        c2.brand = "Honda";
        c2.fuelConsumption = 4;
        c2.serialNumber = "H123";
        c2.fuelAmount = 70;
        c2.color = "yellow";

        //Methode drive
        System.out.println("Current fuel amount is " + c2.fuelAmount);
        c2.drive();
        System.out.println("Current fuel amount is " + c2.fuelAmount);

        //Methode brake
        c1.brake();
    }
}
