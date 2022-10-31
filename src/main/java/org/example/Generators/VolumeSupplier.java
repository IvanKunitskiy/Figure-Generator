package org.example.Generators;

import java.util.Random;
import java.util.Scanner;

public class VolumeSupplier {
    private final static byte MAX_ARRAY_VOLUME = 100;
    private final static byte MIN_ARRAY_VOLUME = 5;
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    public int setFiguresArrayVolume() {
        System.out.println("How many figures do you want to get? Enter the number...\n" +
                "Or, if you want to get the random volume, please enter the [Random] word!");

        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("Random")) {
            return random.nextInt(MIN_ARRAY_VOLUME, MAX_ARRAY_VOLUME);
        }

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Since you're not playing by the rules you get only one figure=P");
            return 1;
        }
    }
}
