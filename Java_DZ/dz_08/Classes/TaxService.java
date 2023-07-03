package Java_DZ.dz_08.Classes;

import Java_DZ.dz_08.Interfaces.iActorBehaviuor;

/**
 * Класс TaxService представляет налоговую службу и реализует интерфейс iActorBehaviuor.
 */
public class TaxService implements iActorBehaviuor {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    /**
     * Конструктор класса TaxService.
     */
    public TaxService() {
        this.name = "Tax audit";
    }

    /**
     * Возвращает имя актера.
     *
     * @return имя актера
     */
    public String getName() {
        return name;
    }

    /**
     * Проверяет, сделал ли актер заказ.
     *
     * @return true, если актер сделал заказ, иначе false
     */
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * Проверяет, взял ли актер заказ.
     *
     * @return true, если актер взял заказ, иначе false
     */
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Устанавливает статус выполнения заказа актером.
     *
     * @param makeOrder true, если актер сделал заказ, иначе false
     */
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    /**
     * Устанавливает статус взятия заказа актером.
     *
     * @param pickUpOrder true, если актер взял заказ, иначе false
     */
    public void setTakeOrder(boolean pickUpOrder) {
        isTakeOrder = pickUpOrder;
    }

    /**
     * Возвращает объект актера.
     *
     * @return объект актера
     */
    public Actor getActor() {
        return new OrdinaryClient(name);
    }
}
