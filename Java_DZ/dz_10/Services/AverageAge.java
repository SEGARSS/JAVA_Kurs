package Java_DZ.dz_10.Services;

import Java_DZ.dz_10.Domen.Person;

import java.util.List;

public class AverageAge<T extends Person> {
    public double calculateAverageAge(List<T> persons) {
        int totalAge = 0;
        for (T person : persons) {
            totalAge += person.getAge();
        }
        return (double) totalAge / persons.size();
    }
}
