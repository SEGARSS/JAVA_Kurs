package Java_DZ.dz_08.Interfaces;

import java.util.List;

import Java_DZ.dz_08.Classes.Actor;

/**
 * Интерфейс iMarketBehaviour определяет поведение магазина.
 */
public interface iMarketBehaviour {
    /**
     * Принимает клиента в магазин.
     *
     * @param actor клиент
     */
    void acceptToMarket(iActorBehaviuor actor);

    /**
     * Освобождает клиентов из магазина.
     *
     * @param actors список клиентов
     */
    void releaseFromMarket(List<Actor> actors);

    /**
     * Обновляет состояние магазина.
     */
    void update();
}
