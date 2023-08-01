package Java_DZ.dz_15;

import Java_DZ.dz_15.calculator.Calculator;
import Java_DZ.dz_15.exceptions.DivisionByZeroException;
import Java_DZ.dz_15.exceptions.InvalidInputException;
import Java_DZ.dz_15.calculator.PowerCalculator;

import java.util.Scanner;


/**
 * Приведенный код представляет программу-калькулятор, 
 * которая запрашивает у пользователя два числа и выполняет операции 
 * сложения, вычитания, умножения, деления и возведения в степень. 
 * В программе используются собственные исключения 
 * для обработки ошибок при делении на ноль или некорректном вводе.
 * 
 * Программа использует принцип одного уровня абстракции, разбивая функциональность на различные классы с ясно
 * определенными задачами, что упрощает понимание и поддержку кода.
 * 
 * Версия: 1.0
 * Автор: Рябков Сергей
 * Дата: 01.08.2023 года.
 * 
 * <p>Основной класс: {@link main}</p>
 * Метод main в классе main представляет точку входа в программу. Он запрашивает у пользователя два числа и вызывает
 * методы калькулятора для выполнения операций. Если в процессе выполнения возникают ошибки, соответствующие
 * исключения перехватываются и выводится информативное сообщение об ошибке.
 * 
 * <p>Классы:Java_DZ.dz_15.calculator. Cодержит классы:
 * {@link Calculator} - Класс Calculator предоставляет статические методы для выполнения арифметических операций:
 * {@link PowerCalculator} - Класс PowerCalculator содержит один статический метод calculatePower(double base, int exponent), который
 * используется для возведения числа в степень. Если введено некорректное основание (ноль) и отрицательная степень,
 * метод выбрасывает исключение InvalidInputException.
 * 
 * <p>Классы:Java_DZ.dz_15.exceptions: Cодержит классы:
 * {@link DivisionByZeroException} - Класс DivisionByZeroException представляет пользовательское исключение, которое наследуется от класса Exception.
 * Оно используется для обработки ситуации деления на ноль.
 * {@link InvalidInputException} - Класс InvalidInputException также представляет пользовательское исключение, наследуется от класса Exception и
 * используется для обработки некорректного ввода.
 * */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
       

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt(); // Заменил на int, чтобы использовать как показатель степени

       

        try {
            double resultAdd = Calculator.add(num1, num2);
            double resultSubtract = Calculator.subtract(num1, num2);
            double resultMultiply = Calculator.multiply(num1, num2);
            double resultDivide = Calculator.divide(num1, num2);
            double resultPower = PowerCalculator.calculatePower(num1, num2); // Теперь используем num2 как показатель степени

            System.out.println("Результат сложения: " + resultAdd);
            System.out.println("Результат вычитания: " + resultSubtract);
            System.out.println("Результат умножения: " + resultMultiply);
            System.out.println("Результат деления: " + resultDivide);
            System.out.println("Результат возведения в степень: " + resultPower);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }
}

