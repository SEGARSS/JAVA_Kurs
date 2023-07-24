package Java_DZ.dz_11.Controller;

import java.util.List;

import Java_DZ.dz_11.Model.Student;

/**
 * Интерфейс iGetModel представляет модель данных для работы с информацией о студентах.
 */
public interface iGetModel {

    /**
     * Возвращает список всех студентов.
     *
     * @return список всех студентов
     */
    public List<Student> getAll();

    /**
     * Удаляет студента по указанному идентификатору.
     *
     * @param id идентификатор студента
     * @return true, если студент успешно удален; false, если студент не найден
     */
    public boolean deleteStudent(long id);
}
