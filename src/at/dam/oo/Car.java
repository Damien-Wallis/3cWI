package at.dam.oo;

public class Car {
    //Instanz / Gedächtnisverhalten

    //dont do that later
    private Engine engine;
    private FuelTank fuelTank;
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private String color;

    public Car(Engine engine, FuelTank fuelTank,int fuelConsumption, String brand, String serialNumber, String color){
        this.engine = engine;
        this.fuelTank = fuelTank;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;

    }

    //Methode drive
    public void drive(int speed) {
        if(speed > 0 && speed < 101){
            this.fuelTank.fuelAmount -= this.fuelConsumption;
            System.out.println("I am driving with " + speed + "km/h");
        }
        else if(speed > 100){
            System.out.println("You are driving too fast D:");
        }
        else{
            System.out.println("You are not driving");
        }

    }

    //Methode brake
    public void brake() {
        System.out.println("I am braking");
    }

    //Methode turboBoost
    public void turboBoost() {
        if (this.fuelTank.fuelAmount > this.fuelTank.fuelAmount * 0.1) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to SuperBoostMode");
        }
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
}

