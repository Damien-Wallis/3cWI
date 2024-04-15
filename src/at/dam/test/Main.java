package at.dam.test;

public class Main {
    public static void main(String[] args) {
        //Objekte
        Passenger p1 = new Passenger("Damien", "Wallis");
        Passenger p2 = new Passenger("Dragan", "Nikolic");
        Passenger p3 = new Passenger("David", "Sienz");

        Position vienna = new Position(200, 178);
        Position melbourne = new Position(89, 109);

        Plane pl1 = new Plane("Airbus 1", vienna);
        Plane pl2 = new Plane("Airbus 2", melbourne);

        TrafficController tc1 = new TrafficController();

        //Befehle
        p2.inform("text");

        pl1.addPassengers(p1);
        pl1.addPassengers(p2);
        pl2.addPassengers(p3);
        pl1.informPassengers("The flight will be delayed by 30 min.");

        tc1.addPlanes(pl1);
        tc1.addPlanes(pl2);
        System.out.println("All Planes: ");
        tc1.printAllPlanes();

        tc1.informPeopleOnAllPlanes("The flight is taking off");
    }
}
