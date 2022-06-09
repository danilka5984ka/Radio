package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void checkCurrentChanel() {
        Radio radio = new Radio(2, 8);

        Assertions.assertEquals(2, radio.getMinChanel());
        Assertions.assertEquals(8, radio.getMaxChanel());
        Assertions.assertEquals(2, radio.getCurrentChanel());
    }

    @Test
    void checkSwitchingChanel() {
        Radio radio = new Radio(5);

        Assertions.assertEquals(0, radio.getMinChanel());
        Assertions.assertEquals(5, radio.getMaxChanel());
        Assertions.assertEquals(0, radio.getCurrentChanel());
    }

    @Test
    void checkNewCurrentChanel() {
        radio.setCurrentChanel(9);
        radio.next();

        Assertions.assertEquals(0, radio.getCurrentChanel());
    }

    @Test
    void checkNextChanelSwitchingOne() {
        radio.setCurrentChanel(0);
        radio.next();

        Assertions.assertEquals(1, radio.getCurrentChanel());
    }

    @Test
    void checkNextChanelSwitchingTwo() {
        radio.setCurrentChanel(2);
        radio.next();

        Assertions.assertEquals(3, radio.getCurrentChanel());
    }

    @Test
    void checkNextChanelSwitchingThree() {
        radio.setCurrentChanel(6);
        radio.next();

        Assertions.assertEquals(7, radio.getCurrentChanel());
    }

    @Test
    void checkNextChanelSwitchingFour() {
        radio.setCurrentChanel(9);
        radio.next();

        Assertions.assertEquals(0, radio.getCurrentChanel());
    }

    @Test
    void checkPrevChanelSwitchingOne() {
        radio.setCurrentChanel(8);
        radio.prev();

        Assertions.assertEquals(7, radio.getCurrentChanel());
    }

    @Test
    void checkPrevChanelSwitchingTwo() {
        radio.setCurrentChanel(4);
        radio.prev();

        Assertions.assertEquals(3, radio.getCurrentChanel());
    }

    @Test
    void checkPrevChanelSwitchingThree() {
        radio.setCurrentChanel(0);
        radio.prev();

        Assertions.assertEquals(9, radio.getCurrentChanel());
    }

    @Test
    void checkCurrentVolumeOne() {
        radio.setCurrentVolume(55);

        Assertions.assertEquals(55, radio.getCurrentVolume());
    }

    @Test
    void checkCurrentVolumeTwo() {
        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void checkCurrentVolumeThree() {
        radio.setCurrentVolume(101);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void checkUpVolumeOne() {
        radio.increaseVolume(0);

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void checkUpVolumeTwo() {
        radio.increaseVolume(101);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void checkUpVolumeThree() {
        radio.increaseVolume(1);

        Assertions.assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    void checkUpVolumeThreeFour() {
        radio.increaseVolume(2);

        Assertions.assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    void checkDownVolume() {
        radio.decreaseVolume(100);

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    void checkDownVolumeTwo() {
        radio.decreaseVolume(99);

        Assertions.assertEquals(98, radio.getCurrentVolume());
    }

    @Test
    void checkDownVolumeThree() {
        radio.decreaseVolume(98);

        Assertions.assertEquals(97, radio.getCurrentVolume());
    }

    @Test
    void checkDownVolumeFour() {
        radio.decreaseVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}