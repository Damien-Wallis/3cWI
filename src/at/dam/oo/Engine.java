package at.dam.oo;

public class Engine {
    private FuelTank fuelTank;
    private int fuelConsumption;
    public enum TYPE {DIESEL, PETROL}
    private int horsePower;
    private TYPE type;

    public Engine(int horsePower, TYPE type, FuelTank fuelTank) {
        this.horsePower = horsePower;
        this.type = type;
        this.fuelTank = fuelTank;
    }

    //Methode drive
    public void drive(int speed) {
        if (speed > 0 && speed < 101) {
            this.fuelTank.fuelAmount -= this.fuelConsumption;
            System.out.println("I am driving with " + speed + "km/h");
        } else if (speed > 100) {
            System.out.println("You are driving too fast D:");
        } else {
            System.out.println("You are not driving");
        }
    }

    //Methode turboBoost
    public void turboBoost() {
        if (this.getFuelTank().getFuelAmount() > this.getFuelTank().getTankVolume() * 0.1) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to SuperBoostMode");
        }
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public FuelTank getFuelTank() {
        return this.fuelTank;
    }
}
