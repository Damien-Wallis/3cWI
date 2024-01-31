package at.dam.oo.examples.cars;

public class Car {
    private String color;
    private int topSpeed;
    private int basePrice;
    private int baseConsumption;
    private String manufacturer;
    private String engine;

    public Car(String color, int topSpeed, int basePrice, int baseConsumption, String manufacturer, String engine) {
        this.color = color;
        this.topSpeed = topSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.manufacturer = manufacturer;
        this.engine = engine;
    }
}
