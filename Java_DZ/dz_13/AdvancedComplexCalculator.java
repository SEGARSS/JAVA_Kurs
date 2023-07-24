package Java_DZ.dz_13;

/**
 * Расширенный калькулятор комплексных чисел, который наследуется от BasicComplexCalculator.
 * Включает логирование операций с комплексными числами.
 */
public class AdvancedComplexCalculator extends BasicComplexCalculator {
    private Logger logger;

    /**
     * Конструктор класса AdvancedComplexCalculator.
     *
     * @param logger Логгер для записи операций с комплексными числами.
     */
    public AdvancedComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    /**
     * Выполняет сложение двух комплексных чисел.
     *
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат сложения комплексных чисел.
     */
    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = super.add(num1, num2);
        logger.log(String.format("Сложение: %s + %s = %s", num1, num2, result));
        return result;
    }

    /**
     * Выполняет умножение двух комплексных чисел.
     *
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат умножения комплексных чисел.
     */
    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = super.multiply(num1, num2);
        logger.log(String.format("Умножение: %s * %s = %s", num1, num2, result));
        return result;
    }

    /**
     * Выполняет деление двух комплексных чисел.
     * Добавьте реализацию деления, если требуется.
     *
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат деления комплексных чисел.
     */
    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = new ComplexNumber(0, 0); // Добавьте реализацию деления, если требуется
        logger.log(String.format("Деление: %s / %s = %s", num1, num2, result));
        return result;
    }
}
