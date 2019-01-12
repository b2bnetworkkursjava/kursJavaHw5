package com.b2b.net.farm;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlantTest {

    private Plant tomato = new Plant("Pomidor", 6.0, "red", false, true);
    private Plant carrot = new Plant("Marchewka", 15.0, "red", false, true);
    private Plant strawberry = new Plant("Truskawka", 2.0, "red", true, false);
    private Plant banana = new Plant("Banan", 10.0, "yellow", true, false);

    @Test
    public void isFruit() {
        assertTrue(strawberry.isFruit());
    }

    @Test
    public void isVegetable() {
        assertFalse(carrot.isFruit());
    }

    @Test
    public void isRed() {
        assertEquals(tomato.getColor(), "red");
    }

    @Test
    public void isYellow() {
        assertEquals(banana.getColor(), "yellow");
    }
}