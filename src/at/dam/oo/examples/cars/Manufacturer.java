package at.dam.oo.examples.cars;

public class Manufacturer {
    private String name;
    private String country;
    private double discount;

    public Manufacturer(String name, String country, double discount) {
        this.name = name;
        this.country = country;
        this.discount = discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}