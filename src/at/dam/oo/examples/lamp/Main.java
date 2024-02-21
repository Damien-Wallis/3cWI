package at.dam.oo.examples.lamp;

public class Main {
    public static void main(String[] args) {
        //GlowElements
        GlowElement glowElement1 = new GlowElement("red", 5, true);
        GlowElement glowElement2 = new GlowElement("blue", 3, true);

        Lamp lamp = new Lamp("Dragan (Drache)");
        lamp.addGlowElements(glowElement2);
    }
}
