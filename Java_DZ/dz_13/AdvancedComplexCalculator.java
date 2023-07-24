package Java_DZ.dz_13;

public class AdvancedComplexCalculator extends BasicComplexCalculator {
    private Logger logger;

    public AdvancedComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = super.add(num1, num2);
        logger.log(String.format("Сложение: %s + %s = %s", num1, num2, result));
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = super.multiply(num1, num2);
        logger.log(String.format("Умножение: %s * %s = %s", num1, num2, result));
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = new ComplexNumber(0, 0); // Добавьте реализацию деления, если требуется
        logger.log(String.format("Деление: %s / %s = %s", num1, num2, result));
        return result;
    }
}
