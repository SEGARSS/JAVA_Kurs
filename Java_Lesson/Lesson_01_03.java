/*Неявное преобразование.*/

public class Lesson_01_03 {
    public static void main(String[] args) {
        var i = 123;
        System.out.println(i);
        System.out.println("Получаем тип");
        System.out.println(getType(i));
        System.out.println("     ");

        var d = 123.25;
        System.out.println(d);
        System.out.println("Получаем тип");
        System.out.println(getType(d));
        System.out.println("     ");

        var s = "Priva Proger";
        System.out.println(s);
        System.out.println("Получаем тип");
        System.out.println(getType(s));
        System.out.println("     ");

        var c = '&';
        System.out.println(c);
        System.out.println("Получаем тип");
        System.out.println(getType(c));
        System.out.println("     ");
    }

    static String getType(Object o){
        return o.getClass().getSimpleName();
        }
}
/*В данном примере, мы везде указали var(такова типа данных нет) но за нас компелятор
сделал неявное присваивание, которое больше всего подходит к тем данным которые мы ему
предоставили, тоесть 
переменная (i) - int, 
переменная (d) - double, 
переменная (s) - String,
переменная (c) - char,
Как названны переменные, неимеет значения. Компелятор будет смотреть какие конкретно данные
внесенны. Если он видит число к примеру дробное, он сделает неявное присвание данному значению
тип double, а если он видит к примеру двойные ковычки и какието там данные, то присвоит туда
тип String. 
Это и есть неявное присваивание.
Написав клас static String getType(Object o), 
далее мы с помощью кода - System.out.println(getType());
и прописав туда любую переменную из тех что мы написали, мы увидим тип данных
которые преобразовал компелятор.*/