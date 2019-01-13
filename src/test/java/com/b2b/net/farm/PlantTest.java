package com.b2b.net.farm;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlantTest {

    private Plant tomato = new Plant("tomato","red",10.0,false,true);
    private Plant carrot = new Plant("carrot", "orange",20.0,false,true);
    private Plant strawberry = new Plant("strawberry","red",5.0,true,false);
    private Plant banana = new Plant("banana","yellow",15.0,true,false);

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