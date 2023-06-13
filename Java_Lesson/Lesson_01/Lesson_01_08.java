/*Форматированный вывод.*/
public class Lesson_01_08 {
    public static void main(String[] args) {
        //var1();
        var2();
    }

    /* Один вариант формы написания кода. */
    private static void var1() {
        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println(res);
    }

    /*Другой формат вариант формы написания кода с двумя выводами одного значения. */
    private static void var2() {
        int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d \n", a, b, c);
        System.out.printf("%d + %d = %d \n", a, b, c);
        System.out.println(res);
    }
}
