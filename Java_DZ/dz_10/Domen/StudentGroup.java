package Java_DZ.dz_10.Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс, представляющий группу студентов.
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;

    /**
     * Создает новую группу студентов с указанным списком студентов и идентификатором группы.
     * @param group список студентов
     * @param idGroup идентификатор группы
     */
    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    /**
     * Возвращает список студентов в группе.
     * @return список студентов
     */
    public List<Student> getGroup() {
        return group;
    }

    /**
     * Устанавливает список студентов в группе.
     * @param group список студентов
     */
    public void setGroup(List<Student> group) {
        this.group = group;
    }

    /**
     * Возвращает идентификатор группы.
     * @return идентификатор группы
     */
    public Integer getIdGroup() {
        return idGroup;
    }
    
    /**
     * Устанавливает идентификатор группы.
     * @param idGroup идентификатор группы
     */
    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    /**
     * Возвращает строковое представление группы студентов.
     *
     * @return строковое представление группы студентов
     */
    @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

    /**
     * Возвращает итератор для перебора студентов в группе.
     *
     * @return итератор студентов
     */
    @Override
    public Iterator<Student> iterator() {
        return group.iterator();
    }

    /**
     * Сравнивает текущую группу студентов с указанной группой студентов по размеру (количеству студентов).
     *
     * @param o группа студентов для сравнения
     * @return отрицательное число, ноль или положительное число в зависимости от результата сравнения
     */
    @Override
    public int compareTo(StudentGroup o) {
        return Integer.compare(group.size(), o.getGroup().size());
    }
}
