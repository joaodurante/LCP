package Aula05;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Ex04 {
    public static void main(String[] args) throws InputMismatchException {
        Integer width, height;
        String name, option = "sim";
        Scanner scanner = new Scanner(System.in);
        Vector<Rectangle> array = new Vector<>();

        try{
            while(option.compareTo("nao") != 0) {
                System.out.println(option);
                System.out.println("\nInsira o nome do retangulo: ");
                name = scanner.nextLine();

                System.out.println("Insira a altura");
                height = scanner.nextInt();

                System.out.println("Insira a largura");
                width = scanner.nextInt();
                scanner.nextLine();
                array.add(new Rectangle(name, height, width));

                System.out.println("\nDeseja inserir novo retangulo? (sim/nao)");
                option = scanner.nextLine();
            }
        }catch(InputMismatchException e) {
            System.out.println("Valor invalido");
        }
        finally{
            System.out.println("\nAREAS");
            for(Rectangle i: array) {
                System.out.println(i.getArea());
            }
        }
    }
}
