package Java_Seminar.Seminar1;

import java.time.LocalTime;
import java.util.Scanner;
public class Seminar_01_00 {

    public static void main(String[] args) {
        //task0();
        //task1();
        //task2();
        //task3();
        task4();
    }

    private static void task0(){
        /*task0.
        Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
        Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Привет, " + name + "!");
    }

    private static void task1(){
        /*task1.
        В консоли запросить имя пользователя. 
        В зависимости от текущего времени, вывести приветствие вида 
        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59 */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();

        String greeting;
        if (hour >= 5 && hour <= 11) {
            greeting = "Доброе утро";
        } else if (hour >= 12 && hour <= 17) {
            greeting = "Добрый день";
        } else if (hour >= 18 && hour <= 22) {
            greeting = "Добрый вечер";
        } else {
            greeting = "Доброй ночи";
        }

        System.out.println(greeting + ", " + name + "!");
    }

    private static void task2(){
        /*task2.
        Дан массив двоичных чисел, например [1,1,0,1,1,1], 
        вывести максимальное количество подряд идущих 1.*/
        int[] binaryArray = {1, 1, 0, 1, 1, 1};

        int maxConsecutiveOnes = findMaxConsecutiveOnes(binaryArray);
        System.out.println("Максимальное количество подряд идущих единиц: " + maxConsecutiveOnes);
        
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;

        for (int num : nums) {
            if (num == 1) {
                currentConsecutiveOnes++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
            } else {
                currentConsecutiveOnes = 0;
            }
        }
        return maxConsecutiveOnes;
    }


    private static void task3(){
        /*task3.
        Дан массив nums = [3,2,2,3] и число val = 3. 
        Если в массиве есть числа, равные заданному, 
        нужно перенести эти элементы в конец массива. 
        Таким образом, первые несколько (или все) 
        элементов массива должны быть отличны от заданного, а остальные - равны ему.*/
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        moveElementsToEnd(nums, val);

        System.out.print("Результат: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void moveElementsToEnd(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            if (nums[i] == val) {
                // Найдено число, равное val
                // Меняем его местами с элементом в конце массива
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            } else {
                // Элемент отличен от val, переходим к следующему
                i++;
            }
        }
    }

    private static void task4(){
        /*task4.
        Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
        Если общего префикса нет, вернуть пустую строку "". */
        String[] strings = {"dom", "domovoi", "domiki"};
        String longestCommonPrefix = findLongestCommonPrefix(strings);
        System.out.println("Самый длинный общий префикс: " + longestCommonPrefix);
    }
    public static String findLongestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        String prefix = strings[0];
        for (int i = 1; i < strings.length; i++) {
            while (!strings[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}


