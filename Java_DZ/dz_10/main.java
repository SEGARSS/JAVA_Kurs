package Java_DZ.dz_10;

import Java_DZ.dz_10.Controllers.EmploeeController;
import Java_DZ.dz_10.Controllers.StudentController;
import Java_DZ.dz_10.Controllers.iPersonController;
import Java_DZ.dz_10.Controllers.TeacherController;
import Java_DZ.dz_10.Domen.Emploee;
import Java_DZ.dz_10.Domen.Person;
import Java_DZ.dz_10.Domen.PersonComparator;
import Java_DZ.dz_10.Domen.Student;
import Java_DZ.dz_10.Domen.StudentGroup;
import Java_DZ.dz_10.Domen.Teacher;
import Java_DZ.dz_10.Services.AverageAge;
import Java_DZ.dz_10.Services.EmploeeService;
import Java_DZ.dz_10.Services.StudentService;
import Java_DZ.dz_10.Services.TeacherService;
import Java_DZ.dz_10.Services.iPersonService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Программа представляет собой пример простой системы для управления информацией о студентах, 
 * учителях и сотрудниках.
 * 
 * Версия: 2.0
 * Автор: Рябков Сергей
 * Дата: 11.07.2023 года.
 * 
 * Она демонстрирует использование различных классов, 
 * включая контроллеры, доменные объекты и сервисы, для обработки и отображения данных.
 * В программе реализованы функции создания студентов, 
 * учителей и сотрудников, а также вычисления среднего возраста и средней зарплаты.
 *
 * <p>Основной класс: {@link main}</p>
 * Основной класс программы, содержит метод main, который является точкой входа в программу. 
 * В нем создаются объекты и демонстрируется функциональность системы.
 * 
 * <p>Классы:которые находятся в пакете Java_DZ.dz_10.Controllers.
 * - {@link EmploeeController}: является контроллером, отвечающим за управление объектами сотрудников в системе.
 * - {@link iPersonController}: определяет контракт для контроллеров, которые управляют объектами персон в системе.
 * - {@link StudentController}: представляет контроллер для управления объектами типа Student в системе.
 * - {@link TeacherController}: представляет контроллер для управления объектами типа Teacher в системе.
 * 
 * <p>Классы:которые находятся в пакете Java_DZ.dz_10.Domen.
 * - {@link Emploee}: Класс, представляющий сотрудника.
 * - {@link Person}: Абстрактный класс, представляющий человека.
 * - {@link PersonComparator}: класс компаратора, используемый для сравнения объектов типа Person по ФИО.
 * - {@link Student}: Класс, предстовляющий студента.
 * - {@link StudentGroup}: Класс, предстовляющий группу студентов.
 * - {@link Teacher}: Класс, предстовляющий учителя.
 * 
 * <p>Классы:которые находятся в пакете Java_DZ.dz_10.Services.
 * - {@link AverageAge}: класс сервиса, предоставляющий методы для вычисления среднего возраста и средней зарплаты.
 * - {@link EmploeeService}: предоставляет методы для добавления, обновления, удаления и получения информации о работниках.
 * - {@link StudentService}: предоставляет методы для добавления, обновления, удаления и получения информации о студентах.
 * - {@link TeacherService}: предоставляет методы для добавления, обновления, удаления и получения информации о учителях.
 * - {@link iPersonService}: предоставляет общий набор методов, которые должны быть реализованы в сервисах, управляющих различными типами персон 
 */

public class main {
    public static void main(String[] args) {
        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 444);
        Student s5 = new Student("Даша", 23, 171);
        Student s6 = new Student("Лена", 23, 104);

        List<Student> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println(group4580);

        for (Student std : group4580) {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for (Student std : group4580.getGroup()) {
            System.out.println(std);
        }

        PersonComparator<Student> comS = new PersonComparator<>();
        comS.compare(s1, s2);

        

        EmploeeService empService = new EmploeeService();
        empService.create("Иван", 30, "слесарь", 9000);
        empService.create("Петр", 35, "электрик", 8000);
        empService.create("Анна", 28, "плотник", 7000);
        empService.create("Мария", 42, "сварщик", 9500);
        empService.create("Алексей", 39, "монтажник", 8500);

        StudentService studentService = new StudentService();
        studentService.create("Петр", 20);

        TeacherService teacherService = new TeacherService();
        teacherService.create("Алексей", 40, "PhD", 12000);
        teacherService.create("Мария", 35, "MSc", 15000);
        teacherService.create("Андрей", 45, "PhD", 16000);
        teacherService.create("Иван", 25, "Docent", 10000);
        teacherService.create("Игорь", 23, "Professor", 15000);

        List<Person> teachers = teacherService.getAll();
        teacherService.sortByFIO();

        List<Emploee> emploees = empService.getAll();

        AverageAge<Student> averageAgeStudent = new AverageAge<>();
        double averageStudentAge = averageAgeStudent.calculateAverageAge(listStud);

        AverageAge<Person> averageAgeTeacher = new AverageAge<>();
        double averageTeacherAge = averageAgeTeacher.calculateAverageAge(teachers);
        double averageTeacherSalary = teacherService.calculateAverageTeacherSalary();

        AverageAge<Emploee> averageAgeEmploee = new AverageAge<>();
        double averageEmploeeAge = averageAgeEmploee.calculateAverageAge(emploees);
        double averageEmploeeSalary = averageAgeEmploee.calculateAverageEmploeeSalary(emploees);

        System.out.println("Средний возраст студентов: " + averageStudentAge);

        System.out.println("Список учителей:");
        for (Person teacher : teachers) {
            Teacher t = (Teacher) teacher;
            System.out.println(t.getName() + " (Возраст: " + t.getAge() + ", Должность: " + t.getAcadDegree() + ", Зарплата: " + t.getSalary() + ")");
        }

        System.out.println("Средний возраст учителей: " + averageTeacherAge);
        System.out.println("Средняя зарплата учителей: " + averageTeacherSalary);

        System.out.println("Список работников:");
        for (Emploee emploee : emploees) {
            System.out.println(emploee.getName() + " (Возраст: " + emploee.getAge() + ", Должность: " + emploee.getSpecial() + ", Зарплата: " + emploee.getSalary() + ")");
        }

        System.out.println("Средний возраст работников: " + averageEmploeeAge);
        System.out.println("Средняя зарплата работников: " + averageEmploeeSalary);
    }
    
}

