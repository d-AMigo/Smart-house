package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void increaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.increaseCurrentStation();
        int expected = 4;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void decreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.decreaseCurrentStation();
        int expected = 2;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void currentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        int expected = 3;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void increaseCurrentStationIfMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseCurrentStation();
        int expected = 0;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void decreaseCurrentStationIfMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseCurrentStation();
        int expected = 9;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void increaseSoundVolume(){
        Radio radio = new Radio();
        radio.setSoundVolume(3);
        radio.increaseSoundVolume();
        int expected = 4;

        assertEquals(expected, radio.getSoundVolume());
    }
    @Test
    void decreaseSoundVolume(){
        Radio radio = new Radio();
        radio.setSoundVolume(3);
        radio.decreaseSoundVolume();
        int expected = 2;

        assertEquals(expected, radio.getSoundVolume());
    }
}