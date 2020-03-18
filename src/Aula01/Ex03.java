package Aula01;

import java.util.Scanner;

public class Ex03 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Integer value;

        System.out.println("Insira o valor: ");
        value = scanner.nextInt();

        while(value < 1 || value > 100){
            System.out.println("Valor invalido");
            System.out.println("Insira o valor novamente: ");
            value = scanner.nextInt();
        }

        printPowValues(value);
    }

    private static void printPowValues(Integer value){
        for(int i=1; i<= value; i++){
            System.out.format("%d %d %d\n", i, (i * i), (i * i * i));
        }
    }
}
