package at.dam.oo.phone;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhoneFile> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    //Methode saveFile
    public void saveFile(PhoneFile file) {
        this.files.add(file);
    }

    //Methode getAllFiles
    public void getAllFiles() {
        for (PhoneFile file: files){
            System.out.println(file.getInfo(file));
        }
    }
}
