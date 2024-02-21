package ru.lopatin.homeworks.oop3ifc;

public class Human{
    private String name;
    private Transport currentTransport;
    private float poverReserve = 2500;
    private float poverСonsumption = 7.4f;

    public Human(String name, Transport currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
        //
        this.poverReserve = 2500;
        this.poverСonsumption = 7.4f;
    }

    public void getOnTransport(Transport transport) {
        this.currentTransport = transport;
    }
    public void getOffTransport() {
        this.currentTransport = null;
    }

    private boolean goWalk (Area area, int distance){
        float poverUsed;
        poverUsed = distance * this.poverСonsumption * area.getCostFactor();

        if (poverUsed >= poverReserve) {
            System.out.println("У меня не хватит сил! Хватит только на " + (this.poverReserve / (this.poverСonsumption * area.getCostFactor())) + " км.");
            return false;
        }

        this.poverReserve -= poverUsed;
        System.out.println("Весь путь пройден! Еще остались силы!");
        return true;
    }

    private boolean goСycling (Area area, int distance){
        float poverUsed;
        // тут только проврка доступности местности
        if(!currentTransport.move(area, distance)){
            return false;
        }
        poverUsed = distance * this.poverСonsumption * area.getCostFactor() * 0.5f;//на велике вдвое проще чем пешком
        if (poverUsed >= poverReserve) {
            System.out.println("У меня не хватит сил! Хватит только на " + (this.poverReserve / (this.poverСonsumption * area.getCostFactor())) + " км.");
            return false;
        }
        this.poverReserve -= poverUsed;
        System.out.println("На велике было легко! Еще остались силы!");
        return true;
    }


    public boolean move(Area area, int distance) {
        if(this.currentTransport instanceof Bike){
            System.out.println("Поеду на велике......");
            return goСycling(area, distance);
        }
        if (this.currentTransport != null){
            System.out.println("Поеду на " + currentTransport.getClass().getName());// не очень красиво, но это в качестве практики.
            return currentTransport.move(area, distance);
        }
        System.out.println("Пойду пешком......");
        return goWalk(area, distance);
    }

    public float getPoverReserve(){
        return poverReserve;
    }

    public float getPoverСonsumption(){
        return poverСonsumption;
    }
}
