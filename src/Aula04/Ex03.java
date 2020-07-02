package Aula04;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ex03 {
    public static void main(String args[]) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Integer number = random.nextInt(10);
        Integer userEntry;
        try {
            while(true) {
                System.out.println("Escreva o numero multiplo de " + number + ": ");
                userEntry = scanner.nextInt();

                if(userEntry % number != 0){
                    throw new InputMismatchException();
                }
            }
        } catch(InputMismatchException e) {
            System.out.println("O numero nao e multiplo de " + number);
            System.exit(1);
        }
    }
}
