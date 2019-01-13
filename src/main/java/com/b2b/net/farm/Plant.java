package com.b2b.net.farm;

public class Plant {

    private String name;
    private double size;
    private String color;
    private boolean isFruit;
    private boolean isVegetable;

    public Plant(String name, double size, String color, boolean isFruit, boolean isVegetable){
        this.name=name;
        this.size=size;
        this.color=color;
        this.isFruit=isFruit;
        this.isVegetable=isVegetable;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;

    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size=size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color=color;
    }

    public boolean isFruit() {
        return isFruit;
    }

    public void setFruit(boolean fruit) {
        this.isFruit = fruit;
    }

    public boolean isVegetable() {
        return isVegetable;
    }

    public void setVegetable(boolean vegetable) {
        this.isVegetable=vegetable;
    }
}
