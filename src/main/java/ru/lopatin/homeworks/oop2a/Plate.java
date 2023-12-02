package ru.lopatin.homeworks.oop2a;

public class Plate {
    private int food_capacity;
    private int food_remain;

    public Plate(int food_capacity) {
        this.food_capacity = food_capacity;
        this.food_remain = food_capacity;
    }

    public void addFood (int foodCount){
        if (this.food_remain + foodCount > this.food_capacity){
            this.food_remain = this.food_capacity;
        }
        this.food_remain += foodCount;
    }

    public boolean decreaseFood (int foodCount){
        if (this.food_remain - foodCount >= 0){
            this.food_remain -= foodCount;
            return true;
        }
        return false;
    }

}
