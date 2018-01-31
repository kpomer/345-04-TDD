package edu.ithaca.pomer;

public class stringCalculatorImpl extends stringCalculator{
    public int Add(String numbers){
        int sum = 0;
        if (numbers != "")
        {
            String[] numbersArray = numbers.split(",");
            for (int i=0; i<numbersArray.length; i++)
            {
                int stringNum = Integer.parseInt(numbersArray[i]);
                sum = sum + stringNum;
            }
        }

        return sum;
    }
}