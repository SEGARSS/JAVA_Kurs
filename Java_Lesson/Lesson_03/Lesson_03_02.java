package Lesson_03;

/*Коллекци.*/

import java.util.ArrayList;
import java.util.List;

public class Lesson_03_02 {
    public static void main(String[] args) {
        //prim1();
        prim2();
    }

    /* Коллекции. Row Type. */

    private static void prim1() {
        List list = new ArrayList();
        list.add(2809);
        list.add("string line");
        for (Object o : list) {
            System.out.println(o);
            // Проблема извлечения данных
        }
    }

    /* Коллекции. Save Type. */

    private static void prim2() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(123);
        // list.add("string line");
        for (Object o : list) {
            System.out.println(o);
            // Проблема извлечения данных
        }
    }

}
