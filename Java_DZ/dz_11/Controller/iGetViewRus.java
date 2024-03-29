package Java_DZ.dz_11.Controller;

import java.util.List;

import Java_DZ.dz_11.Model.Student;

/**
 * Интерфейс iGetViewRus представляет пользовательский интерфейс на русском языке для отображения информации и взаимодействия с пользователем.
 */
public interface iGetViewRus {
    
    /**
     * Выводит список всех студентов.
     *
     * @param students список всех студентов
     */
    void printAllStudents(List<Student> students);

    /**
     * Запрашивает ввод от пользователя с указанным сообщением и возвращает введенное значение.
     *
     * @param msg сообщение для пользователя
     * @return введенное значение
     */
    String prompt(String msg);

    /**
     * Запрашивает идентификатор студента для удаления.
     *
     * @return идентификатор студента для удаления
     */
    Long getStudentIdToDelete();

    /**
     * Отображает информацию о студенте.
     *
     * @param msg     сообщение для отображения
     * @param student студент
     */
    void displayStudent(String msg, Student student);

    /**
     * Считывает данные о студенте.
     *
     * @return объект студента
     */
    Student readStudent();

    /**
     * Запрашивает идентификатор студента для обновления данных.
     *
     * @return идентификатор студента для обновления
     */
    Long getStudentIdToUpdate();

    /**
     * Возвращает сообщение-приглашение для ввода команды.
     *
     * @return сообщение-приглашение для ввода команды
     */
    String msgOnInvite();

    /**
     * Возвращает сообщение о пустом списке студентов.
     *
     * @return сообщение о пустом списке студентов
     */
    String msgEmptyStudentList();

    /**
     * Возвращает сообщение о выходе из программы.
     *
     * @return сообщение о выходе из программы
     */
    String msgOnExit();

    /**
     * Возвращает сообщение об удалении студента.
     *
     * @param id     идентификатор студента
     * @param result результат удаления (true - успешно удален, false - студент не найден)
     * @return сообщение об удалении студента
     */
    String msgOnDelete(long id, boolean result);

    /**
     * Возвращает сообщение о некорректной команде.
     *
     * @return сообщение о некорректной команде
     */
    String msgOnBadCommand();

    /**
     * Возвращает слово "Студент".
     *
     * @return слово "Студент"
     */
    String словоСтудент();

    /**
     * Возвращает слово "Имя".
     *
     * @return слово "Имя"
     */
    String словоИмя();

    /**
     * Возвращает слово "Возраст".
     *
     * @return слово "Возраст"
     */
    String словоВозраст();
}
