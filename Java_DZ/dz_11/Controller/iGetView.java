package Java_DZ.dz_11.Controller;

import java.util.List;
import java.util.Scanner;

import Java_DZ.dz_11.Model.Student;
import Java_DZ.dz_11.View.ViewEng;
import Java_DZ.dz_11.View.ViewRus;

/**
 * Интерфейс iGetView представляет пользовательский интерфейс для отображения информации и взаимодействия с пользователем.
 */
public interface iGetView {

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
    String wordStudent();

    /**
     * Возвращает слово "Имя".
     *
     * @return слово "Имя"
     */
    String wordName();

    /**
     * Возвращает слово "Возраст".
     *
     * @return слово "Возраст"
     */
    String wordAge();

    /**
     * Класс для выбора пользовательского интерфейса на основе выбранного языка.
     */
    class LangSelector {      
    
        /**
         * Выбирает пользовательский интерфейс на основе выбранного языка.
         *
         * @return экземпляр интерфейса iGetView
         */
        public static iGetView select() {
            Scanner iScan = new Scanner(System.in);
            System.out.println("Choose the language / Выберите язык (1 - English, 2 - Русский): ");
            int choice = Integer.parseInt(iScan.nextLine());
    
            if (choice == 1) {
                return new ViewEng();
            } else {
                return new ViewRus();
            }
        }
    
    }

    void printCommandList();
}


