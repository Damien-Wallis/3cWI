package at.dam.oo;

public class Tyre {
    private int width;

    public enum TYRETYPE {WINTER, SUMMER, ALLSEASON}

    private TYRETYPE type;

    public Tyre(int width, TYRETYPE type) {
        this.width = width;
        this.type = type;
    }

    public int getwidth() {
        return width;
    }

    public void setwidth(int width) {
        this.width = width;
    }

    public TYRETYPE getType() {
        return type;
    }

    public void setType(TYRETYPE type) {
        this.type = type;
    }


}
