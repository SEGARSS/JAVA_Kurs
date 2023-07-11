package Java_DZ.dz_10.Domen;

import java.util.Comparator;

/**
 * Компаратор для сравнения объектов типа T, наследующих Person, по имени и возрасту.
 * @param <T> тип объекта, наследующего Person
 */
public class PersonComparator<T extends Person> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int res = o1.getName().compareTo(o2.getName());
        if (res == 0) {
            if (o1.getAge() == o2.getAge()) {
                return 0;
            } else {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        } else {
            return res;
        }
    }
}
