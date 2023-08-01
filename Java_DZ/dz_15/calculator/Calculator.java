package Java_DZ.dz_15.calculator;

import Java_DZ.dz_15.exceptions.DivisionByZeroException;
import Java_DZ.dz_15.exceptions.InvalidInputException;

/**
 * Класс Calculator предоставляет статические методы для выполнения математических операций:
 * сложение, вычитание, умножение, деление и возведение в степень.
 */
public class Calculator {

    /**
     * Выполняет операцию сложения двух чисел.
     *
     * @param num1 Первое число.
     * @param num2 Второе число.
     * @return Результат сложения num1 и num2.
     */
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Выполняет операцию вычитания двух чисел.
     *
     * @param num1 Уменьшаемое.
     * @param num2 Вычитаемое.
     * @return Результат вычитания num2 из num1.
     */
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Выполняет операцию умножения двух чисел.
     *
     * @param num1 Первый множитель.
     * @param num2 Второй множитель.
     * @return Результат умножения num1 на num2.
     */
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Выполняет операцию деления двух чисел.
     *
     * @param num1 Делимое.
     * @param num2 Делитель.
     * @return Результат деления num1 на num2.
     * @throws DivisionByZeroException Если num2 равно нулю.
     */
    public static double divide(double num1, double num2) throws DivisionByZeroException {
        if (num2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо.");
        }
        return num1 / num2;
    }

    /**
     * Выполняет операцию возведения числа в степень.
     *
     * @param base Основание степени.
     * @param exponent Показатель степени.
     * @return Результат возведения base в степень exponent.
     * @throws InvalidInputException Если base равно нулю и exponent отрицательно.
     */
    public static double power(double base, int exponent) throws InvalidInputException {
        if (base == 0 && exponent < 0) {
            throw new InvalidInputException("Некорректные числа. Основание не может быть нулем при отрицательной степени.");
        }
        return Math.pow(base, exponent);
    }
}
