package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City edmonoton = new City("Edmonton", "AB");
        City calgary = new City("Calgary", "AB");

        assertEquals(0, list.countCities());

        list.addCity(edmonoton);
        assertEquals(1, list.countCities());

        list.addCity(calgary);
        assertEquals(2, list.countCities());
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City edmonoton = new City("Edmonton", "AB");
        City calgary = new City("Calgary", "AB");

        list.addCity(edmonoton);
        list.addCity(calgary);
        assertEquals(2, list.countCities());

        list.deleteCity(edmonoton);
        assertFalse(list.hasCity(edmonoton));
        assertEquals(1, list.countCities());

        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
        assertEquals(0, list.countCities());
    }
}
