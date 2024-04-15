package at.dam.test;

public class Main {
    public static void main(String[] args) {
        //Objekte
        Passenger p1 = new Passenger("Damien", "Wallis");
        Passenger p2 = new Passenger("Dragan", "Nikolic");

        Position vienna = new Position(200, 178);
        Position melbourne = new Position(89, 109);

        Plane pl1 = new Plane("Airbus 1", vienna);

        //Befehle
        p1.inform("Your food will be brought to you in 5 min.");

        pl1.addPassengers(p1);
        pl1.addPassengers(p2);
        pl1.informPassengers("The flight will be delayed by 30 min.");
    }
}
