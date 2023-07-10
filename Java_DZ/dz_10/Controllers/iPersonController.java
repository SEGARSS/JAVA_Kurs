package Java_DZ.dz_10.Controllers;

import Java_DZ.dz_10.Domen.Person;

public interface iPersonController<T extends Person> {
    void create(String firstName, int age);
}
