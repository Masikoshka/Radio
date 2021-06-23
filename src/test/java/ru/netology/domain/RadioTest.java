package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void switchNextStation() {
        Radio radio = new Radio();
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void switchMaxNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void switchMinPrevStation() {
        Radio radio = new Radio();
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void switchPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.prevStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    void switchStationFromControl() {
        Radio radio = new Radio();
        radio.stationFromControl(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void incorrectMaxStationFromControl() {
        Radio radio = new Radio();
        radio.stationFromControl(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void incorrectMinStationFromControl() {
        Radio radio = new Radio();
        radio.stationFromControl(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void switchPlusVolume() {
        Radio radio = new Radio();
        radio.plusVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void switchMaxPlusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    void switchMinusVolume() {
        Radio radio = new Radio();
        radio.minusVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void switchMinMinusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}