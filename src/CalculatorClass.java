/*This is my first program in Java. It's simply version of calculator.*/

import java.util.Scanner;

public class CalculatorClass {

    static float addFunction(float a, float b)
    {
        float result = a + b;
        return result;
    }
    static float subFunction(float a, float b)
    {
        float result = a - b;
        return result;
    }

    static float choiceFunction(int mode, float in1, float in2)
    {
        float result;
        switch (mode)
        {
            case 1:
              result = addFunction(in1, in2);
                break;
            case 2:
                result = subFunction(in1, in2);
                break;
            default:
                result = 0;
                System.out.println("Wrong number: " + mode);
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println("Addition - select \"1\"" );
        System.out.println("Subtraction - select \"2\"" );
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter calc number: " );
        int mode = myObj.nextInt();

        System.out.println("Enter first number: " );
        int in1 = myObj.nextInt();
        System.out.println("Enter second number: " );
        int in2 = myObj.nextInt();

        float result = choiceFunction(mode, in1, in2);
        System.out.println("The result is: " + result);
    }
}
