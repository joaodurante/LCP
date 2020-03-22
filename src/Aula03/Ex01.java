package Aula03;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {
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
                System.out.println("Certa resposta!");
            }else
                System.out.format("\nResposta errada, tente novamente!");
        }
    }
}
