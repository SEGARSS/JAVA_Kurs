package Java_DZ.dz_11;

import java.util.ArrayList;
import java.util.List;

import Java_DZ.dz_11.Controller.Controller;
import Java_DZ.dz_11.Controller.iGetModel;
import Java_DZ.dz_11.Controller.iGetView;
import Java_DZ.dz_11.Model.HashModel;
import Java_DZ.dz_11.Model.ModelFile;
import Java_DZ.dz_11.Model.ModelList;
import Java_DZ.dz_11.Model.Student;
import Java_DZ.dz_11.View.LangSelector;

public class main {
    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей", 21, 101);
        Student s2 = new Student("Андрей", 22, 111);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 301);
        Student s5 = new Student("Даша", 25, 171);
        Student s6 = new Student("Лена", 23, 104);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        iGetModel modelList = new ModelList(students);
        iGetModel modelFile = new ModelFile("D:\\Obuchenie\\JAVA_Kurs\\Java_DZ\\dz_11\\StudentDB.txt");
        iGetModel modelHashMap = new HashModel(students);
        
        iGetView view = LangSelector.select();

        Controller control = new Controller(modelFile, view);

        control.run();

    }
}
