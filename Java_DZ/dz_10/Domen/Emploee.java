package Java_DZ.dz_10.Domen;

/**
 * Класс, представляющий сотрудника.
 */
public class Emploee extends Person {
    private String special;
    private double salary;

    /**
     * Создает нового сотрудника с указанными именем, возрастом, специальностью и зарплатой.
     * @param firstName имя сотрудника
     * @param age возраст сотрудника
     * @param special специальность сотрудника
     * @param salary зарплата сотрудника
     */
    public Emploee(String firstName, int age, String special, double salary) {
        super(firstName, age);
        this.special = special;
        this.salary = salary;
    }

    /**
     * Возвращает специальность сотрудника.
     * @return специальность сотрудника
     */
    public String getSpecial() {
        return special;
    }

    /**
     * Устанавливает специальность сотрудника.
     * @param special специальность сотрудника
     */
    public void setSpecial(String special) {
        this.special = special;
    }

    /**
     * Возвращает зарплату сотрудника.
     * @return зарплата сотрудника
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Устанавливает зарплату сотрудника.
     * @param salary зарплата сотрудника
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Возвращает строковое представление сотрудника.
     * @return строковое представление сотрудника
     */
    @Override
    public String toString() {
        return "Emploee [special=" + special + ", salary=" + salary + ", " + super.toString() + "]";
    }
}
