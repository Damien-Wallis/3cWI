package at.dam.oo.examples.cars;

public class Engine {
    private int horsePower;
    public enum type {Diesel, Petrol};
    private type type;

    public Engine(int horsePower, Engine.type type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setType(Engine.type type) {
        this.type = type;
    }
}
