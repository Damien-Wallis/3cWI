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
        for (PhoneFile file : files) {
            System.out.println(file.getInfo(file));
        }
    }

    //Methode getFreeSpace
    public int getFreeSpace() {
        int sum = 0;
        for (PhoneFile file : files) {
            sum += file.getSize();
        }
        System.out.print("remaining space in MB: ");
        return this.capacity - sum;
    }
}
