package Java_DZ.dz_08.Interfaces;


/**
 * Интерфейс iQueueBehaviour определяет поведение очереди.
 */
public interface iQueueBehaviour {
    /**
     * Принимает клиента в очередь.
     *
     * @param actor клиент
     */
    void takeInQueue(iActorBehaviuor actor);

    /**
     * Освобождает клиентов из очереди.
     */
    void releaseFromQueue();

    /**
     * Принимает заказ от клиентов в очереди.
     */
    void takeOrder();

    /**
     * Выполняет выдачу заказов клиентам.
     */
    void giveOrder();
}
