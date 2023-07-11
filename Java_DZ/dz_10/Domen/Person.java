package Java_DZ.dz_10.Domen;

/**
 * Абстрактный класс, представляющий персону.
 */
public abstract class Person {
    private String name;
    private int age;

    /**
     * Создает новую персону с указанными именем и возрастом.
     * @param name имя персоны
     * @param age возраст персоны
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Возвращает имя персоны.
     * @return имя персоны
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя персоны.
     * @param name имя персоны
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает возраст персоны.
     * @return возраст персоны
     */
    public int getAge() {
        return age;
    }

    /**
     * Устанавливает возраст персоны.
     * @param age возраст персоны
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Возвращает строковое представление персоны.
     *
     * @return строковое представление персоны
     */
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
