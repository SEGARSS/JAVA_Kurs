package Java_DZ.dz_16;

import Java_DZ.dz_16.toys;
import Java_DZ.dz_16.exceptions;
import Java_DZ.dz_16.weightedtoys;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;


/**
 * Приведенный код представляет программу-для розыгрыша в магазине игрушек. Функционал
 * должен содержать добавление новых игрушек и задания веса для выпадения
 * игрушек.
 * 
 * <p>Принцип работы:
 * 1. Создается приоритетная очередь игрушек, учитывая их частоту выпадения.
 * 2. В цикле генерируются случайные числа для выбора игрушек.
 * 3. Выбор игрушек осуществляется в соответствии с их частотой и весом.
 * 4. Результаты выбора записываются в файл tous.txt.
 *  
 * Версия: 1.0
 * Автор: Рябков Сергей
 * Дата: 28.08.2023 года.
 * 
 * <p>Основной класс: {@link main}</p>
 * Метод main в классе main представляет точку входа в программу.
 * 
 * <p>Классы:Java_DZ.dz_16
 * {@link toys} - Класс, представляющий игрушку.
 * {@link exceptions} - Класс-исключение для обработки пользовательских исключений.
 * {@link weightedtoys} - Класс, представляющий информацию о весе игрушки.
 * */
public class main {

    /**
     * Главный метод программы, инициирующий выбор игрушек и запись результатов в файл.
     * Создает приоритетную очередь игрушек, моделирует выбор случайных игрушек и записывает результаты в файл.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
         // Инициализация приоритетной очереди игрушек
        PriorityQueue<weightedtoys> toyQueue = new PriorityQueue<>(Comparator.comparingInt(toys::getFrequency));
        try {
            // Добавление взвешенных игрушек в очередь
            toyQueue.add(new weightedtoys(1, "конструктор", 2, 10));
            toyQueue.add(new weightedtoys(2, "робот", 2, 15));
            toyQueue.add(new weightedtoys(3, "кукла", 6, 5));
            toyQueue.add(new weightedtoys(4, "мяч", 5, 8));
            // Открытие файла для записи результатов
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Obuchenie\\JAVA_Kurs\\Java_DZ\\dz_16\\toys.txt"));
            Random random = new Random();
            // Моделирование выбора игрушек и запись результатов в файл
            for (int i = 0; i < 10; i++) {
                int rand = random.nextInt(10);
                weightedtoys selectedToy;
                if (rand < 2) {
                    selectedToy = toyQueue.peek();
                } else if (rand < 4) {
                    selectedToy = getToyWithId(toyQueue, 1);
                } else if (rand < 6) {
                    selectedToy = getToyWithId(toyQueue, 2);
                } else {
                    selectedToy = getToyWithId(toyQueue, 3);
                }
                // Запись результатов в файл
                if (selectedToy != null) {
                    writer.write("Выбрана игрушка: " + selectedToy.getName() + ", вес: " + selectedToy.getWeight());
                    writer.newLine();
                }
            }
            // Закрытие файла
            writer.close();
        } catch (IOException | exceptions e) {
            e.printStackTrace();
        }
    }

    private static weightedtoys getToyWithId(PriorityQueue<weightedtoys> toys, int id) throws exceptions {
        weightedtoys selectedToy = toys.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);

        if (selectedToy == null) {
            throw new exceptions("Некорректный ID игрушки: " + id);
        }

        return selectedToy;
    }
}

