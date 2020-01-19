/*This is my first program in Java. It's a simple version of calculator.
* Allows to add and subtract, for example:
* 12+35-23+232=
* without error handling, only Integer
* */

import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class
import java.lang.*;
import java.lang.Math;

public class CalculatorClass {

    static int chooseOperation(char character)
    {
        int out;
        switch (character){
            case '+':
                out = 1;
                break;
            case  '-':
                out = -1;
                break;
            default:
                out = 0;
                break;
        }
        return out;
    }

    static int stringAnalysis(String str)
    {
        int tempIndex = 0;
        int output = 0;
        int tempNumber = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> tempNumbers = new ArrayList<Integer>();
        ArrayList<Character> characters = new ArrayList<Character>();

        for (char ch : str.toCharArray()) {

            if (Character.isDigit(ch)) {
                tempIndex++;
                tempNumbers.add(Character.getNumericValue(ch));
            }
            else {
                for (int i = tempIndex; i>=1 ; i--) {
                    tempNumber = tempNumber +  (int)Math.pow(10, i-1) * tempNumbers.get(tempIndex-i);
                }
                numbers.add(tempNumber);
                tempNumber=0;
                tempNumbers.clear();
                tempIndex = 0;
                characters.add(ch);
            }
        }
        output = output + numbers.get(0);
    for (int j = 1; j < numbers.size(); j++){
    output = output + chooseOperation(characters.get(j-1)) * numbers.get(j);
    }
        return output;
    }

    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter calc: " );
        String input = myObj.nextLine();

       float result = stringAnalysis(input);
       System.out.println(result);
    }
}
