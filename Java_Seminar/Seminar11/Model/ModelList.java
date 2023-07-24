<<<<<<< HEAD
package Model;

import java.util.List;

import Controller.iGetModel;
=======
package Java_Seminar.Seminar11.Model;

import java.util.List;

import Java_Seminar.Seminar11.Controller.iGetModel;
>>>>>>> 61358c10d04c212a76715c1de1717fc14fa6dd6e

public class ModelList implements iGetModel {
    private List<Student> students;

    public ModelList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents()
    {
        return students;
    }
}
