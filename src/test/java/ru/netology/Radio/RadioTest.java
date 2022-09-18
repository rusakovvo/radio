package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldNotSetCurrentRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(11);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentRadioStationAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.nextRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        radio.prevRadioStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(12);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);

        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);
        radio.increaseVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSetPrevVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);
        radio.prevVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestCurrentStation() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestNextStation() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(29);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestPrevStation() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 29;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestNextVolume() {
        Radio radio = new Radio(101);
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestPrevVolume() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(0);
        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}