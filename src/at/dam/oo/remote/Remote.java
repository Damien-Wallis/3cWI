package at.dam.oo.remote;

public class Remote {
    private boolean hasPower;
    private boolean isOn;
    private Battery battery;

    public Remote(boolean hasPower, boolean isOn, Battery battery) {
        this.hasPower = hasPower;
        this.isOn = isOn;
        this.battery = battery;
    }
}
