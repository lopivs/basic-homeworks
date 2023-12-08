package ru.lopatin.homeworks.oop3ifc;

import java.util.HashSet;

public class Horse implements Transport {
    protected String name;
    protected HashSet accessibleAreas = new HashSet();
    protected float poverReserve; // запас сил
    protected float poverСonsumption;// расход сил

    public Horse(String name, float poverReserve) {
        this.name = name;
        this.poverReserve = poverReserve;
        this.poverСonsumption = 15.5f;
        this.accessibleAreas.add(Area.PLAIN);
        this.accessibleAreas.add(Area.THICK_FOREST);
    }
    @Override
    public boolean move(Area area, int distance) {
        float poverUsed;
        poverUsed = distance * this.poverСonsumption * area.getCostFactor();

        if (!accessibleAreas.contains(area)) {
            System.out.println(name + " не может двигаться по местности: " + area.getName());
            return false;

        }
        if (poverUsed >= poverReserve) {
            System.out.println("У нас не хватит сил! Хватит только на " + (this.poverReserve / (this.poverСonsumption * area.getCostFactor())) + " км.");
            return false;
        }
        this.poverReserve -= poverUsed;
        System.out.println("Весь путь пройден! Еще остались силы!");
        return true;
    }
}
