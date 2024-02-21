package ru.lopatin.homeworks.oop3ifc;

public enum Area {
    THICK_FOREST("Густой лес", 1.1f, 1),
    SWAMP("Болото", 1.5f, 2),
    PLAIN("Равнина",1, 3);
    private String name;
    private float costFactor;
    private int index;

    public String getName() {
        return name;
    }
    public float getCostFactor() {
        return costFactor;
    }
    public int getIndex(){
        return index;
    }
    Area(String name, float costFactor, int index) {
        this.name = name;
        this.costFactor = costFactor;
        this.index = index;
    }
}
