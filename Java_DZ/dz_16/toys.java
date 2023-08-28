package Java_DZ.dz_16;

/**
 * Класс, представляющий игрушку.
 */
public class toys {
    private int id;         // Уникальный идентификатор игрушки
    private String name;    // Название игрушки
    private int frequency;  // Частота выпадения игрушки

    /**
     * Конструктор класса игрушки.
     *
     * @param id        уникальный идентификатор игрушки
     * @param name      название игрушки
     * @param frequency частота выпадения игрушки
     */
    public toys(int id, String name, int frequency) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }

    /**
     * Метод для получения уникального идентификатора игрушки.
     *
     * @return уникальный идентификатор игрушки
     */
    public int getId() {
        return id;
    }

    /**
     * Метод для получения названия игрушки.
     *
     * @return название игрушки
     */
    public String getName() {
        return name;
    }

    /**
     * Метод для получения частоты выпадения игрушки.
     *
     * @return частота выпадения игрушки
     */
    public int getFrequency() {
        return frequency;
    }
}

