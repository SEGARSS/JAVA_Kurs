package Java_DZ.dz_04;

import java.util.LinkedList;

/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.*/

public class dz_04_01<T> {
    public static void dz_04(){
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(ll, getRandomNumber()); //заполняем случайными числами
        }
        System.out.println(ll);

        System.out.println(dequeue(ll)); // удалили первый элемент
        System.out.println(ll);

        System.out.println(first(ll)); // вывели первый элемент
        System.out.println(ll); 
    }

    private static void enqueue(LinkedList<Integer> ll, int num) {// помещает элемент в конец очереди
        ll.addLast(num);
    }

    private static int dequeue(LinkedList<Integer> ll) { // возвращает первый элемент из очереди и удаляет его
        int num = ll.get(0);
        ll.remove(0);
        return num;
    }

    private static int first(LinkedList<Integer> ll) { // возвращает первый элемент из очереди, не удаляя
        int num = ll.get(0);
        return num;
    }

    private static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}

