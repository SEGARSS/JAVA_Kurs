package Java_DZ.dz_11.Model;

import java.util.ArrayList;
import java.util.List;

import Java_DZ.dz_11.Controller.iGetModel;

/**
 * Реализация интерфейса iGetModel для работы со списком студентов в памяти.
 */
public class ModelList implements iGetModel {
    private List<Student> students = new ArrayList<>();

    /**
     * Конструктор объекта ModelList с указанием списка студентов.
     *
     * @param students список студентов
     */
    public ModelList(List<Student> students) {
        this.students = students;
    }

    /**
     * Получает список всех студентов.
     *
     * @return список студентов
     */
    public List<Student> getAll() {
        return students;
    }

    /**
     * Удаляет студента с указанным ID из списка студентов.
     *
     * @param id ID студента для удаления
     * @return true, если студент успешно удален, false в противном случае
     */
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
