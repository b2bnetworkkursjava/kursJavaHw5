package com.b2b.net.farm;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    /**
    Przyklad prawidlowo zainicjalizowanych obiektow za pomoca konstruktora.
    Na wzor tego zainicjalizuj obiekty w pozostalych klasach testowych.
     */

    private Animal cow = new Animal("Milka", "muuu", 3, true);
    private Animal dog = new Animal("Pluto", "bork", 8, true);
    private Animal cat = new Animal("Garfield", "miau", 5, true);
    private Animal horse = new Animal("Mustang", "ihaha", 4, true);

    @Test
    public void isFarmAnimal() {
        assertTrue(cow.isFarm());
    }

    @Test
    public void isCow() {
        assertEquals(cow.getSound(), "muuu");
    }

    @Test
    public void isDog() {
        assertEquals(dog.getSound(), "bork");
    }

    @Test
    public void isCat() {
        assertEquals(cat.getSound(), "miau");
    }

    @Test
    public void isHorse() {
        assertEquals(horse.getSound(), "ihaha");
    }
}