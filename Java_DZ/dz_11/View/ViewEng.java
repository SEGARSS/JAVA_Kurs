package Java_DZ.dz_11.View;

import java.util.List;
import java.util.Scanner;

import Java_DZ.dz_11.Controller.iGetView;
import Java_DZ.dz_11.Model.Student;

public class ViewEng implements iGetView {

    public void printAllSudents(List<Student> students) {
        System.out.println("=======List of students=======>");
        for (Student stud : students) {
            System.out.println(wordStudent() + ": [" + wordName() + " = " + stud.getName() + ", " + wordAge() + " = "
                    + stud.getAge() + ", ID = " + stud.getId() + "]");
        }
        System.out.println("==============================");
    }

    @Override
    public String prompt(String msg) {
        Scanner iScan = new Scanner(System.in);
        System.out.println(msg);
        return iScan.nextLine();
    }

    @Override
    public Long getStudentIdToDelete() {
        long id = Integer.parseInt(prompt("Enter ID of the student to delete: "));
        return id;
    }

    @Override
    public void displayStudent(String msg, Student stud) {
        System.out.println(msg + stud);
    }

    @Override
    public Student readStudent() {
        return null;
    }

    @Override
    public Long getStudentIdToUpdate() {
        long id = Integer.parseInt(prompt("Enter ID of the student to update: "));
        return id;
    }

    @Override
    public String msgOnInvite() {
        return "Enter new command: ";
    }

    @Override
    public String msgEmptyStudentList() {
        return "The list of students is empty!";
    }

    @Override
    public String msgOnExit() {
        return "Exiting the application...";
    }

    @Override
    public String msgOnDelete(long id, boolean result) {
        if (result) {
            return "Student with ID " + id + " has been successfully deleted!";
        } else {
            return "Student with ID " + id + " has NOT been found in database!";
        }
    }

    @Override
    public String msgOnBadCommand() {
        return "There is no such command!";
    }

    @Override
    public String wordStudent() {
        return "Student";
    }

    @Override
    public String wordName() {
        return "Name";
    }

    @Override
    public String wordAge() {
        return "Age";
    }
}
