package Java_DZ.dz_13;

/**
 * Проект калькулятора комплексных чисел.
 * 
 * Версия: 1.0
 * Автор: Рябков Сергей
 * Дата: 24.07.2023 года.
 * 
 * <p>Основной класс: {@link main}</p>
 * Основной класс программы, содержит метод main, который является точкой входа в программу. 
 * В нем создаются объекты и демонстрируется функциональность системы.
 *  
 * <p>Классы:Java_DZ.dz_13.
 * {@link AdvancedComplexCalculator} - Класс наследует от BasicComplexCalculator и добавляет реализацию для операции деления комплексных чисел.
 * Также, класс содержит объект Logger для логирования операций сложения, умножения и деления.
 * {@link BasicComplexCalculator} - Класс реализует интерфейс ComplexCalculator и предоставляет базовую функциональность для выполнения операций
 * сложения и умножения комплексных чисел.
 * {@link ComplexCalculator} - нтерфейс определяет методы для выполнения операций сложения, умножения и деления комплексных чисел.
 * Включает методы add, multiply и divide, которые принимают два комплексных числа и возвращают результат.
 * {@link ComplexCalculatorView} - Класс представляет интерфейс для взаимодействия с пользователем через командную строку.
 * Включает метод run(), который предоставляет пользователю возможность вводить значения для двух комплексных чисел
 * и выполнять операции сложения, умножения и деления с помощью объекта AdvancedComplexCalculator.
 * После выполнения операций пользователю предлагается повторить вычисления или завершить программу.
 * {@link ComplexNumber} - Класс представляет комплексное число в виде суммы действительной и мнимой частей.
 * Включает конструктор для инициализации числа и переопределенный метод toString() для удобного вывода.
 * Также содержит геттеры для получения значения действительной и мнимой частей.
 * {@link Logger} -Класс представляет собой простой логгер, который выводит логи в стандартный поток вывода.
 * 
 * В проекте применены следующие паттерны проектирования:
 * - Декоратор (CalcDecorator) - для добавления логирования калькулятора.
 * - Стратегия (ComplexCalculator, BasicComplexCalculator, AdvancedComplexCalculator) - для различных реализаций
 *   операций сложения, умножения и деления комплексных чисел.
 *
 * Программа обладает расширяемостью и гибкостью, позволяя легко добавлять новые реализации операций или изменять
 * поведение калькулятора без изменения других частей кода.
 */
public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        AdvancedComplexCalculator calculator = new AdvancedComplexCalculator(logger);

        ComplexCalculatorView view = new ComplexCalculatorView(calculator);
        view.run();
    }
}
