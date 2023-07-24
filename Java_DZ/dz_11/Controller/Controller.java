package Java_DZ.dz_11.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Java_DZ.dz_11.Model.Student;

/**
 * Класс контроллера, отвечающий за обработку команд пользователя и взаимодействие с моделью и представлением.
 */
public class Controller {

    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList<>();

    /**
     * Конструктор контроллера.
     *
     * @param model модель данных
     * @param view  представление
     */
    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Проверяет наличие данных в списке студентов.
     *
     * @param list список студентов
     * @return true, если список не пустой; false, если список пустой
     */
    private boolean testData(List<Student> list) {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Обновление данных и вывод списка студентов.
     */
    public void update() {

        students = model.getAll();
        if (testData(students)) {
            view.printAllStudents(students);
        } else {
            System.out.println(view.msgEmptyStudentList());
        }
    }

    /**
     * Запуск работы контроллера.
     */
    public void run() {
        view.printCommandList(); // Вывод списка команд
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt(view.msgOnInvite()).toUpperCase(Locale.forLanguageTag("ru"));

            try {
                com = Command.valueOf(command);

            } catch (Exception e) {
                System.out.println(view.msgOnBadCommand());
                com = Command.NONE;
            }

            switch (com) {
                case EXIT:
                    System.out.println(view.msgOnExit());
                    getNewIteration = false;
                    break;
                case LIST:
                    view.printAllStudents(model.getAll());
                    break;
                case DELETE:
                    long id = view.getStudentIdToDelete();
                    boolean res = model.deleteStudent(id);
                    System.out.println(view.msgOnDelete(id, res));
                    break;
                case CREATE:
                case NONE:
                default:
                    break;
            }
        }
    }
}
