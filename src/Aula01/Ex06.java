package Aula01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight, height;

        System.out.println("Digite o seu peso (kg): ");
        weight = scanner.nextFloat();
        System.out.println("Digite a sua altura (m): ");
        height = scanner.nextFloat();

        calculateIMC(weight, height);
    }

    private static void calculateIMC(float weight, float height){
        float imc = weight / (height * height);

        System.out.format("\nSeu IMC é de: %.2f", imc);
        System.out.println("\nClassificacao: ");


        if(imc < 18.5)
            System.out.println("Abaixo do peso");
        else if(imc >= 18.5 && imc < 24.9)
            System.out.println("Peso ideal");
        else if(imc >= 25 && imc < 29.9)
            System.out.println("Levemente acima do peso");
        else if(imc >= 30 && imc < 34.9)
            System.out.println("Obesidade grau I");
        else if(imc >= 35 && imc < 39.9)
            System.out.println("Obesidade grau II");
        else
            System.out.println("Obesidade grau III");

    }
}
