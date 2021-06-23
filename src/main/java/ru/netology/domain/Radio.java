package ru.netology.domain;

public class Radio {
    private int currentStation = 0;
    int minStation = 0;
    int maxStation = 9;
    private int currentVolume = 5;
    int minVolume = 0;
    int maxVolume = 10;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation == maxStation)
            currentStation = minStation;
        else
            currentStation ++;
    }

    public void prevStation() {
        if (currentStation == minStation)
            currentStation = maxStation;
        else
            currentStation --;
    }

    public void stationFromControl(int numberStation) {
        if (numberStation >= minStation && numberStation <= maxStation)
            currentStation = numberStation;
    }

    public void plusVolume() {
        if (currentVolume == maxVolume)
            currentVolume = maxVolume;
        else
            currentVolume ++;
    }

    public void minusVolume() {
        if (currentVolume == minVolume)
            currentVolume = minVolume;
        else
            currentVolume --;
    }
}
