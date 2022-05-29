package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void checkCurrentChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(8);

        int actual = radio.getCurrentChanel();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkNewCurrentChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(11);

        int actual = radio.getCurrentChanel();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkNextChanelSwitchingOne() {
        Radio radio = new Radio();
        radio.setCurrentChanel(0);
        radio.next();

        int actual = radio.getCurrentChanel();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkNextChanelSwitchingTwo() {
        Radio radio = new Radio();
        radio.setCurrentChanel(2);
        radio.next();

        int actual = radio.getCurrentChanel();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkNextChanelSwitchingThree() {
        Radio radio = new Radio();
        radio.setCurrentChanel(6);
        radio.next();

        int actual = radio.getCurrentChanel();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkNextChanelSwitchingFour() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);
        radio.next();

        int actual = radio.getCurrentChanel();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkPrevChanelSwitchingOne() {
        Radio radio = new Radio();
        radio.setCurrentChanel(8);
        radio.prev();

        int actual = radio.getCurrentChanel();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkPrevChanelSwitchingTwo() {
        Radio radio = new Radio();
        radio.setCurrentChanel(4);
        radio.prev();

        int actual = radio.getCurrentChanel();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkPrevChanelSwitchingFour() {
        Radio radio = new Radio();
        radio.setCurrentChanel(0);
        radio.prev();

        int actual = radio.getCurrentChanel();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        int actual = radio.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkUpVolume() {
        Radio radio = new Radio();
        radio.up();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkDownVolume() {
        Radio radio = new Radio();
        radio.down();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}
