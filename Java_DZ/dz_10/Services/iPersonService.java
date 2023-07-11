package Java_DZ.dz_10.Services;

import java.util.List;

/**
 * Интерфейс сервисного класса для управления объектами типа T.
 * @param <T> тип объекта
 */
public interface iPersonService<T> {
    
    /**
     * Возвращает список всех объектов типа T.
     * @return список объектов
     */
    List<T> getAll();

     /**
     * Создает новый объект типа T с указанными именем и возрастом.
     * @param firstName имя объекта
     * @param age возраст объекта
     */
    void create(String firstName, int age);
}
