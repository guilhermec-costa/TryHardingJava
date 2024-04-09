package app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    @Test
    void twoPlusTwoShouldEqualsFour() {
        Integer sumResult = Calculator.add(2, 2);
        assertEquals(4, sumResult);
    }

    @Test
    void threePlusSevenShouldEqualTen() {
        Integer sumResult = Calculator.add(3, 7);
        assertEquals(10, sumResult);
    }
}

