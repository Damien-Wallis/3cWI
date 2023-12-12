package at.dam.oo;

public class Main {
    public static void main(String[] args) {

        //Auto 1
        Car c1 = new Car(
                9,
                10,
                "Porsche",
                "P911",
                "cyan",
                150
        );

        //Auto 2
        Car c2 = new Car(
                4,
                70,
                "Honda",
                "H123",
                "yellow",
                80
        );
        c2.setFuelAmount(50);

        //Methode drive
        System.out.println("Current fuel amount is " + c2.getFuelAmount());
        c2.drive();
        System.out.println("Current fuel amount is " + c2.getFuelAmount());

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
