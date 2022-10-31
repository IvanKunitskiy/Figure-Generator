package org.example.Generators;

import org.example.Colors;

import java.util.Random;

public class ColorGenerator {
    public String getRandomColor () {
        return Colors.values()[new Random().nextInt(Colors.values().length)]
                .toString().toLowerCase();
    }
}
