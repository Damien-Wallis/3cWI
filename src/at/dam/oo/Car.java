package at.dam.oo;

public class Car {
    //Instanz / Gedächtnisverhalten

    //dont do that later
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    public String color;

    //Methode drive
    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

}
