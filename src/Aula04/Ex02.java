package Aula04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner arquivo = null;
        try{
            arquivo = new Scanner(new File("arquivo.txt"));

            while (arquivo.hasNext()){
                String linha = arquivo.nextLine();
                Scanner linhaScanner = new Scanner(linha).useDelimiter("\\s*/\\s*");
                String nome = linhaScanner.next();
                String cidade = linhaScanner.next();
                int idade = linhaScanner.nextInt();
                System.out.println(nome+" eh de "+cidade+" e tem "+idade+" anos");
            }
        }catch(FileNotFoundException e){
            System.err.println("Arquivo Nao encontrado: arquivo.txt");
            System.exit(1);
        }catch(IllegalArgumentException e){
            System.err.println("Tipo invalido");
            System.exit(1);
        }finally{
            arquivo.close();
        }
    }
}
