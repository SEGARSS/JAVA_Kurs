package Java_DZ.dz_09.Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс, представляющий группу студентов.
 */
public class StudentGroup implements Iterable<Student> {
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
        return new Iterator<Student>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < group.size();
            }

            @Override
            public Student next() {
                return group.get(counter++);
            }
        };
    }
}
