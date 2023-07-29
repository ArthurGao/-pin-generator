package org;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class PinGeneratorTest {
    private final PinGenerator pinGenerator = new PinGenerator();

    /**
     * Test to check that the correct number of PINs are generated.
     * Asserts that the size of the set of generated PINs is equal to the expected PIN count.
     */
    @Test
    public void testPinCount() {
        Set<String> pins = pinGenerator.generatePins();
        Assert.assertEquals("Incorrect number of PINs generated", 1000, pins.size());
    }

    /**
     * Test to check that the length of each generated PIN is correct.
     * Asserts that the length of each PIN is equal to the expected PIN length.
     */
    @Test
    public void testPinLength() {
        Set<String> pins = pinGenerator.generatePins();

        for (String pin : pins) {
            Assert.assertEquals("Incorrect PIN length", 4, pin.length());
        }
    }

    /**
     * Test to check that all generated PINs are unique.
     * Asserts that the number of unique PINs (obtained by adding all PINs to a new set) is equal to the total number of PINs.
     */
    @Test
    public void testPinUniqueness() {
        Set<String> pins = pinGenerator.generatePins();
        Assert.assertEquals("Pins are not unique", pins.size(), new HashSet<>(pins).size());
    }

    /**
     * Test to check that each generated PIN only contains digits.
     * Asserts that each character in each PIN is a digit.
     */
    @Test
    public void testPinOnlyContainsDigits() {
        Set<String> pins = pinGenerator.generatePins();

        for (String pin : pins) {
            for (char ch : pin.toCharArray()) {
                Assert.assertTrue("PIN contains non-digit character", Character.isDigit(ch));
            }
        }
    }

}
