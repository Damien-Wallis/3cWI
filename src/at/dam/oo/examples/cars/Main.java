package at.dam.oo.examples.cars;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(180, Engine.type.Diesel);
        Manufacturer m1 = new Manufacturer("Honda", "Japan", 0.2);

        Car c1 = new Car(
                "red",
                215,
                10000,
                5,
                m1,
                e1,
                25000
        );
        c1.getBasePrice();
        c1.getNewPrice();
    }
}
