package Java_DZ.dz_13;

/**
 * Базовый калькулятор комплексных чисел, реализующий интерфейс ComplexCalculator.
 * Предоставляет методы для выполнения арифметических операций с комплексными числами.
 */
public class BasicComplexCalculator implements ComplexCalculator {
    /**
     * Выполняет сложение двух комплексных чисел.
     *
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат сложения комплексных чисел.
     */
    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getReal() + num2.getReal();
        double imaginaryPart = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber(realPart, imaginaryPart);
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
        double realPart = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginaryPart = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    /**
     * Выполняет деление двух комплексных чисел.
     * Деление комплексных чисел не реализовано в базовом калькуляторе.
     *
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат деления комплексных чисел.
     * @throws UnsupportedOperationException Если метод не поддерживается.
     */
    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        // Деление комплексных чисел не реализовано в базовом калькуляторе
        throw new UnsupportedOperationException("Деление не поддерживается в BasicComplexCalculator");
    }
}
