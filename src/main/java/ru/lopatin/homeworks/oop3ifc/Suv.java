package ru.lopatin.homeworks.oop3ifc;

public class Suv extends MotorVehicle {

    public Suv(String model, float fuelReserve) {
        this.model = model;
        this.fuelReserve = fuelReserve;
        this.fuelСonsumption = 15.5f;
        this.accessibleAreas.add(Area.SWAMP);
        this.accessibleAreas.add(Area.PLAIN);
        this.accessibleAreas.add(Area.THICK_FOREST);
    }
}
