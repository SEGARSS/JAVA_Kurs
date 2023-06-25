package Java_Seminar.Seminar6;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class task1 {
    public static void task0(){
        int[] array = generateArray(1000);
        double uniquePercentage = calculateUniquePercentage(array);
        System.out.println("Уникальный процент: " + uniquePercentage + "%");
    }

    private static int[] generateArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(25);
        }

        return array;
    }

    private static double calculateUniquePercentage(int[] array) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int number : array) {
            uniqueNumbers.add(number);
        }

        int uniqueCount = uniqueNumbers.size();
        int totalCount = array.length;
        double uniquePercentage = (double) uniqueCount * 100 / totalCount;

        return uniquePercentage;
    }
}

