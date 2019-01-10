package com.b2b.net.farm;

public class Animal {

    /**
    Klasa pokazowa, na wzor tego uzupelnij pozostale klasy.
    Konstruktory w kazdej z klas i wszystkie metody get i set.
    */

    private String name;
    private String sound;
    private int age;
    private boolean isFarm;

    public Animal(String name, String sound, int age, boolean isFarm) {
        this.name = name;
        this.sound = sound;
        this.age = age;
        this.isFarm = isFarm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFarm() {
        return isFarm;
    }

    public void setFarm(boolean farm) {
        isFarm = farm;
    }
}
