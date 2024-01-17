package at.dam.oo;

import java.util.ArrayList;
import java.util.List;

public class Car {
    //Instanz / Gedächtnisverhalten

    //dont do that later
    private Engine engine;
    private FuelTank fuelTank;
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private String color;
    private List<RearMirror> mirrors;
    private List<Tyre> tyres;

    public Car(Engine engine, FuelTank fuelTank, int fuelConsumption, String brand, String serialNumber, String color) {
        this.engine = engine;
        this.fuelTank = fuelTank;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.mirrors = new ArrayList<>();
        this.tyres = new ArrayList<>();
    }

    //Methode drive
    public void drive(int speed) {
        this.engine.drive(speed);
    }

    //Methode brake
    public void brake() {
        System.out.println("I am braking");
    }

    //Methode turboBoost
    public void turboBoost() {
        this.engine.turboBoost();
    }

    //Methode honk
    public void honk(int amountOfRepitions) {
        for (int i = 0; i < amountOfRepitions; i++) {
            System.out.println("Tuuut");
        }
    }

    //Methode getRemainingRange
    public void getRemainingRange() {
        double remainingRange = (double) this.fuelTank.fuelAmount / this.fuelConsumption;
        System.out.println("You can still drive " + remainingRange + "km");
    }

    //Methode addMirror
    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    //Methode addTyre
    public void addTyre(Tyre tyre){
        this.tyres.add(tyre);
    }

    //Setter
    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    //Getter
    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public List<Tyre> getTyres() {
        return tyres;
    }
}

