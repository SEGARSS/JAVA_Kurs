package Java_DZ.dz_11.Model;

/**
 * Абстрактный класс Person, представляющий человека с именем и возрастом.
 */
public abstract class Person {
    private String name;
    private int age;
    
    /**
     * Конструктор объекта Person с указанием имени и возраста.
     *
     * @param name имя человека
     * @param age  возраст человека
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    /**
     * Получает имя человека.
     *
     * @return имя человека
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя человека.
     *
     * @param name имя человека
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получает возраст человека.
     *
     * @return возраст человека
     */
    public int getAge() {
        return age;
    }

    /**
     * Устанавливает возраст человека.
     *
     * @param age возраст человека
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Возвращает строковое представление объекта Person.
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "Person [name = " + name + ", age = " + age + "]";
    }
}
