package Java_DZ.dz_15.calculator;

import Java_DZ.dz_15.exceptions.InvalidInputException;

/**
 * Класс PowerCalculator предоставляет статический метод calculatePower() для выполнения операции возведения числа в степень.
 */
public class PowerCalculator {

    /**
     * Выполняет операцию возведения числа в степень.
     *
     * @param base     Основание степени.
     * @param exponent Показатель степени.
     * @return Результат возведения числа base в степень exponent.
     * @throws InvalidInputException Если base равно нулю и exponent отрицательно.
     */
    public static double calculatePower(double base, int exponent) throws InvalidInputException {
        if (base == 0 && exponent < 0) {
            throw new InvalidInputException("Некорректные числа. Основание не может быть нулем при отрицательной степени.");
        }

        return Math.pow(base, exponent);
    }
}
