package Aula05;

import java.util.Scanner;

public class Ex03 {
    private Integer[][] data;
    private Integer row, column;
    public Ex03(Integer m, Integer n) {
        row = m;
        column = n;
        data = new Integer[row][column];
    }

    public void print() {
        System.out.println("PRINT ARRAY:");
        for(int i=0; i < row; i++) {
            for(int j=0; j < column; j++) {
                if(this.data[i][j] != null)
                    System.out.print(this.data[i][j] + " ");
                else break;
            }
            System.out.println("");
        }
    }

    public void add(Integer item) {
        for(int i=0; i < row; i++) {
            for(int j=0; j < column; j++) {
                if(this.data[i][j] == null){
                    this.data[i][j] = item;
                    return;
                }
            }
        }
    }

    public void delete(Integer item) {
        for(int i=0; i < row; i++) {
            for(int j=0; j < column; j++) {
                if(this.data[i][j] == item) {
                    System.arraycopy(this.data[i], j + 1, this.data[i], j, column - 1 - j);
                    return;
                }
            }
        }
    }

    public int getLength(Integer[][] array) {
        int count = 0;
        for(int i=0; i < row; i++) {
            for(int j=0; j<this.column; j++) {
                if(array[i][j] != null)
                    count++;
                else
                    break;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        Ex03 array = new Ex03(2, 2);
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
