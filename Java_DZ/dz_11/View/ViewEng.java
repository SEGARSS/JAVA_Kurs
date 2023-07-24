package Java_DZ.dz_11.View;

import java.util.List;
import java.util.Scanner;

import Java_DZ.dz_11.Controller.iGetView;
import Java_DZ.dz_11.Model.Student;

/**
 * Класс ViewEng, представляющий пользовательский интерфейс на английском языке.
 */
public class ViewEng implements iGetView {

    /**
     * Выводит список всех доступных команд.
     */
    public void printCommandList() {
        System.out.println("Command List:");
        System.out.println("READ - Read student information");
        System.out.println("CREATE - Create a new student");
        System.out.println("UPDATE - Update student information");
        System.out.println("LIST - Display a list of all students");
        System.out.println("DELETE - Delete a student");
        System.out.println("EXIT - Exit the program");
    }

    /**
     * Выводит список всех студентов.
     *
     * @param students список студентов
     */
    public void printAllStudents(List<Student> students) {
        System.out.println("=======List of students=======");
        for (Student student : students) {
            System.out.println("Student: [Name = " + student.getName() + ", Age = " + student.getAge() + ", ID = " + student.getId() + "]");
        }
        System.out.println("==============================");
    }

    /**
     * Просит пользователя ввести команду.
     *
     * @param msg сообщение для пользователя
     * @return введенная команда
     */
    public String prompt(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }

    /**
     * Получает идентификатор студента для удаления.
     *
     * @return идентификатор студента для удаления
     */
    public Long getStudentIdToDelete() {
        long id = Long.parseLong(prompt("Enter ID of the student to delete: "));
        return id;
    }

    /**
     * Выводит информацию о студенте.
     *
     * @param msg     сообщение для вывода
     * @param student студент
     */
    public void displayStudent(String msg, Student student) {
        System.out.println(msg + student);
    }

    /**
     * Считывает информацию о студенте.
     *
     * @return объект студента
     */
    public Student readStudent() {
        return null;
    }

    /**
     * Получает идентификатор студента для обновления.
     *
     * @return идентификатор студента для обновления
     */
    public Long getStudentIdToUpdate() {
        long id = Long.parseLong(prompt("Enter ID of the student to update: "));
        return id;
    }

    /**
     * Возвращает сообщение приглашение для ввода команды.
     *
     * @return сообщение приглашение
     */
    public String msgOnInvite() {
        return "Enter a new command: ";
    }

    /**
     * Возвращает сообщение о пустом списке студентов.
     *
     * @return сообщение о пустом списке студентов
     */
    public String msgEmptyStudentList() {
        return "The list of students is empty!";
    }

    /**
     * Возвращает сообщение о выходе из программы.
     *
     * @return сообщение о выходе
     */
    public String msgOnExit() {
        return "Exiting the application...";
    }

    /**
     * Возвращает сообщение об удалении студента.
     *
     * @param id     идентификатор студента
     * @param result результат удаления
     * @return сообщение об удалении студента
     */
    public String msgOnDelete(long id, boolean result) {
        if (result) {
            return "Student with ID " + id + " has been successfully deleted!";
        } else {
            return "Student with ID " + id + " was not found in the database!";
        }
    }

    /**
     * Возвращает сообщение об ошибочной команде.
     *
     * @return сообщение об ошибочной команде
     */
    public String msgOnBadCommand() {
        return "Invalid command!";
    }

    /**
     * Возвращает слово "Student".
     *
     * @return слово "Student"
     */
    public String wordStudent() {
        return "Student";
    }

    /**
     * Возвращает слово "Name".
     *
     * @return слово "Name"
     */
    public String wordName() {
        return "Name";
    }

    /**
     * Возвращает слово "Age".
     *
     * @return слово "Age"
     */
    public String wordAge() {
        return "Age";
    }
}
