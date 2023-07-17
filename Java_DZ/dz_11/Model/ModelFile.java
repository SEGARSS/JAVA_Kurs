package Java_DZ.dz_11.Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Java_DZ.dz_11.Controller.iGetModel;

public class ModelFile implements iGetModel {
    private String fName;
    private List<Student> students = new ArrayList<>();

    public ModelFile(String fName) {
        this.fName = fName;

        try (FileWriter fw = new FileWriter(fName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> getAll() {
        if (students.size() == 0) {
            try {
                FileReader fr = new FileReader(fName);
                BufferedReader reader = new BufferedReader(fr);
                String line = reader.readLine();
                while (line != null) {
                    String[] details = line.split(" ");
                    Student stud = new Student(details[0], Integer.parseInt(details[1]), Integer.parseInt(details[2]));
                    students.add(stud);
                    line = reader.readLine();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return students;

    }

    public void saveAllToFile(List<Student> students) {
        try (FileWriter fw = new FileWriter(fName, true)) {
            for (Student stud : students) {
                fw.write(stud.getName() + stud.getAge() + " " + stud.getId() + " ");
                fw.append("\n");
            }
            fw.flush();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
