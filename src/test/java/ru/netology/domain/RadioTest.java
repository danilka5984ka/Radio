package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);

        Assertions.assertEquals(9, radio.getCurrentChanel());
    }

}