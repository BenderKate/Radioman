package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentStation() {
        Radio station = new Radio(200);
        station.setCurrentStation(6);
        int expected = 6;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationToNextMax() {
        Radio station = new Radio(200);
        station.setCurrentStation(199);
        station.changeStationToNext();
        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationToNextMin() {
        Radio station = new Radio(200);
        station.setCurrentStation(0);
        station.changeStationToNext();
        int expected = 1;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    void shouldChangeStationToPrevMax() {
        Radio station = new Radio(200);
        station.setCurrentStation(199);
        station.changeStationToPrev();
        int expected = 198;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationToPrevMin() {
        Radio station = new Radio(200);
        station.setCurrentStation(0);
        station.changeStationToPrev();
        int expected = 199;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationUnderLimit() {
        Radio station = new Radio(200);
        station.setCurrentStation(-10);
        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationOverLimit() {
        Radio station = new Radio(200);
        station.setCurrentStation(1000);
        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(6);
        volume.increaseVolume();
        int expected = 7;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeWithMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeWithMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.increaseVolume();
        int expected = 2;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(86);
        volume.decreaseVolume();
        int expected = 85;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeWithMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.decreaseVolume();
        int expected = 99;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeWithMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeUnderLimit() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-10);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeOverLimit() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1000);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        int expected = 100;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }


}