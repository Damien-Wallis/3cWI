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
    public void getInfo(){
        System.out.println(name + extension + ": " + size + "MB");
    }
}
