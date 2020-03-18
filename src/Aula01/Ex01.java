package Aula01;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Ex01 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        AtomicInteger value = new AtomicInteger(scanner.nextInt());
        System.out.println("Notas de 100: " + getNumberOfBankNotes(value, 100));
        System.out.println("Notas de 50: " + getNumberOfBankNotes(value, 50));
        System.out.println("Notas de 20: " + getNumberOfBankNotes(value, 20));
        System.out.println("Notas de 10: " + getNumberOfBankNotes(value, 10));
        System.out.println("Notas de 5: " + getNumberOfBankNotes(value, 5));
        System.out.println("Notas de 2: " + getNumberOfBankNotes(value, 2));
        if (value.get() > 0)
            System.out.println("Faltou 1 real");
    }

    private static int getNumberOfBankNotes(AtomicInteger value, int bankNote){
        int numberOfBankNotes = 0;
        while(value.get() >= bankNote){
            value.set(value.get() - bankNote);
            numberOfBankNotes++;
        }
        return numberOfBankNotes;
    }
}