<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.ModelFile;
import Model.ModelList;
import Model.Student;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");

=======
package Java_Seminar.Seminar11;

import java.util.ArrayList;
import java.util.List;

import Java_Seminar.Seminar11.Controller.Controller;
import Java_Seminar.Seminar11.Controller.iGetModel;
import Java_Seminar.Seminar11.Controller.iGetView;
import Java_Seminar.Seminar11.Model.ModelFile;
import Java_Seminar.Seminar11.Model.ModelList;
import Java_Seminar.Seminar11.Model.Student;
import Java_Seminar.Seminar11.View.View;

public class App {
    public static void main(String[] args) throws Exception {
       
>>>>>>> 61358c10d04c212a76715c1de1717fc14fa6dd6e
       List<Student> students = new ArrayList<Student>();
       Student s1 = new Student("Сергей",  21, 101);
       Student s2 = new Student("Андрей",  22, 111);
       Student s3 = new Student("Иван", 22, 121);
       Student s4 = new Student("Игорь", 23, 301);
       Student s5 = new Student("Даша",  25, 171);
       Student s6 = new Student("Лена",  23, 104);
       students.add(s1);
       students.add(s2);
       students.add(s3);
       students.add(s4);
       students.add(s5);
       students.add(s6);

<<<<<<< HEAD
       ModelFile fModel = new ModelFile("D:\\Obuchenie\\JAVA_Kurs\\JAVA_Kurs\\Java_Seminar\\Seminar11\\StudentDB.txt");
=======
       ModelFile fModel = new ModelFile("D:\\Obuchenie\\JAVA_Kurs\\Java_Seminar\\Seminar11\\StudentDB.txt");
>>>>>>> 61358c10d04c212a76715c1de1717fc14fa6dd6e
       //fModel.saveAllStudentToFile(students);

       iGetModel modelFile = fModel;
       iGetModel model = new ModelList(students);
       iGetView view = new View();

       Controller control = new Controller(modelFile, view);

       //control.update();
       control.run();

    }
}
