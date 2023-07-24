package Java_DZ.dz_13;

public class BasicComplexCalculator implements ComplexCalculator {
    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getReal() + num2.getReal();
        double imaginaryPart = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginaryPart = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        // Деление комплексных чисел не реализовано в базовом калькуляторе
        throw new UnsupportedOperationException("Деление не потдерживаеться в BasicComplexCalculator");
    }
}
