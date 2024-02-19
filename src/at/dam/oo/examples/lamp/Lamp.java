package at.dam.oo.examples.lamp;

import java.util.List;

public class Lamp {
    private String name;
    private List<GlowElement> glowElements;

    public Lamp(String name, List<GlowElement> glowElements) {
        this.name = name;
        this.glowElements = glowElements;
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
