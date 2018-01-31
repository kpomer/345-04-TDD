package edu.ithaca.pomer;

public class stringCalculatorImpl extends stringCalculator{
    public int Add(String numbers){
        int sum = 0;
        if (numbers != "")
        {
            int stringNum = Integer.parseInt(numbers);
            sum = sum + stringNum;
        }

        return sum;
    }
}