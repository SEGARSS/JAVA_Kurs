package Java_Seminar.Seminar4;

import java.util.LinkedList;
import java.util.Scanner;

public class task1 {

    private static LinkedList<String> textList = new LinkedList<>();
    private static String lastInput = "";

    public static void run(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.startsWith("print~")) {
                int position = Integer.parseInt(input.substring(6));
                printAndRemoveText(position);
            } else if (input.equals("print")) {
                printAllTexts();
            } else if (input.equals("revert")) {
                removeLastInput();
            } else {
                String[] splitInput = input.split("~");
                if (splitInput.length == 2) {
                    String text = splitInput[0];
                    int position = Integer.parseInt(splitInput[1]);
                    saveText(text, position);
                }
            }
        }
    }

    private static void saveText(String text, int position) {
        if (position >= 0 && position <= textList.size()) {
            textList.add(position, text);
            lastInput = text;
        } else {
            System.out.println("Неверная позиция");
        }
    }

    private static void printAndRemoveText(int position) {
        if (position >= 0 && position < textList.size()) {
            String text = textList.get(position);
            textList.remove(position);
            System.out.println(text);
        } else {
            System.out.println("Неверная позиция");
        }
    }

    private static void printAllTexts() {
        for (int i = textList.size() - 1; i >= 0; i--) {
            System.out.println(textList.get(i));
        }
    }

    private static void removeLastInput() {
        if (!lastInput.isEmpty()) {
            textList.removeLastOccurrence(lastInput);
            lastInput = "";
        } else {
            System.out.println("Предыдущий ввод отсутствует");
        }
    }
}

