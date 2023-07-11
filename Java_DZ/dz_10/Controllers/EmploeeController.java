package Java_DZ.dz_10.Controllers;

import Java_DZ.dz_10.Domen.Emploee;
import Java_DZ.dz_10.Services.EmploeeService;

/**
 * Класс-контроллер для управления сотрудниками.
 */
public class EmploeeController implements iPersonController<Emploee> {
    private final EmploeeService empService = new EmploeeService();

    /**
     * Создает нового сотрудника с указанными именем и возрастом.
     * @param firstName имя сотрудника
     * @param age возраст сотрудника
     */
    @Override
    public void create(String firstName, int age) {
        empService.create(firstName, age);
    }

    /**
     * Выплачивает зарплату сотруднику.
     * @param person сотрудник
     * @param <T> тип сотрудника
     */
    public static <T extends Emploee> void paySalary(T person) {
        System.out.println(person.getName() + " (Должность: " + person.getSpecial() + ") выплачена зарплата 10000р.");
    }
}
