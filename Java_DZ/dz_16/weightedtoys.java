package Java_DZ.dz_16;

import Java_DZ.dz_16.toys;

/**
 * Класс, представляющий игрушку с весом.
 */
public class weightedtoys extends toys {
    private int weight;

    /**
     * Конструктор класса игрушки с весом.
     *
     * @param id        уникальный идентификатор игрушки
     * @param name      название игрушки
     * @param frequency частота выпадения игрушки
     * @param weight    вес игрушки
     */
    public weightedtoys(int id, String name, int frequency, int weight) {
        super(id, name, frequency);
        this.weight = weight;
    }

     /**
     * Метод для получения веса игрушки.
     *
     * @return вес игрушки
     */
    public int getWeight() {
        return weight;
    }
}
