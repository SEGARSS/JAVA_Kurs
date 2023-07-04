package Java_DZ.dz_08.Interfaces;

import Java_DZ.dz_08.Classes.Actor;

/**
 * Интерфейс iActorBehaviuor определяет поведение актера.
 */
public interface iActorBehaviuor {
    /**
     * Проверяет, взял ли актер заказ.
     *
     * @return true, если актер взял заказ, иначе false
     */
    boolean isTakeOrder();

    /**
     * Проверяет, сделал ли актер заказ.
     *
     * @return true, если актер сделал заказ, иначе false
     */
    boolean isMakeOrder();

    /**
     * Устанавливает статус взятия заказа актером.
     *
     * @param takeOrder true, если актер взял заказ, иначе false
     */
    void setTakeOrder(boolean takeOrder);

    /**
     * Устанавливает статус выполнения заказа актером.
     *
     * @param makeOrder true, если актер сделал заказ, иначе false
     */
    void setMakeOrder(boolean makeOrder);

    /**
     * Возвращает объект актера.
     *
     * @return объект актера
     */
    Actor getActor();
    
}
