package ru.lopatin.homeworks.oop3ifc;

public class MainApp {
    public static void main(String[] args) {

        Car   car   = new Car("Lada 2106", 18);
        Suv   suv   = new Suv("Niva", 25);
        Horse horse = new Horse("Flash", 500);
        Bike  bike  = new Bike("BMX-20" );
        Human human = new Human("Vasilius", car);
        //
        human.move(Area.PLAIN, 50);
        human.move(Area.SWAMP, 50);
        human.move(Area.THICK_FOREST, 50);
        human.getOffTransport();
        human.move(Area.SWAMP, 50);
        //
        human.getOnTransport(suv);
        human.move(Area.THICK_FOREST, 50);
        human.move(Area.PLAIN, 50);
        human.move(Area.THICK_FOREST, 50);
        human.move(Area.SWAMP, 50);
        human.move(Area.THICK_FOREST, 1);
        //
        human.getOnTransport(bike);
        human.move(Area.SWAMP, 50);
        human.move(Area.PLAIN, 50);
        human.move(Area.THICK_FOREST, 50);
        //
        human.getOnTransport(horse);
        human.move(Area.SWAMP, 50);
        human.move(Area.PLAIN, 500);
        human.move(Area.THICK_FOREST, 50);
    }
}
