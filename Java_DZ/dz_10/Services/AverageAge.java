package Java_DZ.dz_10.Services;

import Java_DZ.dz_10.Domen.Person;
import Java_DZ.dz_10.Domen.Teacher;
import Java_DZ.dz_10.Domen.Emploee;

import java.util.List;

/**
 * Класс, предоставляющий методы для вычисления среднего возраста и средней зарплаты.
 *
 * @param <T> тип персоны, должен быть наследником класса Person
 */
public class AverageAge<T extends Person> {
    /**
     * Вычисляет средний возраст для списка персон.
     *
     * @param persons список персон
     * @return средний возраст
     */
    public double calculateAverageAge(List<T> persons) {
        int totalAge = 0;
        for (T person : persons) {
            totalAge += person.getAge();
        }
        return (double) totalAge / persons.size();
    }

    /**
     * Вычисляет среднюю зарплату для списка учителей.
     *
     * @param teachers список учителей
     * @return средняя зарплата учителей
     */
    public double calculateAverageTeacherSalary(List<Teacher> teachers) {
        double totalSalary = 0;
        for (Teacher teacher : teachers) {
            totalSalary += teacher.getSalary();
        }
        return totalSalary / teachers.size();
    }

    /**
     * Вычисляет среднюю зарплату для списка сотрудников.
     *
     * @param emploees список сотрудников
     * @return средняя зарплата сотрудников
     */
    public double calculateAverageEmploeeSalary(List<Emploee> emploees) {
        double totalSalary = 0;
        for (Emploee emploee : emploees) {
            totalSalary += emploee.getSalary();
        }
        return totalSalary / emploees.size();
    }
}
