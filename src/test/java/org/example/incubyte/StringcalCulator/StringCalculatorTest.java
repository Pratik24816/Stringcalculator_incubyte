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

    @Test
    public void ReturnSumForTwoNumbers(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1,5"));
    }

    @Test
    public void HandleMultipleNumbers(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(30,calculator.add("2,4,8,6,10"));
    }
}
