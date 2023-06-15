package Lesson_03;

import java.util.Arrays;
import java.util.List;

/*Коллекции. Функционал.*/

public class Lesson_03_03 {
    public static void main(String[] args) {
        //prim1();
        //prim2();
    }

    private static void prim1() {
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = { day, month, year };
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]
        date[1] = new StringBuilder("09");
        System.out.println(d); // [29, 09, 1990]

    }

    private static void prim2() {
        Character value = null;
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list1);
        // list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list2 = List.copyOf(list1);
        // not null, immutable

    }
}
