package Java_DZ.dz_10.Services;

import Java_DZ.dz_10.Domen.Person;
import Java_DZ.dz_10.Domen.Teacher;
import Java_DZ.dz_10.Domen.PersonComparator;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, предоставляющий сервисные методы для работы с учителями.
 */
public class TeacherService {
    
    private List<Person> teachers;

    /**
     * Создает новый экземпляр TeacherService.
     */
    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    /**
     * Возвращает список всех учителей.
     *
     * @return список учителей
     */
    public List<Person> getAll() {
        return teachers;
    }

    /**
     * Создает нового учителя с указанными именем, возрастом, ученой степенью и зарплатой и добавляет его в список учителей.
     *
     * @param firstName   имя учителя
     * @param age         возраст учителя
     * @param acadDegree  ученая степень учителя
     * @param salary      зарплата учителя
     */
    public void create(String firstName, int age, String acadDegree, double salary) {
        Teacher teacher = new Teacher(firstName, age, acadDegree, salary);
        teachers.add(teacher);
    }

    /**
     * Сортирует список учителей по ФИО.
     */
    public void sortByFIO() {
        teachers.sort(new PersonComparator<>());
    }
    
    /**
     * Вычисляет среднюю зарплату учителей.
     *
     * @return средняя зарплата учителей
     */
    public double calculateAverageTeacherSalary() {
        double totalSalary = 0;
        for (Person teacher : teachers) {
            Teacher t = (Teacher) teacher;
            totalSalary += t.getSalary();
        }
        return totalSalary / teachers.size();
    }
}

