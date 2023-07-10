package Java_DZ.dz_10.Services;
import Java_DZ.dz_10.Domen.PersonComparator;
import Java_DZ.dz_10.Domen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iPersonService<Student> {
    private int count;
    private final List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, int age) {
        Student per = new Student(firstName, age, count);
        count++;
        students.add(per);
    }

    public void sortByFIOStdLst() {
        students.sort(new PersonComparator<>());
    }
}
