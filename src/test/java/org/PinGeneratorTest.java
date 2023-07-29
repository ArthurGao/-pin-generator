package org;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class PinGeneratorTest {
    private final PinGenerator pinGenerator = new PinGenerator();

    @Test
    public void testPinCount() {
        Set<String> pins = pinGenerator.generatePins();
        Assert.assertEquals("Incorrect number of PINs generated", 1000, pins.size());
    }

    @Test
    public void testPinLength() {
        Set<String> pins = pinGenerator.generatePins();

        for (String pin : pins) {
            Assert.assertEquals("Incorrect PIN length", 4, pin.length());
        }
    }

    @Test
    public void testPinUniqueness() {
        Set<String> pins = pinGenerator.generatePins();
        Assert.assertEquals("Pins are not unique", pins.size(), new HashSet<>(pins).size());
    }
}
