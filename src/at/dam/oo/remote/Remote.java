package at.dam.oo.remote;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private boolean hasPower;
    private boolean isOn;
    private List<Battery> batteries;

    public Remote(boolean hasPower, boolean isOn) {
        this.hasPower = hasPower;
        this.isOn = isOn;
        this.batteries = new ArrayList<>();
    }

    //Methode getStatus
    public void getStatus() {
        if (hasPower) {
            int average = (batteries.get(0).getChargingStatus() + batteries.get(1).getChargingStatus()) / 2;
            System.out.println("Batteriestatus der Batterien: " + average);
        }
    }

    public void turnOn() {
        isOn = true;
        int chargingStatus1 = batteries.get(0).getChargingStatus();
        chargingStatus1 = chargingStatus1 - 5;
        this.batteries.get(0).setChargingStatus(chargingStatus1);

        int chargingStatus2 = batteries.get(1).getChargingStatus();
        chargingStatus2 = chargingStatus2 - 5;
        this.batteries.get(1).setChargingStatus(chargingStatus2);

        if (chargingStatus1 < 5 || chargingStatus2 < 5) {
            isOn = false;
            hasPower = false;
            System.out.println("At least one battery is discharged");
        } else {
            System.out.println("battery 1: Verbraucher angeschlossen");
            System.out.println("battery 2: Verbraucher angeschlossen");
        }
    }

    public void turnOff() {
        isOn = false;
        System.out.println("battery 1: Kein Verbraucher angeschlossen");
        System.out.println("battery 2: Kein Verbraucher angeschlossen");
    }

    //Methode addBattery
    public void addBattery(Battery battery) {
        this.batteries.add(battery);
    }

    //Getter
    public List<Battery> getBatteries() {
        return batteries;
    }
}
