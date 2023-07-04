package Java_DZ.dz_08.Classes;

import Java_DZ.dz_08.Interfaces.iActorBehaviuor;

/**
 * Класс Actor представляет актера (клиента).
 */
public abstract class Actor implements iActorBehaviuor {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    /**
     * Конструктор класса Actor.
     *
     * @param name имя актера
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Получить имя актера.
     *
     * @return имя актера
     */
    abstract public String getName();

    /**
     * Проверить, может ли актер принимать заказы.
     *
     * @return true, если актер может принимать заказы, иначе false
     */
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Проверить, может ли актер создавать заказы.
     *
     * @return true, если актер может создавать заказы, иначе false
     */
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * Установить возможность актеру принимать заказы.
     *
     * @param takeOrder true, чтобы разрешить актеру принимать заказы, иначе false
     */
    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }

    /**
     * Установить возможность актеру создавать заказы.
     *
     * @param makeOrder true, чтобы разрешить актеру создавать заказы, иначе false
     */
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }
}
