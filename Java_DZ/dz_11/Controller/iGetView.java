package Java_DZ.dz_11.Controller;

import java.util.List;

import Java_DZ.dz_11.Model.Student;

public interface iGetView {
    void printAllSudents(List<Student> students);

    String prompt(String msg);

    Long getStudentIdToDelete();

    void displayStudent(String msg, Student stud);

    Student readStudent();

    Long getStudentIdToUpdate();

    String msgOnInvite();

    String msgEmptyStudentList();

    String msgOnExit();

    String msgOnDelete(long id, boolean result);

    String msgOnBadCommand();

    String wordStudent();

    String wordName();

    String wordAge();
}


