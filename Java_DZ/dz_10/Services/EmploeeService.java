package Java_DZ.dz_10.Services;

import java.util.ArrayList;
import java.util.List;
import Java_DZ.dz_10.Domen.Emploee;

/**
 * Сервисный класс для управления сотрудниками.
 */
public class EmploeeService implements iPersonService<Emploee> {
    private List<Emploee> emploees;

    
    public EmploeeService() {
        this.emploees = new ArrayList<>();
    }

    /**
     * Возвращает список всех сотрудников.
     * @return список сотрудников
     */
    @Override
    public List<Emploee> getAll() {
        return emploees;
    }

    /**
     * Создает нового сотрудника с указанными именем и возрастом.
     * @param firstName имя сотрудника
     * @param age возраст сотрудника
     */
    @Override
    public void create(String firstName, int age) {
        Emploee emploee = new Emploee(firstName, age, "", 0.0);
        emploees.add(emploee);
    }

    /**
     * Создает нового сотрудника с указанными именем, возрастом, специальностью и зарплатой.
     * @param firstName имя сотрудника
     * @param age возраст сотрудника
     * @param special специальность сотрудника
     * @param salary зарплата сотрудника
     */
    public void create(String firstName, int age, String special, double salary) {
        Emploee emploee = new Emploee(firstName, age, special, salary);
        emploees.add(emploee);
    }
}
