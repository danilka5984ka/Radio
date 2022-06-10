package ru.netology.domain;

public class Radio {

    private int maxChanel = 9;
    private int minChanel = 0;
    private int currentChanel = minChanel;

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio(int minChanel, int maxChanel) {
        this.maxChanel = maxChanel;
        this.minChanel = minChanel;
        this.currentChanel = minChanel;
    }
    
    public Radio() {
    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public int getMaxChanel() {
        return maxChanel;
    }

    public int getMinChanel() {
        return minChanel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentChanel(int currentChanel) {

        if (currentChanel < minChanel) {
            currentChanel = maxChanel;
        }
        if (currentChanel > maxChanel) {
            currentChanel = minChanel;
        }
        this.currentChanel = currentChanel;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        int nextChanel = currentChanel + 1;
        setCurrentChanel(nextChanel);
    }

    public void prev() {
        int prevChanel = currentChanel - 1;
        setCurrentChanel(prevChanel);
    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void decreaseVolume(int currentVolume) {

        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

}
