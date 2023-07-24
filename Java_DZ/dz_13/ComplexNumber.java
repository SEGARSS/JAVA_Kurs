package Java_DZ.dz_13;

/**
 * Класс для представления комплексных чисел.
 */
public class ComplexNumber {
    private double real;
    private double imaginary;

    /**
     * Конструктор класса ComplexNumber.
     *
     * @param real      Действительная часть комплексного числа.
     * @param imaginary Мнимая часть комплексного числа.
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Получить действительную часть комплексного числа.
     *
     * @return Действительная часть комплексного числа.
     */
    public double getReal() {
        return real;
    }

    /**
     * Установить действительную часть комплексного числа.
     *
     * @param real Действительная часть комплексного числа.
     */
    public void setReal(double real) {
        this.real = real;
    }

    /**
     * Получить мнимую часть комплексного числа.
     *
     * @return Мнимая часть комплексного числа.
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * Установить мнимую часть комплексного числа.
     *
     * @param imaginary Мнимая часть комплексного числа.
     */
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    /**
     * Переопределение метода toString() для удобного вывода комплексного числа.
     *
     * @return Строковое представление комплексного числа.
     */
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return String.format("%.2f + %.2fi", real, imaginary);
        } else {
            return String.format("%.2f - %.2fi", real, -imaginary);
        }
    }
}
