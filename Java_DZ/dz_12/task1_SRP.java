package Java_DZ.dz_12;

/*Здача №1.
Переписать код в соответствии с Single Responsibility Principle:

public class Employee {
private String name;
private Date dob;
private int baseSalary;
public Employee(String name, Date dob, int baseSalary) {
this.name = name;
this.dob = dob;
this.baseSalary = baseSalary;
}
public String getEmpInfo() {
return "name - " + name + " , dob - " + dob.toString();
}
public int calculateNetSalary() {
int tax = (int) (baseSalary * 0.25);//calculate in otherway
return baseSalary - tax;
}
}
​
Подсказка: вынесите метод calculateNetSalary() в отдельный класс */

import java.util.Date;

/**
 * и класс task1_SRP содержит основной метод для тестирования и точкой входа.
 */
public class task1_SRP {
    public static void main(String[] args) {
        Employee employee = new Employee("Андрей Голиков", new Date(), 50000);
        SalaryCalculator calculator = new SalaryCalculator(employee.getBaseSalary());

        System.out.println("Информация о сотрудниках: " + employee.getEmpInfo());
        System.out.println("Чистая заработная плата: " + calculator.calculateNetSalary());
    }
}

/**
 * В данном примере класс Employee отвечает только за хранение информации о сотруднике.
 */
class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "Имя - " + name + " , Дата рождения - " + dob.toString();
    }

    public int getBaseSalary() {
        return baseSalary;
    }

}

/**
 * класс SalaryCalculator отвечает только за расчет чистой заработной платы.
 */
class SalaryCalculator {
    private int baseSalary;

    public SalaryCalculator(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25); // Расчет налога (можно изменить на другую логику расчета)
        return baseSalary - tax;
    }
}
