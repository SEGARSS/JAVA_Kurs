package Java_Seminar.Seminar5;

/*Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь */

import java.util.HashMap;
import java.util.Stack;

public class task1 {
    public static void task1() {
        String expression1 = "a+(d*3)";
        String expression2 = "[a+(1*3)";
        String expression3 = "[6+(3*3)]";
        String expression4 = "{a}[+]{(d*3)}";
        String expression5 = "<{a}+{(d*3)}>";
        String expression6 = "{a+]}{(d*3)}";

        System.out.println("Проверка выражения 1: - a+(d*3) - " + checkBrackets(expression1));
        System.out.println("Проверка выражения 2: - [a+(1*3) - " + checkBrackets(expression2));
        System.out.println("Проверка выражения 3: - [6+(3*3)] - " + checkBrackets(expression3));
        System.out.println("Проверка выражения 4: - [{a}[+]{(d*3)} - " + checkBrackets(expression4));
        System.out.println("Проверка выражения 5: - <{a}+{(d*3)}> - " + checkBrackets(expression5));
        System.out.println("Проверка выражения 6: - {a+]}{(d*3)} - " + checkBrackets(expression6));
    }

    private static boolean checkBrackets(String expression) {
        HashMap<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put('(', ')');
        bracketPairs.put('[', ']');
        bracketPairs.put('{', '}');
        bracketPairs.put('<', '>');

        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (isOpenBracket(ch)) {
                stack.push(ch);
            } else if (isCloseBracket(ch)) {
                if (stack.isEmpty() || bracketPairs.get(stack.pop()) != ch) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isOpenBracket(char ch) {
        return ch == '(' || ch == '[' || ch == '{' || ch == '<';
    }

    private static boolean isCloseBracket(char ch) {
        return ch == ')' || ch == ']' || ch == '}' || ch == '>';
    }
}
