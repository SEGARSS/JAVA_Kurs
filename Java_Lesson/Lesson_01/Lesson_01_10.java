/*Область видимости переменных.*/
public class Lesson_01_10 {
    public static void main(String[] args) {
        
        {
            int i = 123;
            System.out.println(i);
        }
        
        System.out.println(i); // error: cannot find symbol
    }
}
/*В примере наглядно показано, что мы для переменной i сделали свою отдельную
область видимости, и ниже это области инициализировать её не можем(показать)*/