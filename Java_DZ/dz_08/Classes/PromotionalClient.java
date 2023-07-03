package Java_DZ.dz_08.Classes;

/**
 * Класс PromotionalClient представляет клиента с акцией и наследуется от класса Actor.
 */
public class PromotionalClient extends Actor {
    private String promotionName;
    private int clientId;
    private static int participantsCount;

    /**
     * Конструктор класса PromotionalClient.
     *
     * @param name          имя клиента
     * @param promotionName название акции
     * @param clientId      идентификатор клиента
     */
    public PromotionalClient(String name, String promotionName, int clientId) {
        super(name);
        this.promotionName = promotionName;
        this.clientId = clientId;
        participantsCount++;
    }

    /**
     * Возвращает название акции.
     *
     * @return название акции
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * Возвращает идентификатор клиента.
     *
     * @return идентификатор клиента
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * Возвращает количество участников акции.
     *
     * @return количество участников акции
     */
    public static int getParticipantsCount() {
        return participantsCount;
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
