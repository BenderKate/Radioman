package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldChangeStationToNextMax() {
        Radio station = new Radio ();
        station.setCurrentStation(9);
        station.changeStationToNext();
        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationToNextMin() {
        Radio station = new Radio ();
        station.setCurrentStation(0);
        station.changeStationToNext();
        int expected = 1;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    void shouldChangeStationToPrevMax() {
        Radio station = new Radio ();
        station.setCurrentStation(9);
        station.changeStationToPrev();
        int expected = 8;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationToPrevMin() {
        Radio station = new Radio ();
        station.setCurrentStation(0);
        station.changeStationToPrev();
        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationUnderLimit() {
        Radio station = new Radio ();
        station.setCurrentStation(-10);
        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationOverLimit() {
        Radio station = new Radio ();
        station.setCurrentStation(100);
        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStation() {
        Radio station = new Radio ();
        station.setCurrentStation(6);
        int expected = 6;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume () {
        Radio volume = new Radio ();
        volume.setCurrentVolume(6);
        volume.increaseVolume();
        int expected = 7;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeWithMax () {
        Radio volume = new Radio ();
        volume.setCurrentVolume(10);
        volume.increaseVolume();
        int expected = 10;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeWithMin () {
        Radio volume = new Radio ();
        volume.setCurrentVolume(0);
        volume.increaseVolume();
        int expected = 1;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume () {
        Radio volume = new Radio ();
        volume.setCurrentVolume(5);
        volume.decreaseVolume();
        int expected = 4;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeWithMax () {
        Radio volume = new Radio ();
        volume.setCurrentVolume(10);
        volume.decreaseVolume();
        int expected = 9;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeWithMin () {
        Radio volume = new Radio ();
        volume.setCurrentVolume(0);
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeUnderLimit() {
        Radio volume = new Radio ();
        volume.setCurrentVolume(-10);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeOverLimit() {
        Radio volume = new Radio ();
        volume.setCurrentVolume(100);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio volume = new Radio ();
        volume.setCurrentVolume(6);
        int expected = 6;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }


}