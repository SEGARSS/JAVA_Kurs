package Java_DZ.dz_10.Services;

import Java_DZ.dz_10.Domen.Emploee;

import java.util.ArrayList;
import java.util.List;

public class EmploeeService implements iPersonService<Emploee> {
    private List<Emploee> emploees;

    public EmploeeService() {
        this.emploees = new ArrayList<>();
    }

    @Override
    public List<Emploee> getAll() {
        return emploees;
    }

    @Override
    public void create(String firstName, int age) {
        Emploee emploee = new Emploee(firstName, age, "");
        emploees.add(emploee);
    }
}
