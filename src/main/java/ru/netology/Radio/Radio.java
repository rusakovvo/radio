package ru.netology.Radio;

public class Radio {


    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;
    public int maxVolume = 10;
    public int minVolume = 0;
    private int currentVolume;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public Radio() {

    }

    public Radio(int size) {
        maxRadioStation = size - 1;
        maxVolume = size - 1;
    }


    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }

    }

    public void prevVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}