package org.example;

import org.example.Generators.FigureGenerator;
import org.example.Generators.VolumeSupplier;

public class Main {
    public static void main(String[] args) {

        VolumeSupplier supplier = new VolumeSupplier();
        int figuresArrayVolume = supplier.setFiguresArrayVolume();

        FigureGenerator generator = new FigureGenerator();

        Figure[] figures = new Figure[figuresArrayVolume];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = generator.getRandomFigure();
            figures[i].showInfo();
        }
        System.out.println("The figures array length is: " + figures.length);
    }
}
