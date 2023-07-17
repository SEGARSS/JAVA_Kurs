package Java_DZ.dz_11.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Java_DZ.dz_11.Model.Student;

public class Controller {

    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList<>();

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> list) {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }

    }

    public void update() {

        students = model.getAll();
        if (testData(students)) {
            view.printAllSudents(students);
        } else {
            System.out.println(view.msgEmptyStudentList());
        }
    }

    public void run() {
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
                case ВЫХОД:
                case EXIT:
                    System.out.println(view.msgOnExit());
                    getNewIteration = false;
                    break;
                case СПИСОК:
                case LIST:
                    view.printAllSudents(model.getAll());
                    break;
                case УДАЛИТЬ:
                case DELETE:
                    long id = view.getStudentIdToDelete();
                    boolean res = model.deleteStudent(id);
                    System.out.println(view.msgOnDelete(id, res));
                    break;
                case ПРОЧИТАТЬ:
                case CREATE:
                case ИЗМЕНИТЬ:
                case NONE:
                default:
                    break;
            }
        }
    }
}
