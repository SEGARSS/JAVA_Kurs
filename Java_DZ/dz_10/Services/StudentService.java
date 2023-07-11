package Java_DZ.dz_10.Services;

import Java_DZ.dz_10.Domen.PersonComparator;
import Java_DZ.dz_10.Domen.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, предоставляющий сервисные методы для работы со студентами.
 */
public class StudentService implements iPersonService<Student> {
    private int count;
    private final List<Student> students;

    /**
     * Создает новый экземпляр StudentService.
     */
    public StudentService() {
        this.students = new ArrayList<>();
    }

    /**
     * Возвращает список всех студентов.
     *
     * @return список студентов
     */
    @Override
    public List<Student> getAll() {
        return students;
    }

    /**
     * Создает нового студента с указанным именем и возрастом и добавляет его в список студентов.
     *
     * @param firstName имя студента
     * @param age       возраст студента
     */
    @Override
    public void create(String firstName, int age) {
        Student per = new Student(firstName, age, count);
        count++;
        students.add(per);
    }

    /**
     * Сортирует список студентов по ФИО.
     */
    public void sortByFIOStdLst() {
        students.sort(new PersonComparator<>());
    }
}
