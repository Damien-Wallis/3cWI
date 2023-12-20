package at.dam.oo;

public class Engine {
    public enum TYPE {DIESEL, PETROL}

    private int horsePower;
    private TYPE type;

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }



    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }


}
