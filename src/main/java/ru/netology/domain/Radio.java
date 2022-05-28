package ru.netology.domain;

public class Radio {

    private int currentChanel;

    public void setCurrentChanel(int currentChanel) {

        if (currentChanel < 0) {
            return;
        }
        if (currentChanel > 9) {
            return;
        }
        this.currentChanel = currentChanel;

    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void next() {
        int currentChanel = 9;
        currentChanel = currentChanel + 1;
        setCurrentChanel(currentChanel);
    }

    public void prev() {
        int currentChanel = 0;
        currentChanel = currentChanel - 1;
        setCurrentChanel(currentChanel);
    }

    private int currentVolume;

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void up() {
        int currentVolume = 10;
        currentVolume = currentVolume + 1;
        setCurrentVolume(currentVolume);
    }

    public void down() {
        int currentVolume;
        currentVolume = -1;
        setCurrentVolume(currentVolume);
    }
}

