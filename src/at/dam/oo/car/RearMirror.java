package at.dam.oo.car;

public class RearMirror {
    private int size;
    private int position; // 0 = neutral, +10 = nach rechts, -10 = nach links

    public RearMirror(int size, int position) {
        this.size = size;
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
