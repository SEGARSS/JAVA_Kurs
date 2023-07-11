package Java_DZ.dz_10.Controllers;

import Java_DZ.dz_10.Domen.Person;

/**
 * Обобщенный интерфейс-контроллер для управления объектами типа T.
 * @param <T> тип объекта
 */
public interface iPersonController<T extends Person> {
    /**
     * Создает новый объект типа T с указанными именем и возрастом.
     * @param firstName имя объекта
     * @param age возраст объекта
     */
    void create(String firstName, int age);
}
