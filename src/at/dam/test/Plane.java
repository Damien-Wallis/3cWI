package at.dam.test;

import at.dam.oo.car.RearMirror;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private String name;
    private Position position;
    private List<Passenger> passengers;

    public Plane(String name, Position position) {
        this.name = name;
        this.position = position;
        this.passengers = new ArrayList<>();
    }

    //Methode addPassengers
    public void addPassengers(Passenger passenger) {
        this.passengers.add(passenger);
    }

    //Methode informPassengers
    public String informPassengers(String message) {
        for (Passenger passenger : this.passengers) {
            passenger.inform(message);
        }
        return message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}
