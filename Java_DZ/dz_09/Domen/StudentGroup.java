package Java_DZ.dz_09.Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс, представляющий группу студентов.
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;

    /**
     * Конструктор, создающий новый объект StudentGroup с заданной группой студентов и идентификатором группы.
     * @param group группа студентов
     * @param idGroup идентификатор группы
     */
    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    /**
     * Возвращает группу студентов.
     * @return группа студентов
     */
    public List<Student> getGroup() {
        return group;
    }

    /**
     * Устанавливает группу студентов.
     * @param group группа студентов
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
     * Возвращает строковое представление объекта StudentGroup.
     * @return строковое представление объекта StudentGroup
     */
    @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

    /**
     * Возвращает итератор для итерации по студентам в группе.
     * @return итератор для итерации по студентам в группе
     */
    @Override
    public Iterator<Student> iterator() {
        return group.iterator();
    }

    /**
     * Сравнивает текущую группу студентов с другой группой студентов по количеству студентов в группе.
     * @param o группа студентов для сравнения
     * @return отрицательное число, если текущая группа меньше; 0, если группы равны; положительное число, если текущая группа больше
     */
    @Override
    public int compareTo(StudentGroup o) {
        return Integer.compare(group.size(), o.getGroup().size());
    }
}
