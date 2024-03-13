package at.dam.oo.phone;

public class Main {
    public static void main(String[] args) {
        //Objekte
        PhoneFile file = new PhoneFile("jpg", 4, "schule");
        SDCard sd = new SDCard(30);
        Camera camera = new Camera(20, sd);
        SIM sim = new SIM(815, "+43 676 324 1734");
        Phone phone = new Phone("yellow", sim, camera, sd);

        //Befehle
        System.out.println(file.getInfo(file));
        sd.saveFile(file);
        sd.getAllFiles();
        System.out.println(sd.getFreeSpace());
        sim.makeCall("32168");
        phone.printAllFiles();
    }
}
