package Lesson_05;
/*HashTable.
«Устаревший брат» коллекции HashMap,
который не знает про null.*/
import java.util.Hashtable;
import java.util.Map;

public class Lesson_05_05 {
    public static void main(String[] args) {
        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); //  java.lang.NullPointerException
    }
}
