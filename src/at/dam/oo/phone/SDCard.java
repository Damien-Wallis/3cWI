package at.dam.oo.phone;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private PhoneFile file;
    private int capacity;
    private List<PhoneFile> files;

    public SDCard(PhoneFile file, int capacity) {
        this.file = file;
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    //Methode saveFile
    public void saveFile(PhoneFile file) {
        this.files.add(file);
    }
}
