package Lesson_02;

import java.io.File;

public class Lesson_02_01 {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathDir = pathProject.concat("file.txt");
        File dir = new File(pathDir);
        System.out.println(dir.getAbsolutePath());
        if (dir.mkdir()) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        for (String fname : dir.list()) {
            System.out.println(fname);
        }
    }
}
