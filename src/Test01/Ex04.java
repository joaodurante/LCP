package Test01;

import java.util.HashMap;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, Integer> nums = new HashMap();
        int num = 1;
        int temp;

        while(true) {
            System.out.println("Escreva o numero desejado (-1 para sair): ");
            num = scan.nextInt();

            if(num == -1)
                break;

            if(nums.get(num) == null) {
                nums.put(num, 1);
            }else {
                temp = nums.get(num);
                temp++;
                nums.put(num, temp);
            }
        }

        for(int i : nums.keySet()) {
            System.out.println("Numero: " + i + " repetiu " + nums.get(i) + " vezes");
        }
    }
}
