package Java_DZ.dz_08.Classes;

import Java_DZ.dz_08.Interfaces.iReturnOrder;

/**
 * Класс OrdinaryClient представляет обычного клиента и реализует интерфейс iActorBehaviuor.
 */
public class OrdinaryClient extends Actor implements iReturnOrder {
    public OrdinaryClient(String name) {
        super(name);
    }

    /**
     * Возвращает имя клиента.
     *
     * @return имя клиента
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Проверяет, взял ли клиент заказ.
     *
     * @return true, если клиент взял заказ, иначе false
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Проверяет, сделал ли клиент заказ.
     *
     * @return true, если клиент сделал заказ, иначе false
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Устанавливает статус взятия заказа клиентом.
     *
     * @param takeOrder true, если клиент взял заказ, иначе false
     */
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    /**
     * Устанавливает статус сделанного заказа клиента.
     *
     * @param makeOrder true, если клиент сделал заказ, иначе false
     */
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /**
     * Возвращает объект клиента.
     *
     * @return объект клиента
     */
    public Actor getActor() {
        return this;
    }

    /**
     * Возвращает заказ клиента.
     *
     * @param actor клиент, возвращающий заказ
     */
    @Override
    public void returnOrder(Actor actor) {
        System.out.println(actor.getName() + " клиент вернул свой заказ ");
    }
}
