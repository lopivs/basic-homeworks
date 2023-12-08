package ru.lopatin.homeworks.oop3ifc;

import java.util.HashSet;

public class Bike implements Transport {
    private String model;
    protected HashSet accessibleAreas = new HashSet();

    public Bike(String model) {
        this.model = model;
        this.accessibleAreas.add(Area.PLAIN);
        this.accessibleAreas.add(Area.THICK_FOREST);
    }

    @Override
    public boolean move(Area area, int distance) {
        if (!accessibleAreas.contains(area)) {
            System.out.println("Велосипед не может двигаться по местности: " + area.getName());
            return false;
        }
        return true;
    }
}
