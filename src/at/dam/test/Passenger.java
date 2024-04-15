package at.dam.test;

public class Passenger {
    private String firstname;
    private String lastname;

    public Passenger(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    //Methode inform
    public String inform(String message) {
        System.out.print(this.firstname + " " + this.lastname + ": ");
        System.out.println(message);
        return message;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
