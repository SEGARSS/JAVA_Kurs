package Java_DZ.dz_10.Domen;

/**
 * Класс, представляющий учителя.
 */
public class Teacher extends Person {
    private String acadDegree;
    private double salary;

    /**
     * Создает нового учителя с указанными именем, возрастом, ученым званием и зарплатой.
     * @param firstName имя учителя
     * @param age возраст учителя
     * @param acadDegree ученое звание учителя
     * @param salary зарплата учителя
     */
    public Teacher(String firstName, int age, String acadDegree, double salary) {
        super(firstName, age);
        this.acadDegree = acadDegree;
        this.salary = salary;
    }

    /**
     * Возвращает ученое звание учителя.
     * @return ученое звание учителя
     */
    public String getAcadDegree() {
        return acadDegree;
    }

    /**
     * Устанавливает ученое звание учителя.
     * @param acadDegree ученое звание учителя
     */
    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }

    /**
     * Возвращает зарплату учителя.
     * @return зарплата учителя
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Устанавливает зарплату учителя.
     * @param salary зарплата учителя
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
