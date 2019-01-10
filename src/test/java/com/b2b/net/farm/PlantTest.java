package com.b2b.net.farm;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlantTest {

    private Plant tomato = new Plant();
    private Plant carrot = new Plant();
    private Plant strawberry = new Plant();
    private Plant banana = new Plant();

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