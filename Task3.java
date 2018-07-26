package by.oksana.lesson9;

//Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}».
//Проверить правильность расстановки скобок. Использовать стек.

import java.util.EmptyStackException;
import java.util.Stack;

public class Task3 {
    public static void main (String[] args){
        Stack<Character> bracket = new Stack<>();
        StringBuilder str = new StringBuilder("(4+6)-{1+7}+[7-9)]");
        try {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                    bracket.push(str.charAt(i));
                }
                if (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
                    bracket.pop();
                }
            }
            System.out.println("Correct brackets");
        }
        catch (EmptyStackException e) {
            e.printStackTrace();
            System.out.println("INcorrect brackets");
        }


    }
}
