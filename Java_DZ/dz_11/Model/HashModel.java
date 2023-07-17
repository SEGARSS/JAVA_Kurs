package Java_DZ.dz_11.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Java_DZ.dz_11.Controller.iGetModel;

public class HashModel implements iGetModel {
    private HashMap<Long, Student> students = new HashMap<>();
    private long count;

    public HashModel(List<Student> studList) {
        count = 1;
        for (Student stud : studList) {
            students.put(count, stud);
            count++;
        }
    }

    public List<Student> getAll() {
        return new ArrayList<Student>(students.values());
    }

    public HashMap<Long, Student> getStudentsAsHashMap() {
        return students;
    }

    @Override
    public boolean deleteStudent(long id) {
        boolean res = false;

        for (long key : students.keySet()) {
            if (students.get(key).getId() == id) {
                students.remove(key);
                res = true;
                break;
            }
        }
        return res;
    }
}
