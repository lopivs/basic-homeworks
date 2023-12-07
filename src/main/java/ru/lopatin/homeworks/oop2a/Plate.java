package ru.lopatin.homeworks.oop2a;

public class Plate {
    private int foodCapacity;
    private int foodRemain;

    public Plate(int foodCapacity) {
        this.foodCapacity = foodCapacity;
        this.foodRemain = foodCapacity;
    }

    public void addFood (int foodCount){
        if (this.foodRemain + foodCount > this.foodCapacity){
            this.foodRemain = this.foodCapacity;
            System.out.println("Слишком много корма, в тарелку вошла только недостающая часть");
            return;
        }
        this.foodRemain += foodCount;
        System.out.println("Весь корм вошел в тарелку");
    }

    public boolean decreaseFood (int foodCount){
        if (this.foodRemain - foodCount >= 0){
            this.foodRemain -= foodCount;
            return true;
        }
        return false;
    }


}
