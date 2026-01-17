package com.healthtech;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DosageCalculatorTest {

    @Test
    void testDosageCalculation() {
        int result = DosageCalculator.calculateDosage(50);
        assertEquals(100, result);
    }
}
