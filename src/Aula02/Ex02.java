package Aula02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, lastname, gender;
        Integer year, month, day;
        double weight, height;

        System.out.println("Insira seu nome: ");
        name = scanner.nextLine();
        System.out.println("Insira seu sobrenome: ");
        lastname = scanner.nextLine();
        System.out.println("Insira o seu genero: ");
        gender = scanner.nextLine();
        System.out.println("Insira o ano de seu nascimento: ");
        year = scanner.nextInt();
        System.out.println("Insira o mes de seu nascimento: ");
        month = scanner.nextInt();
        System.out.println("Insira o dia de seu nascimento: ");
        day = scanner.nextInt();
        System.out.println("Insira o seu peso: ");
        weight = scanner.nextDouble();
        System.out.println("Insira a sua altura: ");
        height = scanner.nextDouble();


        HealthProfile healthProfile = new HealthProfile(name, lastname, year, month, day, gender, height, weight);
        System.out.format("\n\nNome: %s", healthProfile.getName() + " " + healthProfile.getLastname());
        System.out.format("\nData de nascimento: %d/%d/%d", healthProfile.getDay(), healthProfile.getMonth(), healthProfile.getYear());
        System.out.format("\nGenero: %s", gender);
        System.out.format("\nAltura: %.2f", height);
        System.out.format("\nPeso: %.2f", weight);
        System.out.format("\nIdade: %d", healthProfile.getAge());
        System.out.format("\nFrequencia cardiaca maxima: %d", healthProfile.getMaxFrequency());
        double[] interval = healthProfile.getTargetFrequency();
        System.out.format("\nIntervalo de frequencia cardiaca alvo: %.2f - %.2f", interval[0], interval[1]);
        System.out.format("\nIMC: %.2f", healthProfile.getIMC());
    }
}
