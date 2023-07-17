package Java_DZ.dz_11.View;

import java.util.List;
import java.util.Scanner;

import Java_DZ.dz_11.Controller.iGetView;
import Java_DZ.dz_11.Model.Student;

/**
 * Класс ViewRus, представляющий пользовательский интерфейс на русском языке.
 */
public class ViewRus implements iGetView {

    /**
     * Выводит список всех доступных команд на русском языке.
     */
    public void printCommandList() {
        System.out.println("Список команд:");
        System.out.println("READ - Прочитать информацию о студенте");
        System.out.println("CREATE - Создать нового студента");
        System.out.println("UPDATE - Изменить информацию о студенте");
        System.out.println("LIST - Вывести список всех студентов");
        System.out.println("DELETE - Удалить студента");
        System.out.println("EXIT - Завершить программу");
    }

    /**
     * Выводит список всех студентов.
     *
     * @param students список студентов
     */
    public void printAllStudents(List<Student> students) {
        System.out.println("=======Список студентов=======");
        for (Student student : students) {
            System.out.println("Студент: [Имя = " + student.getName() + ", Возраст = " + student.getAge() + ", ID = " + student.getId() + "]");
        }
        System.out.println("==============================");
    }

    /**
     * Просит пользователя ввести команду на русском языке.
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
        long id = Long.parseLong(prompt("Введите ID студента для удаления: "));
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
        long id = Long.parseLong(prompt("Введите ID студента для обновления: "));
        return id;
    }

    /**
     * Возвращает сообщение приглашение для ввода команды.
     *
     * @return сообщение приглашение
     */
    public String msgOnInvite() {
        return "Введите команду: ";
    }

    /**
     * Возвращает сообщение о пустом списке студентов.
     *
     * @return сообщение о пустом списке студентов
     */
    public String msgEmptyStudentList() {
        return "Список студентов пуст!";
    }

    /**
     * Возвращает сообщение о выходе из программы.
     *
     * @return сообщение о выходе
     */
    public String msgOnExit() {
        return "Выход из приложения...";
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
            return "Студент с ID " + id + " успешно удален!";
        } else {
            return "Студент с ID " + id + " не найден в базе данных!";
        }
    }

    /**
     * Возвращает сообщение об ошибочной команде.
     *
     * @return сообщение об ошибочной команде
     */
    public String msgOnBadCommand() {
        return "Неверная команда!";
    }

    /**
     * Возвращает слово "Студент".
     *
     * @return слово "Студент"
     */
    public String wordStudent() {
        return "Студент";
    }

    /**
     * Возвращает слово "Имя".
     *
     * @return слово "Имя"
     */
    public String wordName() {
        return "Имя";
    }

    /**
     * Возвращает слово "Возраст".
     *
     * @return слово "Возраст"
     */
    public String wordAge() {
        return "Возраст";
    }
}
