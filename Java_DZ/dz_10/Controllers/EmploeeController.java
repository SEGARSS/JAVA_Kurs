package Java_DZ.dz_10.Controllers;

import Java_DZ.dz_10.Domen.Emploee;
import Java_DZ.dz_10.Services.EmploeeService;

public class EmploeeController implements iPersonController<Emploee> {
    private final EmploeeService empService = new EmploeeService();

    @Override
    public void create(String firstName, int age) {
        empService.create(firstName, age);
    }

    public static <T extends Emploee> void paySalary(T person) {
        System.out.println(person.getName() + " выплачена зарплата 10000р. ");
    }
}
