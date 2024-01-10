package at.dam.oo;

public class Main {
    public static void main(String[] args) {


        //Tanks
        FuelTank tank1 = new FuelTank(100, 150);
        FuelTank tank2 = new FuelTank(70, 80);

        //Engine 1
        Engine engine1 = new Engine(140, Engine.TYPE.DIESEL, tank1);



        //Car 1
        Car c1 = new Car(
                engine1,
                tank1,
                9,
                "Porsche",
                "P911",
                "cyan"
        );

        //Car 2
        Car c2 = new Car(
                engine1,
                tank2,
                70,
                "Honda",
                "H123",
                "yellow"
        );

        //Methode drive
        System.out.println("Current fuel amount is " + c2.getFuelTank().getFuelAmount());
        c2.drive(200);
        System.out.println("Current fuel amount is " + c2.getFuelTank().getFuelAmount());

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
