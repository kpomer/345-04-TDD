package edu.ithaca.pomer;

import static org.junit.jupiter.api.Assertions.*;

class stringCalculatorTest {

    stringCalculator myCalc = new stringCalculatorImpl();

    @org.junit.jupiter.api.Test
    public void Add(){
        assertEquals(0, myCalc.Add(""), "should return 0 for an empty string");
    }

}