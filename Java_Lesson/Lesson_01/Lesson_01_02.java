public class Lesson_01_02 {
    public static void main(String[] args) {
        System.out.println("Тип Данных short и int");
        short age = 10;
        int salary = 123456;
        System.out.println(age);
        System.out.println(salary);

        System.out.println("Тип Данных float и double");
        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e);
        System.out.println(pi);

        System.out.println("Тип Данных char");
        char ch = '1';
        System.out.println(ch);
        System.out.println(Character.isDigit(ch));
        ch = 'a';
        System.out.println(Character.isDigit(ch));

        System.out.println("Тип Данных boolean");
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); //true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); //true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3);//false

        System.out.println("Тип Данных String");
        String msg = "Proger Priva!";
        System.out.println(msg);
    }
}
//short, int.
/*Чаще всего будем использовать для решания тех или инных задач тип данных int.
На данный тип int похожь тип данных short но он просто чуть чуть поменьше int в плане
размерности по байтам.*/

//float, double.
/*Что касаемо типа данных float и double. double - понятно, это дробные числа.
float аналогично, но смаленьким но, ему нужна приставка f в конце числа, или иначе
он будет ругаться что не сможет отобразить дробное число. Такаяже приставка в принципе
есть и у double, на конце можем прописывать D типа так - double pi = 3.1415D; но он
её не требует, поэтому скорей всего и чаще всего мы будет рабоать с типом данных double,
он проще.*/

//char
/*Тип данных char который может хранить один любой символ не более.
Плюс, если мы ему присвоем данные вот так - char ch = 2; без ковычек, он нам выдаст не то что мы
ему указали. Поэтому надо вот так - char ch = '2';
Также, с поможь System.out.println(Character.isDigit(ch)); мы можем понять какие именно данные
там, тоесть если какойто символ, буква он нам выдаст false, а если любое число(цифра) выдаст
true.*/

//boolean
/*boolean хранит в себе правду - ложь = true - false.
В примера написанных на нём показали разные варианты записей при которых 
он будет показывать правду и ложь в разных вариациях записей.*/

//String
/*Тип данных String, прописываем в переменную нужные нам данные и выводим их.
Маленькое замечание для себя, хотел данные укахать не в "" двойных кавычках, а
в одинарных - '' - ничего не вышло, кампелятор ругался.*/