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
        int average = (batteries.get(0).getChargingStatus() + batteries.get(1).getChargingStatus()) / 2;
        System.out.println(average);
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
