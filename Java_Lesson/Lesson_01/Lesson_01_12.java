/* Управляющие конструкции:*/
public class Lesson_01_12 {
    public static void main(String[] args) {
        var1();
        var2();
        var3();
        swi();
    }
    /*условный оператор.*/
    private static void var1() {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);
    }
    /*Сокращённая форма оператора.*/
    private static void var2() {
        int a = 1;
        int b = 2;
        int c = 0;
        if (a > b)
            c = a;
        if (b > a)
            c = b;
        System.out.println(c);
    }
    /*Тернарный оператор.*/
    private static void var3() {
        int a = 1;
        int b = 2;
        int min = a < b ? a : b;
        System.out.println(min);
    }
    /*Оператор выбра.*/
    private static void swi(){
        int mounth = 123;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
    }
}
