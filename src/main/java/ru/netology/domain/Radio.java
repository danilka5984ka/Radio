package ru.netology.domain;

public class Radio {

    private int currentChanel;
    private int currentVolume;


    public void setCurrentChanel(int currentChanel) {

        if (currentChanel < 0) {
            currentChanel = 9;
        }
        if (currentChanel > 9) {
            currentChanel = 0;
        }
        this.currentChanel = currentChanel;

    }
    
    public int getCurrentChanel() {
        return currentChanel;
    }

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

    public void next() {
        int nextChanel = currentChanel + 1;
        setCurrentChanel(nextChanel);

    }

    public void prev() {
        int prevChanel = currentChanel - 1;
        setCurrentChanel(prevChanel);
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

