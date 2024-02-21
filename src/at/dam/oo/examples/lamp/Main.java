package at.dam.oo.examples.lamp;

public class Main {
    public static void main(String[] args) {
        //GlowElements
        GlowElement glowElement1 = new GlowElement("red", 5, true, "Simon");
        GlowElement glowElement2 = new GlowElement("blue", 3, false, "Luan");

        Lamp lamp = new Lamp("Dragan (Drache)");
        lamp.addGlowElements(glowElement1);
        lamp.addGlowElements(glowElement2);
        glowElement1.turnOn();
        System.out.println(glowElement1.isOn());
        System.out.println(glowElement2.isOn());
    }
}
