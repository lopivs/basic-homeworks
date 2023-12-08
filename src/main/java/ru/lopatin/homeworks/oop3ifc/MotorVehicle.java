package ru.lopatin.homeworks.oop3ifc;

import java.util.HashSet;

public abstract class MotorVehicle implements Transport {
    protected String model;
    protected HashSet accessibleAreas = new HashSet();
    protected float fuelReserve; // запас топлива
    protected float fuelСonsumption;// расход топлива

    @Override
    public boolean move(Area area, int distance) {
        float fuelUsed = distance * (this.fuelСonsumption/100) * area.getCostFactor();
        if (!accessibleAreas.contains(area)) {
            System.out.println(model + " не может двигаться по местности: " + area.getName());
            return false;
        }
        if (fuelUsed >= fuelReserve){
            System.out.println("У нас не хватит топлива! Нехватает " + (fuelUsed - fuelReserve) + " литров");
            return false;
        }
        this.fuelReserve -= fuelUsed;
        System.out.println("Поезка удалась, весь путь пройден! Еще осталось " + this.fuelReserve + " литоров в баке");
        return true;
    }
}
