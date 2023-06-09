package Java_Seminar.Seminar2;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class task3 {
    public static void execute(){
        String repeatedString = repeatString("TEST", 100);
        writeToFile("output.txt", repeatedString);
    }

    public static String repeatString(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void writeToFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
            System.out.println("Файл успешно записан.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        }
    }
}

