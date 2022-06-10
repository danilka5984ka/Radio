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

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

}
