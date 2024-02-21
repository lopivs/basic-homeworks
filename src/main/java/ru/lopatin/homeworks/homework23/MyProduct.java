package ru.lopatin.homeworks.homework23;

public class MyProduct {
    private int id;
    private String value;
    private float coast;

    public MyProduct(int id, String value, float coast) {
        this.id = id;
        this.value = value;
        this.coast = coast;
    }
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public float getCoast() {
        return coast;
    }

}