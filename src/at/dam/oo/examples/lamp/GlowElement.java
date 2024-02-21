package at.dam.oo.examples.lamp;

public class GlowElement {
    private String color;
    private int powerConsumption;
    private boolean isOn;

    public GlowElement(String color, int powerConsumption, boolean isOn) {
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.isOn = isOn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        this.isOn = true;
    }
}
