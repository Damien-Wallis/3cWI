package at.dam.oo.phone;

public class SIM {
    private int id;
    private String number;

    public SIM(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }
}
