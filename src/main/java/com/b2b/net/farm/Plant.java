package com.b2b.net.farm;

public class Plant {

    private String name;
    private double size;
    private String color;
    private boolean Fruit;
    private boolean isVegetable;

    public Plant (String name, double size, String color, boolean isFruit, boolean isVegetable ) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.Fruit = isFruit;
        this.isVegetable = isVegetable;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name;

    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) { this.size = size;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) { this.color = color;

    }

    public boolean isFruit() { return Fruit; }

    public void setFruit(boolean isFruit) { this.Fruit = isFruit;

    }

    public boolean isVegetable() {
        return false;
    }

    public void setVegetable(boolean isVegetable) { this.isVegetable =isVegetable;

    }
}
