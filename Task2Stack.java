package by.oksana.lesson9;

// Ввести число, занести его цифры в стек.
// Вывести число, у которого цифры идут в обратном порядке.

import java.util.Scanner;
import java.util.Stack;

public class Task2Stack {
    public static void main (String[] args) {

        Stack<Integer> stack = new Stack<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int x = in.nextInt();
        int count = 1;
        int result = 0;

        String numberLength = String.valueOf(x);

        for (int i =0; i < numberLength.length(); i++) {
            stack.push( (x / count) % 10);
            count = count*10;
        }

        for(int i = 0; i<numberLength.length(); i++){
            result = (int) (result + stack.pop()*Math.pow(10, i));
        }
        System.out.println("число, у которого цифры идут в обратном порядке "+result);
    }
}
