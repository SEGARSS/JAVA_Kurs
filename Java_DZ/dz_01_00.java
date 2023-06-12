package Java_DZ;
import java.util.Scanner;

public class dz_01_00 {
    public static void main(String[] args) {
        task0();
        task1();
        task2();
    }

    /*Вычислить сумма чисел от 1 до n.*/
    private static void task0(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        int sum = calculateSum(n);

        System.out.println("Сумма чисел от 1 до " + n + " равна: " + sum);
    }

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /*Вывести все простые числа от 1 до 1000.*/
    private static void task1(){
        System.out.println("Простые числа от 1 до 1000:");
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    /*Реализовать простой калькулятор.*/
    private static void task2(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result = calculate(num1, operator, num2);

        System.out.println("Результат: " + result);
    }

    public static double calculate(double num1, char operator, double num2) {
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return 0;
                }
                break;
            default:
                System.out.println("Ошибка: неверный оператор!");
                return 0;
        }

        return result;
    }
}

