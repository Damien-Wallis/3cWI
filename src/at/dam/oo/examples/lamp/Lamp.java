package at.dam.oo.examples.lamp;

import at.dam.oo.remote.Battery;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private String name;
    private List<GlowElement> glowElements;

    public Lamp(String name) {
        this.name = name;
        this.glowElements = new ArrayList<>();
    }

    //Methode addGlowElements
    public void addGlowElements(GlowElement glowElement) {
        this.glowElements.add(glowElement);
    }

    //Methode turnAllOn
    public void turnAllOn() {
        for (GlowElement glowElement : this.glowElements) {
            glowElement.turnOn();
        }
    }

    //Methode getOverallPowerUsage
    public double getOverallPowerUsage() {
        double powerUsage = 0;
        for (GlowElement glowElement : this.glowElements) {
            powerUsage += glowElement.getPowerConsumption();
        }
        System.out.println("Overall Power Usage: " + powerUsage);
        return powerUsage;
    }

    public void printNamesOfLightElements() {
        for (GlowElement glowElement: glowElements) {
            System.out.println(glowElement.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GlowElement> getGlowElements() {
        return glowElements;
    }

    public void setGlowElements(List<GlowElement> glowElements) {
        this.glowElements = glowElements;
    }
}
