package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int maxChanel = 9;
    private int minChanel = 0;
    private int currentChanel = minChanel;

    private int currentVolume;

    public Radio(int minChanel, int maxChanel) {
        this.maxChanel = maxChanel;
        this.minChanel = minChanel;
        this.currentChanel = minChanel;
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

        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
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
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }

    public void decreaseVolume(int currentVolume) {

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
    }

}