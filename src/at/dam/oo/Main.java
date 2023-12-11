package at.dam.oo;

public class Main {
    public static void main(String[] args) {

        //Auto 1
        Car c1 = new Car();
        c1.brand = "Porsche";
        c1.fuelConsumption = 9;
        c1.serialNumber = "P911";
        c1.fuelAmount = 10;
        c1.color = "cyan";
        c1.tankVolume = 150;

        //Auto 2
        Car c2 = new Car();
        c2.brand = "Honda";
        c2.fuelConsumption = 4;
        c2.serialNumber = "H123";
        c2.fuelAmount = 70;
        c2.color = "yellow";
        c2.tankVolume = 80;

        //Methode drive
        System.out.println("Current fuel amount is " + c2.fuelAmount);
        c2.drive();
        System.out.println("Current fuel amount is " + c2.fuelAmount);

        //Methode brake
        c1.brake();

        //Methode TurboBoostMode
        System.out.print("Car 1: ");
        c1.turboBoost();
        System.out.print("Car 2: ");
        c2.turboBoost();

        //Methode honk
        System.out.print("Car 1: ");
        c1.honk(3);
        System.out.print("Car 2: ");
        c2.honk(2);

        //Methode getRemainingRange
        System.out.print("Car 1: ");
        c1.getRemainingRange();
        System.out.print("Car 2: ");
        c2.getRemainingRange();

    }
}
