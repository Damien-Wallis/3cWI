package at.dam.oo.phone;

public class Camera {
    private int resolution;
    SDCard sdCard;

    public Camera(int resolution, SDCard sdCard) {
        this.resolution = resolution;
        this.sdCard = sdCard;
    }

    public void takePicture(String extension, String name) {
        PhoneFile file2 = new PhoneFile(extension, resolution * resolution, name);
        sdCard.saveFile(file2);
    }
}
