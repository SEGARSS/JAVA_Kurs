package Java_DZ.dz_10.Domen;

/**
 * Класс, представляющий студента.
 */
public class Student extends Person implements Comparable<Student> {
    private int id;

    /**
     * Создает нового студента с указанными именем, возрастом и идентификатором.
     * @param name имя студента
     * @param age возраст студента
     * @param id идентификатор студента
     */
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    /**
     * Возвращает идентификатор студента.
     * @return идентификатор студента
     */
    public int getId() {
        return id;
    }

    /**
     * Устанавливает идентификатор студента.
     * @param id идентификатор студента
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Возвращает строковое представление студента.
     *
     * @return строковое представление студента
     */
    @Override
    public String toString() {
        return "Student [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }


    /**
     * Сравнивает текущего студента с указанным студентом по возрасту и идентификатору.
     *
     * @param o студент для сравнения
     * @return отрицательное число, ноль или положительное число в зависимости от результата сравнения
     */
    @Override
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge()) {
            if (id == o.id) return 0;
            if (id > o.id) return 1;
            else return -1;
        }
        if (super.getAge() > o.getAge())
            return 1;
        else
            return -1;
    }
}
