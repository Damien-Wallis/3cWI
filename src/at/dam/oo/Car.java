package at.dam.oo;

public class Car {
    //Instanz / Gedächtnisverhalten

    //dont do that later
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    public String color;
    public int tankVolume;

    //Methode drive
    public void drive() {
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving");
    }

    //Methode brake
    public void brake(){
        System.out.println("I am braking");
    }

    //Methode turboBoost
    public void turboBoost(){
        if (fuelAmount > this.tankVolume * 0.1){
            System.out.println("SuperBoostMode");
        }
        else {
            System.out.println("Not enough fuel to go to SuperBoostMode");
        }
    }
}
