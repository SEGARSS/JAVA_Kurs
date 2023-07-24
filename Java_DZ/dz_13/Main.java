package Java_DZ.dz_13;
//
public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        AdvancedComplexCalculator calculator = new AdvancedComplexCalculator(logger);

        ComplexCalculatorView view = new ComplexCalculatorView(calculator);
        view.run();
    }
}
