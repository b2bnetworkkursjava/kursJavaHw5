package com.b2b.net.farm;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlantTest {

    private Plant tomato = new Plant("tomato",1, "red",false,true);
    private Plant carrot = new Plant("carrot",1, "orange",false,true);
    private Plant strawberry = new Plant("strawberry",1, "red",true,false);
    private Plant banana = new Plant("banana",1, "yellow",true,false);

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