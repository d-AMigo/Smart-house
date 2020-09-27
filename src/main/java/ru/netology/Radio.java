package ru.netology;

public class Radio {
    int currentStation;
    int soundVolume;
    int[] numberStation = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] volume = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > numberStation[9]) {
            this.currentStation = numberStation[9];
            return;
        }
        if (currentStation < numberStation[0]) {
            this.currentStation = numberStation[0];
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseCurrentStation() {
        if (currentStation == numberStation[9]) {
            currentStation = numberStation[0];
            return;
        }
        currentStation++;
    }

    public void decreaseCurrentStation() {
        if (currentStation == numberStation[0]) {
            currentStation = numberStation[9];
            return;
        }
        currentStation--;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume > volume[10]) {
            this.soundVolume = volume[10];
            return;
        }
        if (soundVolume < volume[0]) {
            this.soundVolume = volume[0];
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void increaseSoundVolume() {
        if (soundVolume < volume[10]) {
            soundVolume++;
        }
    }

    public void decreaseSoundVolume() {
        if (soundVolume > volume[0]) {
            soundVolume--;
        }
    }
}

