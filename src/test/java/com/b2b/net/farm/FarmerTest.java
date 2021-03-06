package com.b2b.net.farm;

import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    private Farmer donald;
    private Farmer daisy;

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