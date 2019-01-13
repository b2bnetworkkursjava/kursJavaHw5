package com.b2b.net.farm;

import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    private Farmer donald = new Farmer("donald", true, false, 200.0);
    private Farmer daisy = new Farmer("daisy", false, true, 200.5);

    /**
    Farma jest duza, kiedy jej rozmiar jest wiekszy od 200,
    mala kiedy rozmiar jest mniejszy niz 200.
     */

    @Test
    public void isFarmerHasAnimals() {
        assertTrue(donald.isHasAnimals());
    }

    @Test
    public void isFarmerHasPlants() {
        assertTrue(daisy.isHasPlants());
    }

    @Test
    public void isFarmBig() {
        assertTrue(daisy.getSizeOfFarm() > 200.0);
    }

    @Test
    public void isFarmSmall() {
        assertFalse(donald.getSizeOfFarm() > 200.0);
    }
}