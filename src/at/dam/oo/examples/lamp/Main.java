package at.dam.oo.examples.lamp;

public class Main {
    public static void main(String[] args) {
        //GlowElements
        GlowElement glowElement1 = new GlowElement("red", 5, false);
        GlowElement glowElement2 = new GlowElement("blue", 3, true);

        Lamp lamp = new Lamp("Dragan (Drache)");
        lamp.addGlowElements(glowElement1);
        glowElement1.turnOn();
        System.out.println(glowElement1.isOn());
    }
}
