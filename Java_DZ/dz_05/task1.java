package Java_DZ.dz_05;

public class task1 {
    public static void task1() {
        int[] array = {9, 5, 2, 10, 1, 8, 3, 6, 4, 7};

        System.out.println("Исходный массив:");
        printArray(array);

        heapSort(array);

        System.out.println("Отсортированный массив:");
        printArray(array);
    }

    private static void heapSort(int[] array) {
        int n = array.length;

        // Построение Max-Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Извлечение элементов из Heap
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец массива
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Повторно вызываем heapify для уменьшения размера Heap
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int n, int i) {
        int largest = i;  // Инициализируем наибольший элемент как корень
        int left = 2 * i + 1;  // Левый потомок узла i
        int right = 2 * i + 2;  // Правый потомок узла i

        // Если левый потомок больше корня
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // Если правый потомок больше корня
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // Если наибольший элемент не корень
        if (largest != i) {
            // Меняем местами корень и наибольший элемент
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Рекурсивно применяем heapify к поддереву
            heapify(array, n, largest);
        }
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
