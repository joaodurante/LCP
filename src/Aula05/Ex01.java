package Aula05;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {
    private Integer[] data;
    public Ex01(Integer n) {
        data = new Integer[n];
    }

    public void print() {
        System.out.println("PRINT ARRAY:");
        for(int i=0; i < this.data.length; i++) {
            if(this.data[i] != null)
                System.out.println(this.data[i]);
            else
                break;
        }
    }

    public void add(Integer item) {
        for(int i=0; i < this.data.length; i++) {
            if(this.data[i] == null){
                this.data[i] = item;
                break;
            }
        }
    }

    public void delete(Integer item) {
        for(int i=0; i < this.data.length; i++) {
            if(this.data[i] == item) {
                System.arraycopy(this.data, i + 1, this.data, i, this.data.length - 1 - i);
            }
        }
    }

    public int getLength(Integer[] array) {
        int i = 0;
        for(int j=0; j < array.length; j++) {
            if(array[j] != null)
                i++;
            else
                break;
        }
        return i;
    }

    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        Ex01 array = new Ex01(100);
        int option = 1, value;

        try {
            while(option != 0) {
                System.out.println("\nEscolha uma das opçoes");
                System.out.println("1- Imprimir o vetor");
                System.out.println("2- Adicionar um valor ao array");
                System.out.println("3- Remover um valor do array");
                System.out.println("0- Encerrar o programa");

                option = scanner.nextInt();

                switch(option) {
                    case 1:
                        array.print();
                        break;
                    case 2: {
                        System.out.println("\n\nInsira o valor: ");
                        value = scanner.nextInt();
                        array.add(value);
                        break;
                    }
                    case 3: {
                        System.out.println("\n\nInsira o valor: ");
                        value = scanner.nextInt();
                        array.delete(value);
                        break;
                    }
                    case 0: {
                        option = 0;
                    }
                }
            }
        } catch(IllegalArgumentException e) {
            System.out.println("Voce entrou com um digito invalido");
        }finally {
            System.out.println("Ate mais!");
        }
    }
}












