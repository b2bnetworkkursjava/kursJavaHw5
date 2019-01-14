package com.b2b.net.farm;

public class Farmer {

    private String farmName;
    private boolean isHasAnimals;
    private boolean isHasPlants;
    private double sizeOfFarm;

    public Farmer(String farmName, boolean hasAnimals, boolean hasPlants, double sizeOfFarm) {
        this.farmName=farmName;
        this.isHasAnimals=hasAnimals;
        this.isHasPlants=hasPlants;
        this.sizeOfFarm=sizeOfFarm;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName=farmName;
    }

    public boolean isHasAnimals() {
        return isHasAnimals;
    }

    public void setHasAnimals(boolean hasAnimals) {
        isHasAnimals=hasAnimals;
    }

    public boolean isHasPlants() {
        return isHasPlants;
    }

    public void setHasPlants(boolean hasPlants) {
        isHasPlants=hasPlants;
    }

    public double getSizeOfFarm() {
        return sizeOfFarm;
    }

    public void setSizeOfFarm(double sizeOfFarm) {
        this.sizeOfFarm=sizeOfFarm;
    }
}
