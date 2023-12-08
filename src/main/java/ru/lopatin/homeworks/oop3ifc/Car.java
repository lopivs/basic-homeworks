package ru.lopatin.homeworks.oop3ifc;

public class Car extends MotorVehicle {

    public Car(String model, float fuelReserve) {
        this.model = model;
        this.fuelReserve = fuelReserve;
        this.fuelСonsumption = 5.5f;
        this.accessibleAreas.add(Area.PLAIN);
    }
}
