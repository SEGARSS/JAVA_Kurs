package Java_DZ.dz_09.Domen;

/**
 * Абстрактный класс, представляющий человека.
 */
public abstract class Person {
    private String name;
    private int age;

    /**
     * Конструктор, создающий новый объект Person с заданными именем и возрастом.
     * @param name имя человека
     * @param age возраст человека
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Возвращает имя человека.
     * @return имя человека
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя человека.
     * @param name имя человека
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает возраст человека.
     * @return возраст человека
     */
    public int getAge() {
        return age;
    }

    /**
     * Устанавливает возраст человека.
     * @param age возраст человека
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Возвращает строковое представление объекта Person.
     * @return строковое представление объекта Person
     */
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
