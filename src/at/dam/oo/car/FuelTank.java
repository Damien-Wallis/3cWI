package at.dam.oo.car;

public class FuelTank {
    public int fuelAmount;
    public int tankVolume;

    public FuelTank(int fuelAmount, int tankVolume) {
        this.fuelAmount = fuelAmount;
        this.tankVolume = tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getFuelAmount() {
        return this.fuelAmount;
    }

    public int getTankVolume() {
        return tankVolume;
    }
}
