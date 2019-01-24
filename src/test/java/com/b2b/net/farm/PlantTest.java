package com.b2b.net.farm;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlantTest {

    private Plant tomato = new Plant("tomato", 2.0, "red", true, true);
    private Plant carrot = new Plant("carrot", 10.0, "orange", false, true);
    private Plant strawberry = new Plant("strawberry", 1, "red", true, false);
    private Plant banana = new Plant("banana", 16.2, "yellow", true, false);

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