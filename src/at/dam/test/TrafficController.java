package at.dam.test;

import java.util.ArrayList;
import java.util.List;

public class TrafficController {
    private List<Plane> planes;

    public TrafficController() {
        this.planes = new ArrayList<>();
    }

    //Methode addPlanes
    public void addPlanes(Plane plane) {
        this.planes.add(plane);
    }

    //Methode printAllPlanes
    public void printAllPlanes() {
        for (Plane plane : this.planes) {
            System.out.println(plane.getName());
        }
    }
}
