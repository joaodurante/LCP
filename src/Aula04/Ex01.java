package Aula04;

import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Ex01 {
    public static void main(String args[]) throws ArithmeticException{
        Scanner scanner = new Scanner(System.in);
        float[] values = new float[3];

        try {
            System.out.println("Insira o primeiro valor: ");
            values[0] = scanner.nextFloat();
            System.out.println("\nInsira o segundo valor: ");
            values[1] = scanner.nextFloat();
            System.out.println("\nInsira o terceiro valor: ");
            values[2] = scanner.nextFloat();

            sortValues(values);
            checkTriangle(values);
        } catch(InputMismatchException e) {
            System.out.println("Invalid entry! It's not a number");
        } catch(ArithmeticException e) {
            System.out.println("Invalid number");
        }
    }

    private static float[] sortValues(float[] values) {
        for(int i = 0; i < values.length - 1; i++) {
            if(values[i] > values[i+1]){
                float aux = values[i];
                values[i] = values[i+1];
                values[i+1] = aux;
            }
        }

        return values;
    }

    private static void checkTriangle(float[] values) {
        float aa = values[2] * values[2];
        float bb = values[0] * values[0];
        float cc = values[1] * values[1];

        if(values[2] >= (values[0] + values[1]))
            System.out.println("NAO FORMA TRIANGULO");
        else if(aa == (bb + cc))
            System.out.println("TRIANGULO RETANGULO");
        else if(aa > (bb + cc))
            System.out.println("TRIANGULO OBTUSANGULO");
        else
            System.out.println("TRIANGULO ACUTANGULO");
    }
}
