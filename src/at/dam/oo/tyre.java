package at.dam.oo;

public class tyre {
    private int size;

    public enum TYRETYPE {WINTER, SUMMER, ALLSEASON}

    private TYRETYPE type;

    public tyre(int size, TYRETYPE type) {
        this.size = size;
        this.type = type;
    }
    
}
