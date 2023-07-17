package Java_DZ.dz_11.Controller;

import java.util.List;

import Java_DZ.dz_11.Model.Student;

public interface iGetModel {
    public List<Student> getAll();

    public boolean deleteStudent(long id);
}
