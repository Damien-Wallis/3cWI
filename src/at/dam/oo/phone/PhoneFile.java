package at.dam.oo.phone;

public class PhoneFile {
    private String extension;
    private int size;
    private String name;

    public PhoneFile(String extension, int size, String name) {
        this.extension = "." + extension;
        this.size = size;
        this.name = name;

    }
    public String getInfo(PhoneFile file){
        return name + extension + ": " + size + "MB";
    }
}
