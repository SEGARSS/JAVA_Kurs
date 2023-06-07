
/*Запрос ввода данных от пользователей в терминал.*/
import java.util.Scanner;

public class Lesson_01_07 {
    public static void main(String[] args) {
        // strok();
        //chisla();
        zah();
    }

    /* Строки. Запрашиваем имя и в ответ приветствуем. Фома записи кода. */
    private static void strok() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }

    /*Запрос числовых для дальнейшего действия по созданному условию. Форма
    написания кода.*/
    private static void chisla() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner.close();
    }

    /*Защита от дурака. Он точно должен ввести числовые данные(int), иначе термил
    выдаст ошибку.*/
    private static void zah() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();
    }
}
