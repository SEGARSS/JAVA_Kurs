package Java_DZ.dz_13;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Геттеры и сеттеры (опущены для краткости)

    // Переопределение метода toString() для удобного вывода комплексного числа
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return String.format("%.2f + %.2fi", real, imaginary);
        } else {
            return String.format("%.2f - %.2fi", real, -imaginary);
        }
    }

    public int getReal() {
        return 0;
    }

    public int getImaginary() {
        return 0;
    }
}
