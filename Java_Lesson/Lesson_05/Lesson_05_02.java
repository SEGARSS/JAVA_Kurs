package Lesson_05;
/*HashMap. Важное дополнение. Скорость.
Как ускорить работу.*/
import java.util.*;

public class Lesson_05_02 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>(30);
        Map<Integer,String> map3 = new HashMap<>(30, 0.8f);
    }
}
