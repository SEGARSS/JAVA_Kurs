package Java_Seminar.Seminar4;
/*Замерьте время, за которое в ArrayList добавятся 1000000 элементов.
Замерьте время, за которое в LinkedList добавятся 1000000 элементов. 
Сравните с предыдущим.*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task0 {
    public static void TimeTest(){
        measureArrayListAddTime1();
        measureLinkedListAddTime1();
        measureArrayListAddTime2();
        measureLinkedListAddTime2();
    }

    public static void measureArrayListAddTime2() {
        List<Integer> arrayList = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(0,1);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Время добавления в ArrayList:(добавляет с начала) " + duration + " миллисекунд");
    }

    public static void measureLinkedListAddTime2() {
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(0,1);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Время добавления в LinkedList:(добавляет с начала) " + duration + " миллисекунд");
    }

    public static void measureArrayListAddTime1() {
        List<Integer> arrayList = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Время добавления в ArrayList:(Добавляет с конца) " + duration + " миллисекунд");
    }

    public static void measureLinkedListAddTime1() {
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Время добавления в LinkedList:(Добавляет с конца) " + duration + " миллисекунд");
    }
}

