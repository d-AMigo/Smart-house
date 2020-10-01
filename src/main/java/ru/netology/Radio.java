package ru.netology;

public class Radio {
    int currentStation;
    int soundVolume;
    int maxStation = 9;
    int minStation = 0;
    int maxVolume = 10;
    int minVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseCurrentStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void decreaseCurrentStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume > maxVolume) {
            this.soundVolume = maxVolume;
            return;
        }
        if (soundVolume < minStation) {
            this.soundVolume = minVolume;
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void increaseSoundVolume() {
        if (soundVolume < maxVolume) {
            soundVolume++;
        }
    }

    public void decreaseSoundVolume() {
        if (soundVolume > minVolume) {
            soundVolume--;
        }
    }
}

