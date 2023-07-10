package Java_DZ.dz_10;

import Java_DZ.dz_10.Controllers.EmploeeController;
import Java_DZ.dz_10.Controllers.StudentController;
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        Teacher t1 = new Teacher("Иван", 25, "Docent");
        Teacher t2 = new Teacher("Игорь", 23, "Professor");

        PersonComparator<Teacher> comT = new PersonComparator<>();
        comT.compare(t1, t2);

        PersonComparator<Person> comP = new PersonComparator<>();
        comP.compare(s1, t2);

        Emploee e1 = new Emploee("Федорович", 60, "разнорабочим");

        EmploeeController.paySalary(e1);

        EmploeeService empService = new EmploeeService();
        empService.create("Иван", 30);

        StudentService studentService = new StudentService();
        studentService.create("Петр", 20);

        TeacherService teacherService = new TeacherService();
        teacherService.create("Алексей", 40, "PhD");

        List<Teacher> teachers = teacherService.getAll();
        teacherService.sortByFIO();

        AverageAge<Student> averageAgeStudent = new AverageAge<>();
        double averageStudentAge = averageAgeStudent.calculateAverageAge(listStud);

        AverageAge<Teacher> averageAgeTeacher = new AverageAge<>();
        double averageTeacherAge = averageAgeTeacher.calculateAverageAge(teachers);

        System.out.println("Средний возраст студентов: " + averageStudentAge);
        System.out.println("Средний возраст учителей: " + averageTeacherAge);
    }
}