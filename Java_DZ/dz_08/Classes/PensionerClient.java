package Java_DZ.dz_08.Classes;

/**
 * Класс PensionerClient представляет пенсионного клиента и наследуется от класса Actor.
 */
public class PensionerClient extends Actor {
    /**
     * Конструктор класса PensionerClient.
     *
     * @param name   имя клиента
     * @param pensID код пенсионного клиента
     */
    public PensionerClient(String name, int pensID) {
        super(name + " - пенсионер");
    }

    /**
     * Возвращает имя актера.
     *
     * @return имя актера
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Проверяет, взял ли актер заказ.
     *
     * @return true, если актер взял заказ, иначе false
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Проверяет, сделал ли актер заказ.
     *
     * @return true, если актер сделал заказ, иначе false
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Устанавливает статус взятия заказа актером.
     *
     * @param makeOder true, если актер взял заказ, иначе false
     */
    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    /**
     * Устанавливает статус выполнения заказа актером.
     *
     * @param pikUpOrder true, если актер сделал заказ, иначе false
     */
    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    /**
     * Возвращает объект актера.
     *
     * @return объект актера
     */
    public Actor getActor() {
        return this;
    }

}
