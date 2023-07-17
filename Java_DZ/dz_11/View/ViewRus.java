package Java_DZ.dz_11.View;

import java.util.List;
import java.util.Scanner;

import Java_DZ.dz_11.Controller.iGetView;
import Java_DZ.dz_11.Model.Student;

public class ViewRus implements iGetView {
    public void printAllSudents(List<Student> students) {
        System.out.println("=======Список студентов=======>");
        for (Student stud : students) {
            System.out.println(wordStudent() + ": [" + wordName() + " = " + stud.getName() + ", " + wordAge() + " = "
                    + stud.getAge() + ", ID = " + stud.getId() + "]");
        }
        System.out.println("==============================");
    }

    @Override
    public String prompt(String msg) {
        Scanner iScan = new Scanner(System.in);
        System.out.println(msg);
        return iScan.nextLine();
    }

    @Override
    public Long getStudentIdToDelete() {
        long id = Integer.parseInt(prompt("Введите ID студента для удаления: "));
        return id;
    }

    @Override
    public void displayStudent(String msg, Student stud) {
        System.out.println(msg + stud);
    }

    @Override
    public Student readStudent() {
        return null;
    }

    @Override
    public Long getStudentIdToUpdate() {
        long id = Integer.parseInt(prompt("Введите ID студента для изменения данных: "));
        return id;
    }

    @Override
    public String msgOnInvite() {
        return "Введите команду: ";
    }

    @Override
    public String msgEmptyStudentList() {
        return "Список студентов пуст!";
    }

    @Override
    public String msgOnExit() {
        return "Выполняется выход из приложения...";
    }

    @Override
    public String msgOnDelete(long id, boolean result) {
        if (result) {
            return "Студент с ID " + id + " успешно удален!";
        } else {
            return "Студент с ID " + id + " в базе данных НЕ найден!";
        }
    }

    @Override
    public String msgOnBadCommand() {
        return "Такой команды нет!";
    }

    @Override
    public String wordStudent() {
        return "Студент";
    }

    @Override
    public String wordName() {
        return "Имя";
    }

    @Override
    public String wordAge() {
        return "Возраст";
    }
}
