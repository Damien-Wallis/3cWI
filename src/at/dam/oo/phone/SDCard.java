package at.dam.oo.phone;

public class SDCard {
    private PhoneFile file;
    private int capacity;

    public SDCard(PhoneFile file, int capacity) {
        this.file = file;
        this.capacity = capacity;
    }
}
