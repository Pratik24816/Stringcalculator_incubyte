package org.example.incubyte.StringcalCulator;

import org.example.incubyte.StringCalculator.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void ReturnZeroForEmptyString(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void ReturnNumberForSingleNumber(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
    }
}
