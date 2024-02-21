package at.dam.oo.examples.lamp;

public class Main {
    public static void main(String[] args) {
        //GlowElements
        GlowElement glowElement1 = new GlowElement("red", 5, false);
        GlowElement glowElement2 = new GlowElement("blue", 3, false);

        Lamp lamp = new Lamp("Dragan (Drache)");
        lamp.addGlowElements(glowElement1);
        lamp.addGlowElements(glowElement2);
        lamp.turnAllOn();
        System.out.println(glowElement1.isOn());
        System.out.println(glowElement2.isOn());
    }
}
