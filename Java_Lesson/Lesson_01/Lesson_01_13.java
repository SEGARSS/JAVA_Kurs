/*ЦИклы.*/
public class Lesson_01_13 {
    public static void main(String[] args) {
        whi();
        dowhi();
        fo();
        vfo();
        kfo();
    }

    /* Цикл while. */
    private static void whi() {
        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
    }

    /* Цикл do while. */
    private static void dowhi() {
        int value = 321;
        int count = 0;
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);
    }

    /* Оператор цикла for. */
    private static void fo() {
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);
    }

    /* Вложенные циклы. */
    private static void vfo() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* Работает только для коллекций. */
    private static void kfo() {
        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }
}
