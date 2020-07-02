package Aula04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05 {
    public static void main(String args[]) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        String string;
        try {
            while(true){
                System.out.println("\nEscreva a cadeia: ");
                string = scanner.nextLine();

                if(!Character.isLetter(string.charAt(0)))
                    throw new InputMismatchException();
            }
        } catch(InputMismatchException e) {
            System.out.println("Primeiro caractere da cadeia é invalido");
        }
    }
}
