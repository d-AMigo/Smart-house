package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature();
        int expected = 26;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(20);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(25);
        conditioner.decreaseCurrentTemperature();
        int expected = 24;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperatureMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(20);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        int expected = 30;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperatureMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(20);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        int expected = 20;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(20);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(31);
        conditioner.increaseCurrentTemperature();
        int expected = 30;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

   @Test
    void decreaseCurrentTemperatureBelowMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(20);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(19);
        conditioner.decreaseCurrentTemperature();
        int expected = 20;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}