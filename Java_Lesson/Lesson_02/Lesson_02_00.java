package Lesson_02;

/*Что такое API - API (Application programming interface) —
это контракт, который предоставляет программа.
«Ко мне можно обращаться так и так, я обязуюсь
делать то и это».*/

/*Что такое API для нас - Это возможности, который предоставляют
разработчики языка для удобного
взаимодействия с его функционалом*/

/*Что такое API для нас: строки.*/
public class Lesson_02_00 {
    public static void main(String[] args) {
        //Prim1();
        Prim2();
    }

    private static void Prim1() {
        var s = System.currentTimeMillis();
        // String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            // str += "+";
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);
        // System.out.println(str);
        // System.out.println(sb);
    }

    private static void Prim2() {
        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
        // C,е,р,г,е,й
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
    }

}
