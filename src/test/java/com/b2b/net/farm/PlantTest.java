package com.b2b.net.farm;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlantTest {

    private Plant tomato = new Plant("tomato", 6, "red", true, false);
    private Plant carrot = new Plant("carrot", 8, "orange", false, true);
    private Plant strawberry = new Plant("strawberry", 2, "red", true, false);
    private Plant banana = new Plant("banana", 12, "yellow", true, false);

    @Test
    public void isFruit() {
        assertTrue(strawberry.isFruit());
        assertTrue(tomato.isFruit());
        assertTrue(banana.isFruit());
        assertFalse(carrot.isFruit());
    }

    @Test
    public void isVegetable() {
        assertTrue(carrot.isVegetable());
        assertFalse(tomato.isVegetable());
        assertFalse(strawberry.isVegetable());
        assertFalse(banana.isVegetable());
    }

    @Test
    public void isRed() {
        assertEquals(tomato.getColor(), "red");
        assertEquals(carrot.getColor(),"orange");
        assertEquals(strawberry.getColor(), "red");
        assertEquals(banana.getColor(),"yellow");
    }

    @Test
    public void isYellow() {
        assertEquals(banana.getColor(), "yellow");
        assertEquals(tomato.getColor(), "red");
        assertEquals(carrot.getColor(),"orange");
        assertEquals(strawberry.getColor(), "red");
    }
}