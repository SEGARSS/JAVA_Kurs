package Java_DZ.dz_09.Domen;

/**
 * Класс, представляющий студента.
 */
public class Student extends Person implements Comparable<Student> {
    private int id;

    /**
     * Конструктор, создающий новый объект Student с заданными именем, возрастом и идентификатором.
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
     * Возвращает строковое представление объекта Student.
     * @return строковое представление объекта Student
     */
    @Override
    public String toString() {
        return "Student [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }

    /**
     * Сравнивает текущего студента с другим студентом по возрасту и идентификатору.
     * @param o студент для сравнения
     * @return 0, если студенты равны; положительное число, если текущий студент больше; отрицательное число, если текущий студент меньше
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
