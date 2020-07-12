package Aula06;

import java.util.Stack;

public class Ex02 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);
        stack.add(7);
        stack.add(8);
        stack.add(9);

        System.out.print("STACK: ");
        for(Integer i: stack) {
            System.out.print(i + " ");
        }
    }
}

