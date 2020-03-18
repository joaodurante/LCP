package Aula02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, lastname;
        Integer year, month, day;

        System.out.println("Insira seu nome: ");
        name = scanner.nextLine();
        System.out.println("Insira seu sobrenome: ");
        lastname = scanner.nextLine();
        System.out.println("Insira o ano de seu nascimento: ");
        year = scanner.nextInt();
        System.out.println("Insira o mes de seu nascimento: ");
        month = scanner.nextInt();
        System.out.println("Insira o dia de seu nascimento: ");
        day = scanner.nextInt();


        HeartRates heartRates = new HeartRates(name, lastname, year, month, day);
        System.out.format("\n\nNome: %s", heartRates.getName() + " " +heartRates.getLastname());
        System.out.format("\nData de nascimento: %d/%d/%d", heartRates.getDay(), heartRates.getMonth(), heartRates.getYear());
        System.out.format("\nIdade: %d", heartRates.getAge());
        System.out.format("\nFrequencia cardiaca maxima: %d", heartRates.getMaxFrequency());
        double[] interval = heartRates.getTargetFrequency();
        System.out.format("\nIntervalo de frequencia cardiaca alvo: %.2f - %.2f", interval[0], interval[1]);
    }
}
