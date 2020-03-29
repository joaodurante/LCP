package Aula03;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        boolean contin = true;
        Scanner scanner = new Scanner(System.in);

        while(contin) {
            genQuestion();

            System.out.println("Deseja uma nova questao? (true/false)");
            contin = scanner.nextBoolean();
        }
    }

    private static void genQuestion() {
        Integer value1, value2, rightAns, userAns;
        Random random = new Random();
        boolean right = false;
        Scanner scanner = new Scanner(System.in);

        value1 = random.nextInt(10);
        value2 = random.nextInt(10);
        rightAns = value1 * value2;

        while(!right) {
            System.out.format("\nQual o valor de %d * %d: ", value1, value2);
            userAns = scanner.nextInt();

            if(userAns == rightAns){
                right = true;
                System.out.println(genAns(true));
            }else
                System.out.format(genAns(false));
        }
    }

    private static String genAns(boolean right) {
        Random random = new Random();
        Integer randomAns = random.nextInt(4);

        if(right){
            switch(randomAns){
                case 0: return "Muito bom!";
                case 1: return "Excelente!";
                case 2: return "Bom trabalho!";
                case 3: return "Parabéns!";
            }
        }else {
            switch(randomAns){
                case 0: return "Não. Tente de novo.";
                case 1: return "Errado. Tente mais uma vez.";
                case 2: return "Não desista!";
                case 3: return "Não. Continue tentando.";
            }
        }
        return null;
    }
}
