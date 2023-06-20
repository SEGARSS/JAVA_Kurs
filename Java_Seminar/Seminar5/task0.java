package Java_Seminar.Seminar5;

/*Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task0 {
    public static void task0() {
        Map<String, ArrayList<String>> employeeMap = new HashMap<>();

        addEmployee(employeeMap, "Иванов", "123456");
        addEmployee(employeeMap, "Васильев", "321456");
        addEmployee(employeeMap, "Петрова", "234561");
        addEmployee(employeeMap, "Иванов", "234432");
        addEmployee(employeeMap, "Петрова", "654321");
        addEmployee(employeeMap, "Иванов", "345678");
        System.out.println(employeeMap);
        String targetLastName = "Иванов";
        List<String> passports = getPassportsByLastName(employeeMap, targetLastName);

        System.out.println("Сотрудники с фамилией " + targetLastName + ":");
        for (String passport : passports) {
            System.out.println(targetLastName + " " + passport);
        }
        
    }

    private static void addEmployee(Map<String, ArrayList<String>> employeeMap, String lastName, String passport) {
        ArrayList<String> passports = employeeMap.getOrDefault(lastName, new ArrayList<>());
        passports.add(passport);
        employeeMap.put(lastName, passports);
    }

    private static List<String> getPassportsByLastName(Map<String, ArrayList<String>> employeeMap, String lastName) {
        return employeeMap.getOrDefault(lastName, new ArrayList<>());
    }
}
