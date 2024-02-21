package at.dam.oo.examples.lamp;

public class GlowElement {
    private String color;
    private int powerConsumption;
    private boolean isOn;
    private String name;

    public GlowElement(String color, int powerConsumption, boolean isOn, String name) {
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.isOn = isOn;
        this.name = name;
    }

    public void turnOn() {
        if (isOn) {
            System.out.println("Mein Name ist " + name + ". Ich bin bereits eingeschaltet.");
            this.powerConsumption += 5;
        }
        this.isOn = true;
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
}
