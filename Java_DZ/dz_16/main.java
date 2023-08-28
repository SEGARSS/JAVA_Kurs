package Java_DZ.dz_16;

import Java_DZ.dz_16.toys;
import Java_DZ.dz_16.exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        PriorityQueue<toys> toyQueue = new PriorityQueue<>(Comparator.comparingInt(toys::getFrequency));
        try {
            toyQueue.add(new toys(1, "конструктор", 2));
            toyQueue.add(new toys(2, "робот", 2));
            toyQueue.add(new toys(3, "кукла", 6));
            toyQueue.add(new toys(4, "мяч", 5));

            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Obuchenie\\JAVA_Kurs\\Java_DZ\\dz_16\\toys.txt"));
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                int rand = random.nextInt(10);
                toys selectedToy;
                if (rand < 2) {
                    selectedToy = toyQueue.peek();
                } else if (rand < 4) {
                    selectedToy = getToyWithId(toyQueue, 1);
                } else if (rand < 6) {
                    selectedToy = getToyWithId(toyQueue, 2);
                } else {
                    selectedToy = getToyWithId(toyQueue, 3);
                }

                if (selectedToy != null) {
                    writer.write("Выбрана игрушка: " + selectedToy.getName());
                    writer.newLine();
                }
            }
            writer.close();
        } catch (IOException | exceptions e) {
            e.printStackTrace();
        }
    }

    private static toys getToyWithId(PriorityQueue<toys> toys, int id) throws exceptions {
        toys selectedToy = toys.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);

        if (selectedToy == null) {
            throw new exceptions("Некорректный ID игрушки: " + id);
        }

        return selectedToy;
    }
}

