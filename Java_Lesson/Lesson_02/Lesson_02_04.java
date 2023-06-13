package Lesson_02;

import java.io.IOException;
import java.util.logging.*;

public class Lesson_02_04 {
    public static void main(String[] args) throws IOException  {
        Logger logger = Logger.getLogger(Lesson_02_04.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("D:\\Obuchenie\\JAVA_Kurs\\Java_Lesson\\Lesson_02\\log.txt");
        //logger.addHandler(ch);
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        //XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        //fh.setFormatter(xml);
        
        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
    }
}
