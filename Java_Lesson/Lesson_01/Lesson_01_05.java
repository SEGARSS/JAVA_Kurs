/*Массивы.*/

public class Lesson_01_05 {
    public static void main(String[] args) {
        mass1();
        mass2();
        mass3();
    }

    /*Массив. Одномерный.*/
    private static void mass1(){
        System.out.println("Одномерный Массив!");
        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        arr = new int[] { 1, 2, 3, 4, 5 };//Если массиву не указали данные, по умолчанию он заполняеться нулями.
        System.out.println(arr.length); // 5
        System.out.println(arr[2]); //Непосредственное обращение к обредеоённой ячейки массива.
        System.out.println("=======================\n");

    }

    /*Многомерный массив.*/
    /*Заполнение многомерного массивая с помощью цикла нулями.*/
    private static void mass2(){
        System.out.println("Многомерный Массив!");
        int[][] arr = new int[3][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }      
            System.out.println();
        }
        System.out.println("=======================\n");
    }
    /*Многомерный массив.*/
    /*Другая форма записи, как пример заполнения массива нулями.*/
    private static void mass3(){
        System.out.println("Многомерный Массив!");
        int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
        System.out.println("=======================");
    }
}




/* */