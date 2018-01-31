package edu.ithaca.pomer;

import static org.junit.jupiter.api.Assertions.*;

class stringCalculatorTest {

    stringCalculator myCalc = new stringCalculatorImpl();

    @org.junit.jupiter.api.Test
    public void Add(){
        assertEquals(0, myCalc.Add(""), "should return 0 for an empty string");

        assertEquals(0, myCalc.Add("0"), "should return 0");
        assertEquals(1, myCalc.Add("1"), "should return 1");
        assertEquals(-3, myCalc.Add("-3"), "should return -3");
    }

}