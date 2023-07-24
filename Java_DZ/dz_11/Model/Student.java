package Java_DZ.dz_11.Model;

/**
 * Класс Student, представляющий студента с именем, возрастом и идентификатором.
 */
public class Student extends Person implements Comparable<Student> {

    private int id;

    /**
     * Конструктор объекта Student с указанием имени, возраста и идентификатора.
     *
     * @param name имя студента
     * @param age  возраст студента
     * @param id   идентификатор студента
     */
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    /**
     * Получает идентификатор студента.
     *
     * @return идентификатор студента
     */
    public int getId() {
        return id;
    }

    /**
     * Устанавливает идентификатор студента.
     *
     * @param id идентификатор студента
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Возвращает строковое представление объекта Student.
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "Student [age = " + super.getAge() + ", name = " + super.getName() + ", id = " + id + "]";
    }

    /**
     * Сравнивает текущего студента с другим студентом по возрасту и идентификатору.
     *
     * @param o другой студент для сравнения
     * @return отрицательное целое число, ноль или положительное целое число в зависимости от результата сравнения
     */
    @Override
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge()) {
            if (id == o.id) {
                return 0;
            } else {
                if (id > o.id) {
                    return 1;
                } else {
                    return -1;
                }
            }
        } else {
            if (super.getAge() > o.getAge()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
