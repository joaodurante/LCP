package Aula06;

import java.util.ArrayList;
import java.util.Collections;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);

        System.out.print("ORIGINAL: ");
        for(Integer i: array) {
            System.out.print(i + " ");
        }

        ArrayList<Integer> array2 = array;
        Collections.reverse(array2);
        System.out.print("\nREVERSED: ");
        for(Integer i: array2) {
            System.out.print(i + " ");
        }

        ArrayList<Integer> array3 = array;
        Collections.shuffle(array3);
        System.out.print("\nSHUFFLED: ");
        for(Integer i: array3) {
            System.out.print(i + " ");
        }
    }
}
