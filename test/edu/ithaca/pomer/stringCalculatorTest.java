package edu.ithaca.pomer;

import static org.junit.jupiter.api.Assertions.*;

class stringCalculatorTest {

    stringCalculator myCalc = new stringCalculatorImpl();

    @org.junit.jupiter.api.Test
    public void Add(){
        //Empty String
        assertEquals(0, myCalc.Add(""), "should return 0 for an empty string");

        //One value in string
        assertEquals(0, myCalc.Add("0"), "should return 0");
        assertEquals(1, myCalc.Add("1"), "should return 1");
        assertEquals(-3, myCalc.Add("-3"), "should return -3");

        //Two values in string
        assertEquals(0, myCalc.Add("0,1"), "should return 1 for an empty string");
        assertEquals(0, myCalc.Add("5,5"), "should return 10 for an empty string");
        assertEquals(0, myCalc.Add("3,-4"), "should return -1 for an empty string");
        assertEquals(0, myCalc.Add("0,0"), "should return 0 for an empty string");
        assertEquals(0, myCalc.Add("-3,-4"), "should return -7 for an empty string");
    }

}