package ru.netology;

public class Radio {

    private int currentStation;
    private int minStation = 0;
    private int stationNumber = 9;

    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(){
    }

    public Radio(int stationNumber){
        this.stationNumber = stationNumber;
    }

    public void changeStationToNext() {
        if (currentStation < stationNumber) {
            currentStation = currentStation + 1;
        } else {currentStation = 0;}
    }

    public void changeStationToPrev() {
        if (currentStation == minStation) {
            currentStation = stationNumber;
        } else {currentStation = currentStation - 1;}

    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > stationNumber) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }



    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {currentVolume = 100;}
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {currentVolume = 0;}

    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
