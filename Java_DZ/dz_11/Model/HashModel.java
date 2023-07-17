package Java_DZ.dz_11.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Java_DZ.dz_11.Controller.iGetModel;

/**
 * Implementation of the iGetModel interface using a HashMap to store student data.
 */
public class HashModel implements iGetModel {
    private HashMap<Long, Student> students = new HashMap<>();
    private long count;

    /**
     * Constructs a HashModel object with the given list of students.
     *
     * @param studList the list of students to initialize the model with
     */
    public HashModel(List<Student> studList) {
        count = 1;
        for (Student stud : studList) {
            students.put(count, stud);
            count++;
        }
    }

    /**
     * Retrieves a list of all students in the model.
     *
     * @return the list of students
     */
    public List<Student> getAll() {
        return new ArrayList<Student>(students.values());
    }

    /**
     * Retrieves the internal HashMap of students.
     *
     * @return the HashMap of students
     */
    public HashMap<Long, Student> getStudentsAsHashMap() {
        return students;
    }

     /**
     * Deletes a student with the specified ID from the model.
     *
     * @param id the ID of the student to delete
     * @return true if the student was successfully deleted, false otherwise
     */
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
