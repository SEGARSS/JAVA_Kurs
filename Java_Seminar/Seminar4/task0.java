package Java_Seminar.Seminar4;
/*Замерьте время, за которое в ArrayList добавятся 1000000 элементов.
Замерьте время, за которое в LinkedList добавятся 1000000 элементов. 
Сравните с предыдущим.*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task0 {
    public static void TimeTest(){
        measureArrayListAddTime();
        measureLinkedListAddTime();
    }

    public static void measureArrayListAddTime() {
        List<Integer> arrayList = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Время добавления в ArrayList: " + duration + " миллисекунд");
    }

    public static void measureLinkedListAddTime() {
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Время добавления в LinkedList: " + duration + " миллисекунд");
    }
}

