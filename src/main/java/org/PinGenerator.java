package org;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *  Library to generate unique 4 digit PINs.
 */
public class PinGenerator {

    /**
     * Constant for the number of PINs to generate.
     */
    private int pinCount = 1000;

    /**
     *  The length of each PIN.
     */
    private int pinLength = 4;
    private static final Random random = new Random();

    public PinGenerator() {
    }

    public PinGenerator(int pinLength, int pinCount) {
        this.pinLength = pinLength;
        this.pinCount = pinCount;
    }

    public Set<String> generatePins() {
        Set<String> pins = new HashSet<>();

        while (pins.size() < pinCount) {
            StringBuilder pin = new StringBuilder();

            for (int i = 0; i < pinLength; i++) {
                pin.append(random.nextInt(10));
            }

            pins.add(pin.toString());
        }

        return pins;
    }
}
