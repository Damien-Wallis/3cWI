package at.dam.oo.remote;

public class Main {
    public static void main(String[] args) {
        //Batteries
        Battery battery1 = new Battery(90);
        Battery battery2 = new Battery(70);

        Remote remote = new Remote(true, true);
        remote.addBattery(battery1);

        remote.getStatus();
    }
}