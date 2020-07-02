package Aula04;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ex04 {
    public static void main(String args[]) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        String name = null, address = null;
        try {
            System.out.println("Escreva seu nome: ");
            name = scanner.nextLine();

            if(name.length() == 0)
                throw new InputMismatchException();

            System.out.println("\nEscreva seu endereco: ");
            address = scanner.nextLine();

            if(address.length() == 0)
                throw new InputMismatchException();
        } catch(InputMismatchException e) {
            if(name != null)
                System.out.println("O campo nome nao pode ser nulo");
            if(address != null)
                System.out.println("O campo endereco nao pode ser nulo");
            System.exit(1);
        } finally {
            System.out.println("\nSucesso!");
        }
    }
}
