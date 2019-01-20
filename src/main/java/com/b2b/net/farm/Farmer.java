package com.b2b.net.farm;

public class Farmer {

    private String farmName;
    private boolean hasAnimals;
    private boolean hasPlants;
    private double sizeOfFarm;

    public Farmer(String farmName, boolean hasAnimals, boolean hasPlants, double sizeOfFarm) {
        this.farmName = farmName;
        this.hasAnimals = hasAnimals;
        this.hasPlants = hasPlants;
        this.sizeOfFarm = sizeOfFarm;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public boolean isHasAnimals() {
        return hasAnimals;
    }

    public void setHasAnimals(boolean hasAnimals) {
        this.hasAnimals = hasAnimals;
    }

    public boolean isHasPlants() {
        return hasPlants;
    }

    public void setHasPlants(boolean hasPlants) {
        this.hasPlants = hasPlants;
    }

    public double getSizeOfFarm() {
        return sizeOfFarm;
    }

    public void setSizeOfFarm(double sizeOfFarm) {
        this.sizeOfFarm = sizeOfFarm;
    }
}
