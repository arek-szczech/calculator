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

    static float choiceFunction(int tryb, float in1, float in2)
    {
        float result;
        switch (tryb)
        {
            case 1:
              result = addFunction(in1, in2);
                break;
            case 2:
                result = subFunction(in1, in2);
                break;
            default:
                result = 0;
                System.out.println("Zły numer działania: " + tryb);
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println("Dodawanie - wybierz \"1\"" );
        System.out.println("Odejmowanie - wybierz \"2\"" );
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj numer działania: " );
        int tryb = myObj.nextInt();

        System.out.println("Podaj pierwszą liczbę: " );
        int in1 = myObj.nextInt();
        System.out.println("Podaj drugą liczbę: " );
        int in2 = myObj.nextInt();

        float result = choiceFunction(tryb, in1, in2);
        System.out.println("Wynik to: " + result);
    }
}
