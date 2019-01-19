package com.b2b.net.farm;

public class Plant {

    private String name;
    private double size;
    private String color;
    private boolean isFruit;
    private boolean isVegetable;

    public Plant (String name, double size, String color, boolean isFruit, boolean isVegetable){
    this.name = name;
    this.size = size;
    this.color = color;
    this.isFruit = isFruit;
    this.isVegetable = isVegetable;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name =name;

    }

    public double getSize() {
        return getSize();
    }

    public void setSize() {
        this.size = size;

    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;

    }

    public boolean isFruit() {
        return isFruit;
    }

    public void setFruit() {
        this.isFruit = isFruit;

    }

    public boolean isVegetable() {
        return isVegetable;
    }

    public void setVegetable() {
        this.isVegetable = isVegetable;

    }
}
