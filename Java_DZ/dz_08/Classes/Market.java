package Java_DZ.dz_08.Classes;

import java.util.List;
import java.util.ArrayList;

import Java_DZ.dz_08.Interfaces.iActorBehaviuor;
import Java_DZ.dz_08.Interfaces.iMarketBehaviour;
import Java_DZ.dz_08.Interfaces.iQueueBehaviour;

/**
 * Класс Market представляет магазин и реализует интерфейсы iMarketBehaviour и iQueueBehaviour.
 */
public class Market implements iMarketBehaviour,iQueueBehaviour {

    private List<iActorBehaviuor> queue;

    /**
     * Конструктор класса Market.
     * Инициализирует список очереди.
     */
    public Market() {
        this.queue = new ArrayList<>();
    }

    /**
     * Принимает клиента в магазин.
     *
     * @param actor клиент
     */
    @Override
    public void acceptToMarket(iActorBehaviuor actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * Принимает клиента в очередь.
     *
     * @param actor клиент
     */
    @Override
    public void takeInQueue(iActorBehaviuor actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    /**
     * Освобождает клиентов из магазина.
     *
     * @param actors список клиентов
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    /**
     * Обновляет состояние магазина.
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /**
     * Выполняет выдачу заказов клиентам.
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviuor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    /**
     * Освобождает клиентов из очереди.
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviuor actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    /**
     * Принимает заказ от клиентов в очереди.
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviuor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
            }
        }
    }
}
