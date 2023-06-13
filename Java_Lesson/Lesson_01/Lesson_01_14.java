/*Работа с файлами.*/
import java.io.*;
public class Lesson_01_14 {
    public static void main(String[] args) {
        sozdaniy();
    }

    /* Создание и запись\ дозапись. */
    /* Создаёться в корне проекта файл file.txt и в нутри него прописываеться line1, 2, line 3.*/
    private static void sozdaniy() {
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
