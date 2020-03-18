package Aula01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        ArrayList<Integer> ages = getAges();
        agesOperations(ages);
    }

    public static ArrayList<Integer> getAges(){
        ArrayList<Integer> ages = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean ans = true;

        while(ans && ages.size() < 100) {
            System.out.println("\nDigite uma idade: ");
            ages.add(scanner.nextInt());
            System.out.println("\nDeseja digitar uma nova idade? (true/false): ");
            ans = scanner.nextBoolean();
        }

        return ages;
    }

    public static void agesOperations(ArrayList<Integer> ages){
        Integer sum = 0;
        Integer olderThan21 = 0;

        for(Integer age : ages){
            sum += age;
            if(age >= 21)
                olderThan21++;
        }

        System.out.format("\nSoma das idades: %d", sum);
        System.out.format("\nMedia das idades: %d", sum / ages.size());
        System.out.format("\nMaior de 21 anos: %d", olderThan21);
    }
}
