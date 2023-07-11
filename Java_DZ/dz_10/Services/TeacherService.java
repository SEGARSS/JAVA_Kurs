package Java_DZ.dz_10.Services;

import Java_DZ.dz_10.Domen.Person;
import Java_DZ.dz_10.Domen.Teacher;
import Java_DZ.dz_10.Domen.PersonComparator;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Person> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public List<Person> getAll() {
        return teachers;
    }

    public void create(String firstName, int age, String acadDegree) {
        Teacher teacher = new Teacher(firstName, age, acadDegree);
        teachers.add(teacher);
    }

    public void sortByFIO() {
        teachers.sort(new PersonComparator<>());
    }
}
