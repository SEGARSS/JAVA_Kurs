package Java_DZ.dz_13;

/**
 * Интерфейс для калькулятора комплексных чисел.
 * Определяет методы для выполнения арифметических операций с комплексными числами.
 */
public interface ComplexCalculator {
    /**
     * Выполняет сложение двух комплексных чисел.
     *
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат сложения комплексных чисел.
     */
    ComplexNumber add(ComplexNumber num1, ComplexNumber num2);

    /**
     * Выполняет умножение двух комплексных чисел.
     *
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат умножения комплексных чисел.
     */
    ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2);

    /**
     * Выполняет деление двух комплексных чисел.
     *
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат деления комплексных чисел.
     * @throws UnsupportedOperationException Если метод не поддерживается.
     */
    ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) throws UnsupportedOperationException;
}
