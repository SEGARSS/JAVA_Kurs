package Java_Seminar.Seminar6;

/*1.Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. 
Распечатайте содержимое данного множества.
2.Создайте LinkedHashSet, заполните его следующими числами: 
{1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
3.Создайте TreeSet, заполните его следующими числами: 
{1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class task0 {
    public static void task0(){
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(3);

        System.out.println("HashSet:");
        for (Integer num : hashSet) {
            System.out.println(num);
        }
        System.out.println("----------------");

        // LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        linkedHashSet.add(3);

        System.out.println("LinkedHashSet:");
        for (Integer num : linkedHashSet) {
            System.out.println(num);
        }
        System.out.println("----------------");

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(3);

        System.out.println("TreeSet:");
        for (Integer num : treeSet) {
            System.out.println(num);
        }
        System.out.println("----------------");
    }
}

