package at.dam.oo;

public class Main {
    public static void main(String[] args) {


        //Tanks
        FuelTank tank1 = new FuelTank(100, 150);
        FuelTank tank2 = new FuelTank(70, 80);

        //Engine
        Engine engine1 = new Engine(140, Engine.TYPE.DIESEL, tank1);

        //RearMirrors
        RearMirror c1mirror1 = new RearMirror(100, 40);
        RearMirror c1mirror2 = new RearMirror(100, -40);
        RearMirror c2mirror1 = new RearMirror(80, 16);
        RearMirror c2mirror2 = new RearMirror(80, -16);

        //Tyres
        Tyre c1tyres = new Tyre(205, Tyre.TYRETYPE.SUMMER);
        Tyre c2tyres = new Tyre(185, Tyre.TYRETYPE.ALLSEASON);

        Car c1 = new Car(
                engine1,
                tank1,
                9,
                "Porsche",
                "P911",
                "cyan"
        );
        c1.addMirror(c1mirror1);
        c1.addMirror(c1mirror2);

        c1.addTyre(c1tyres);
        c1.addTyre(c1tyres);
        c1.addTyre(c1tyres);
        c1.addTyre(c1tyres);

        //Car 2
        Car c2 = new Car(
                engine1,
                tank2,
                70,
                "Honda",
                "H123",
                "yellow"
        );
        c2.addMirror(c2mirror1);
        c2.addMirror(c2mirror2);

        c2.addTyre(c2tyres);
        c2.addTyre(c2tyres);
        c2.addTyre(c2tyres);
        c2.addTyre(c2tyres);


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

        System.out.print("Car 1: MirrorPosition: ");
        System.out.println(c1.getMirrors().get(0).getPosition());

        System.out.print("Car 2: MirrorPosition: ");
        System.out.println(c2.getMirrors().get(1).getPosition());

        System.out.print("Car 1: TyreType: ");
        System.out.println(c1.getTyres().get(0).getType());

        System.out.print("Car 2: TyreType: ");
        System.out.println(c2.getTyres().get(1).getType());
    }
}
