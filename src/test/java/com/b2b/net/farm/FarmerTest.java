package com.b2b.net.farm;

import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    private Farmer donald = new Farmer("Donald", false, true, 150.0);
    private Farmer daisy = new Farmer("Daisy", true, false, 230.0);

    /**
    Farma jest duza, kiedy jej rozmiar jest wiekszy od 200,
    mala kiedy rozmiar jest mniejszy niz 200.
     */

    @Test
    public void isFarmerHasAnimals() {
        assertFalse(donald.isHasAnimals());
        assertTrue(daisy.isHasAnimals());
    }

    @Test
    public void isFarmerHasPlants() {
        assertTrue(donald.isHasPlants());
        assertFalse(daisy.isHasPlants());
    }

    @Test
    public void isFarmBig() {
        assertTrue(daisy.getSizeOfFarm() > 200.0);
        assertFalse(donald.getSizeOfFarm() > 200.0);
    }

    @Test
    public void isFarmSmall() {
        assertTrue(donald.getSizeOfFarm() < 200.0);
        assertFalse(daisy.getSizeOfFarm() < 200.0);
    }
}