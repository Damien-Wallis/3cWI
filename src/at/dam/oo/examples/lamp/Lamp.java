package at.dam.oo.examples.lamp;

import at.dam.oo.remote.Battery;

import java.util.List;

public class Lamp {
    private String name;
    private List<GlowElement> glowElements;

    public Lamp(String name) {
        this.name = name;
    }

    //Methode addGlowElements
    public void addGlowElements(GlowElement glowElement) {
        this.glowElements.add(glowElement);
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
