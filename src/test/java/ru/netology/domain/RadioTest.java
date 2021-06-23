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
    void switchMaxDefaultNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void switchMaxNextStation() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(15);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void switchMinDefaultPrevStation() {
        Radio radio = new Radio();
        radio.prevStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void switchMinPrevStation() {
        Radio radio = new Radio(22);
        radio.prevStation();
        assertEquals(22, radio.getCurrentStation());
    }

    @Test
    void switchPrevStation() {
        Radio radio = new Radio(45);
        radio.setCurrentStation(31);
        radio.prevStation();
        assertEquals(30, radio.getCurrentStation());
    }

    @Test
    void switchStationFromControlDefault() {
        Radio radio = new Radio();
        radio.stationFromControl(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void switchStationFromControl() {
        Radio radio = new Radio(83);
        radio.stationFromControl(67);
        assertEquals(67, radio.getCurrentStation());
    }

    @Test
    void incorrectMaxStationFromControlDefault() {
        Radio radio = new Radio();
        radio.stationFromControl(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void incorrectMaxStationFromControl() {
        Radio radio = new Radio(30);
        radio.stationFromControl(55);
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
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    void switchMaxPlusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.plusVolume();
        assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    void switchMinusVolume() {
        Radio radio = new Radio();
        radio.minusVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    void switchMinMinusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}