package Java_DZ.dz_08.Interfaces;

import Java_DZ.dz_08.Classes.Actor;

/**
 * Интерфейс iReturnOrder представляет метод возврата заказа.
 */
public interface iReturnOrder {
    /**
     * Возвращает заказ актеру.
     *
     * @param actor актер
     */
    void returnOrder(Actor actor);
}
