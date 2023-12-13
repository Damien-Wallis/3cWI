package at.dam.oo;

public class Car {
    //Instanz / Gedächtnisverhalten

    //dont do that later
    private Engine engine;
    private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;
    private int tankVolume;

    public Car(Engine engine, int fuelConsumption, int fuelAmount, String brand, String serialNumber, String color, int tankVolume) {
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.tankVolume = tankVolume;

    }

    //Methode drive
    public void drive() {
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving");
    }

    //Methode brake
    public void brake() {
        System.out.println("I am braking");
    }

    //Methode turboBoost
    public void turboBoost() {
        if (fuelAmount > this.tankVolume * 0.1) {
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
        double remainingRange = (double) this.fuelAmount / this.fuelConsumption;
        System.out.println("You can still drive " + remainingRange + "km");
    }

    //Setter
    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
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

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    //Getter
    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getFuelAmount() {
        return fuelAmount;
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

    public int getTankVolume() {
        return tankVolume;
    }

    public Engine getEngine() {
        return engine;
    }
}

