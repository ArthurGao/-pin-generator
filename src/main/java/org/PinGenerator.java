package org;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PinGenerator {
    private static final int PIN_COUNT = 1000;
    private static final int PIN_LENGTH = 4;
    private static final Random random = new Random();

    public Set<String> generatePins() {
        Set<String> pins = new HashSet<>();

        while (pins.size() < PIN_COUNT) {
            StringBuilder pin = new StringBuilder();

            for (int i = 0; i < PIN_LENGTH; i++) {
                pin.append(random.nextInt(10));
            }

            pins.add(pin.toString());
        }

        return pins;
    }
}
