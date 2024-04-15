package at.dam.test;

public class Passenger {
    private String firstname;
    private String lastname;

    public Passenger(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    //Methode inform
    public void inform() {
        System.out.println(this.firstname + " " + this.lastname);
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
