package at.dam.oo.examples.cars;

public class Car {
    private String color;
    private int topSpeed;
    private double basePrice;
    private int baseConsumption;
    private Manufacturer manufacturer;
    private Engine engine;
    private int mileage;

    public Car(String color, int topSpeed, double basePrice, int baseConsumption, Manufacturer manufacturer, Engine engine, int mileage) {
        this.color = color;
        this.topSpeed = topSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.mileage = mileage;
    }

    public void getNewPrice() {
        double newPrice = this.basePrice * this.manufacturer.getDiscount();
        System.out.println("new price: " + newPrice + "€");
    }

    public void getFuelConsumption() {
        double fuelConsumption = 0;
        if (mileage <= 50000) {
            fuelConsumption = this.baseConsumption;
        }
        else {
            fuelConsumption = this.baseConsumption * 1.098;
        }
        System.out.println("current fuel consumption: " + fuelConsumption);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void getBasePrice() {
        System.out.println("base price: " + basePrice + "€");
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public int getBaseConsumption() {
        return baseConsumption;
    }

    public void setBaseConsumption(int baseConsumption) {
        this.baseConsumption = baseConsumption;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
