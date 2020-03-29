package Aula03;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o nivel de dificuldade (1-4): ");
        Integer difficulty = scanner.nextInt();
        menu(difficulty);
    }

    public static void menu(Integer difficulty) {
        System.out.format("\nDIFICULDADE %d ESCOLHIDA", difficulty);
        switch(difficulty) {
            case 1: genQuestion(10);
                break;
            case 2: genQuestion(100);
                break;
            case 3: genQuestion(1000);
                break;
            case 4: genQuestion(10000);
                break;
            default: genQuestion(10);
        }
    }

    private static void genQuestion(Integer maxRange) {
        Integer value1, value2;
        double rightAns, userAns;
        Random random = new Random();
        boolean right, newQuestion = true;
        Scanner scanner = new Scanner(System.in);

        while(newQuestion){
            value1 = random.nextInt(maxRange);
            value2 = random.nextInt(maxRange);
            rightAns = value1 * value2;
            right = false;

            while(!right) {
                System.out.format("\nQual o valor de %d * %d: ", value1, value2);
                userAns = scanner.nextDouble();

                if(userAns == rightAns){
                    right = true;
                    System.out.println(genAns(true));
                }else
                    System.out.format(genAns(false));
            }

            System.out.println("Deseja uma nova questao? (true/false)");
            newQuestion = scanner.nextBoolean();
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
