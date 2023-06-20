package Java_Seminar.Seminar5;

/*Взять набор строк, например,
Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
Написать метод, который отсортирует эти строки по длине с помощью TreeMap. 
Строки с одинаковой длиной не должны “потеряться”.*/

import java.util.Map;
import java.util.TreeMap;

public class task2 {
    public static void task2(){
        String[] strings = {
                "Мороз и солнце день чудесный",
                "Еще ты дремлешь друг прелестный",
                "Пора красавица проснись"
        };

        Map<Integer, String> sortedMap = sortStringsByLength(strings);

        for (String string : sortedMap.values()) {
            System.out.println(string);
        }
    }

    private static Map<Integer, String> sortStringsByLength(String[] strings) {
        Map<Integer, String> lengthMap = new TreeMap<>();

        for (String string : strings) {
            int length = string.length();
            if (lengthMap.containsKey(length)) {
                String existingString = lengthMap.get(length);
                lengthMap.put(length, existingString + "\n" + string);
            } else {
                lengthMap.put(length, string);
            }
        }

        return lengthMap;
    }
}

