package Java_DZ.dz_11.Model;

import java.util.ArrayList;
import java.util.List;

import Java_DZ.dz_11.Controller.iGetModel;

public class ModelList implements iGetModel {
    private List<Student> students = new ArrayList<>();

    public ModelList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAll() {
        return students;
    }

    @Override
    public boolean deleteStudent(long id) {
        boolean res = false;

        for (Student stud : students) {

            if (stud.getId() == id) {
                students.remove(students.indexOf(stud));
                res = true;
                break;
            }
        }
        return res;
    }
}
