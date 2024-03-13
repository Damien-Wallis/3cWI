package at.dam.oo.phone;

public class Phone {
    private String color;
    private SIM sim;
    private Camera camera;
    private SDCard sd;

    public Phone(String color, SIM sim, Camera camera, SDCard sd) {
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.sd = sd;
    }

    public void takePicture(String extension, String name) {
        camera.takePicture(extension, name);
    }

    public void makeCall(String number) {
        sim.makeCall(number);
    }

    public int getFreeSpace() {
        return sd.getFreeSpace();
    }

    public void printAllFiles() {
        sd.getAllFiles();
    }
}
