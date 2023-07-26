<<<<<<< HEAD
package View;
=======
package Java_Seminar.Seminar11.View;
>>>>>>> 61358c10d04c212a76715c1de1717fc14fa6dd6e

import java.util.List;
import java.util.Scanner;

<<<<<<< HEAD
import Controller.iGetView;
import Model.Student;
=======
import Java_Seminar.Seminar11.Controller.iGetView;
import Java_Seminar.Seminar11.Model.Student;
>>>>>>> 61358c10d04c212a76715c1de1717fc14fa6dd6e

public class View implements iGetView {

    public void printAllStudents(List<Student> students)
    {
        System.out.println("------список студентов--------");
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("===============================");
    }

    @Override
    public void printAllStudent(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printAllStudent'");
    }

    @Override
    public String prompt(String msg) {
       Scanner in = new Scanner(System.in);
       System.out.print(msg);
       return in.nextLine();
    }

    @Override
    public Long getStudentIdToDelete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToDelete'");
    }

    @Override
    public void displayStudents(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayStudents'");
    }

    @Override
    public Student readStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readStudent'");
    }

    @Override
    public Long getStudentIdToUpdate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToUpdate'");
    }
    
<<<<<<< HEAD
}
=======
}
>>>>>>> 61358c10d04c212a76715c1de1717fc14fa6dd6e
