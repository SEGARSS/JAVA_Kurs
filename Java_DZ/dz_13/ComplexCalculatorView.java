package Java_DZ.dz_13;

import java.util.Scanner;

public class ComplexCalculatorView {
    private ComplexCalculator calculator;

    public ComplexCalculatorView(ComplexCalculator calculator) {
        this.calculator = calculator;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double real1 = promptDouble("Введите действительную часть первого комплексного числа: ");
            double imaginary1 = promptDouble("Введите мнимую часть первого комплексного числа: ");
            ComplexNumber num1 = new ComplexNumber(real1, imaginary1);

            double real2 = promptDouble("Введите действительную часть второго комплексного числа: ");
            double imaginary2 = promptDouble("Введите мнимую часть второго комплексного числа: ");
            ComplexNumber num2 = new ComplexNumber(real2, imaginary2);

            ComplexNumber result = calculator.add(num1, num2);
            System.out.println("Результат сложения: " + result);

            result = calculator.multiply(num1, num2);
            System.out.println("Результат умножения: " + result);

            result = calculator.divide(num1, num2);
            System.out.println("Результат деления: " + result);

            // Добавьте дополнительную логику для деления, если необходимо

            String cmd = prompt("Вы хоте продолжить (Y/N)? ");
            if (!cmd.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }

    private double promptDouble(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    private String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.next();
    }
}
