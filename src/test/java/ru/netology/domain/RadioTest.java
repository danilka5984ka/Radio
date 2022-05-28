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
    void checkNextChanel() {
        Radio radio = new Radio();
        radio.next();

        int actual = radio.getCurrentChanel();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkPrevChanel() {
        Radio radio = new Radio();
        radio.prev();

        int actual = radio.getCurrentChanel();
        int expected = 0;

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
