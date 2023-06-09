package Java_Seminar.Seminar2;
/*Напишите метод, который вернет содержимое текущей папки в виде
массива строк.
📌 Напишите метод, который запишет массив, возвращенный предыдущим
методом в файл.
📌 Обработайте ошибки с помощью try-catch конструкции. В случае
возникновения исключения, оно должно записаться в лог-файл.
📌 А также Напишите метод, который определит тип (расширение) файлов из
текущей папки и выведет в консоль результат вида
1 Расширение файла: txt
2 Расширение файла: pdf
3 Расширение файла:
4 Расширение файла: jpg*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class task4 {
    public static void execute(){
        try {
            String[] fileList = getFolderContents();
            writeArrayToFile("output.txt", fileList);
            printFileExtensions();
        } catch (IOException e) {
            writeExceptionToLog("error.log", e);
        }
    }

    public static String[] getFolderContents() {
        File folder = new File(".");
        File[] files = folder.listFiles();
        String[] fileList = new String[files.length];

        for (int i = 0; i < files.length; i++) {
            fileList[i] = files[i].getName();
        }

        return fileList;
    }

    public static void writeArrayToFile(String filename, String[] array) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            for (String item : array) {
                writer.write(item + "\n");
            }
            System.out.println("Массив успешно записан в файл.");
        }
    }

    public static void printFileExtensions() {
        File folder = new File(".");
        File[] files = folder.listFiles();

        System.out.println("Расширения файлов в текущей папке:");

        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                String extension = getFileExtension(files[i].getName());
                System.out.println((i + 1) + " Расширение файла: " + extension);
            }
        }
    }

    public static String getFileExtension(String filename) {
        int dotIndex = filename.lastIndexOf(".");
        if (dotIndex == -1) {
            return ""; // Если расширение не найдено
        }
        return filename.substring(dotIndex + 1);
    }

    public static void writeExceptionToLog(String filename, IOException e) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(e.toString());
            System.out.println("Исключение записано в лог-файл: " + filename);
        } catch (IOException ex) {
            System.out.println("Ошибка при записи лог-файла: " + ex.getMessage());
        }
    }
}

