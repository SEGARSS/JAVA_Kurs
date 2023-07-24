package Java_DZ.dz_11;

import java.util.ArrayList;
import java.util.List;

import Java_DZ.dz_11.Controller.Command;
import Java_DZ.dz_11.Controller.Controller;
import Java_DZ.dz_11.Controller.iGetModel;
import Java_DZ.dz_11.Controller.iGetView;
import Java_DZ.dz_11.Controller.iGetViewEng;
import Java_DZ.dz_11.Controller.iGetViewRus;
import Java_DZ.dz_11.Model.HashModel;
import Java_DZ.dz_11.Model.ModelFile;
import Java_DZ.dz_11.Model.ModelList;
import Java_DZ.dz_11.Model.Person;
import Java_DZ.dz_11.Model.Student;
import Java_DZ.dz_11.View.ViewEng;
import Java_DZ.dz_11.View.ViewRus;

/**
 * Приложение для работы со списком студентов.
 * 
 * Версия: 1.0
 * Автор: Рябков Сергей
 * Дата: 17.07.2023 года.
 * 
 * <p>Основной класс: {@link main}</p>
 * Основной класс программы, содержит метод main, который является точкой входа в программу. 
 * В нем создаются объекты и демонстрируется функциональность системы.
 * 
 * <p>Классы:Java_DZ.dz_11.Controllers. Cодержит классы контроллеров и интерфейсы для взаимодействия с моделью и представлением.
 * {@link Command} - Команды, используемые в программе.
 * {@link Controller} - Основной контроллер приложения, обрабатывает команды пользователя.
 * {@link iGetModel} - Интерфейс для моделей данных, определяет методы для работы с данными.
 * {@link iGetView} - Интерфейс для представлений, определяет методы для вывода информации и ввода данных.
 * {@link iGetViewEng} - Представляющий пользовательский интерфейс на английском языке.
 * {@link iGetViewRus} - Представляющий пользовательский интерфейс на Русском языке.
 * 
 * <p>Классы:Java_DZ.dz_11.Model: содержит классы моделей данных и абстрактный класс Person.
 * {@link HashModel} - Модель данных, использующая хэш-таблицу для хранения студентов.
 * {@link ModelFile} - Модель данных, использующая файл для хранения студентов.
 * {@link ModelList} - Модель данных, использующая список для хранения студентов.
 * {@link Person} - Абстрактный класс.
 * {@link Student} - Представляющий студента с информацией о имени, возрасте и ID.
 * 
 * <p>Классы:Java_DZ.dz_11.View: содержит классы представлений для вывода информации и взаимодействия с пользователем.
 * {@link ViewEng} - Выводит информацию на английском языке.
 * {@link ViewRus} - Выводит информацию на Русском языке.
 * */

public class main {

    /**
     * Главный метод, запускающий приложение.
     *
     * @param args аргументы командной строки
     * @throws Exception исключение, возникающее при выполнении программы
     */
    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей", 21, 101);
        Student s2 = new Student("Андрей", 22, 111);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 301);
        Student s5 = new Student("Даша", 25, 171);
        Student s6 = new Student("Лена", 23, 104);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        iGetModel modelList = new ModelList(students);
        iGetModel modelFile = new ModelFile("D:\\Obuchenie\\JAVA_Kurs\\Java_DZ\\dz_11\\StudentDB.txt");
        iGetModel modelHashMap = new HashModel(students);
        
        iGetView view = iGetView.LangSelector.select();

        Controller control = new Controller(modelFile, view);

        control.run();

    }
}
