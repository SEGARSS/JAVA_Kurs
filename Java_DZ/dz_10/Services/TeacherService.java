package Java_DZ.dz_10.Services;

import Java_DZ.dz_10.Domen.PersonComparator;
import Java_DZ.dz_10.Domen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public List<Teacher> getAll() {
        return teachers;
    }

    public void create(String firstName, int age, String acadDegree) {
        Teacher teacher = new Teacher(firstName, age, acadDegree);
        teachers.add(teacher);
    }

    public void sortByFIO() {
        teachers.sort(new PersonComparator<Teacher>());
    }
}
