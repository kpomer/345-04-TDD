package edu.ithaca.pomer;

public class stringCalculatorImpl extends stringCalculator{

    //function takes a string of numbers as a parameter and converts it to an array of the numbers as strings
    //it then changes each string number to an int and adds them together
    //the function returns the integer value of all the numberes added together
    public int Add(String numbers){
        int sum = 0;
        if (numbers != "")
        {
            //split string into array wherever there is a ","
            String[] numbersArray = numbers.split("[,\n]");
            for (int i=0; i<numbersArray.length; i++)
            {
                //add each value to the sum
                int stringNum = Integer.parseInt(numbersArray[i]);
                sum = sum + stringNum;
            }
        }

        //return the sum of all the values in the array
        return sum;
    }
}