package Java_DZ.dz_08.Classes;

/**
 * Класс SpecialClient представляет специального клиента и наследуется от класса Actor.
 */
public class SpecialClient extends Actor{
    /**
     * Конструктор класса SpecialClient.
     *
     * @param name имя клиента
     * @param id   идентификатор клиента
     */
    public SpecialClient(String name, Integer id) {
        super(name);
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
     * @param makeOrder true, если актер взял заказ, иначе false
     */
    public void setTakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /**
     * Устанавливает статус выполнения заказа актером.
     *
     * @param pickUpOrder true, если актер сделал заказ, иначе false
     */
    public void setMakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
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
