package com.b2b.net.farm;

public class Plant {

    private String name;
    private double size;
    private String color;
    private boolean isFruit;
    private boolean isVegetable;

    public Plant(String name, double size, String color, boolean isFruit, boolean isVegetable) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.isFruit = isFruit;
        this.isVegetable = isVegetable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFruit(boolean fruit) {
        isFruit = fruit;
    }

    public void setVegetable(boolean vegetable) {
        isVegetable = vegetable;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public boolean isFruit() {
        return isFruit;
    }

    public boolean isVegetable() {
        return isVegetable;
    }
}