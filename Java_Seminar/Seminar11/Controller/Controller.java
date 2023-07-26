<<<<<<< HEAD
package Controller;
=======
package Java_Seminar.Seminar11.Controller;
>>>>>>> 61358c10d04c212a76715c1de1717fc14fa6dd6e

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import Model.ModelList;
import Model.Student;
import View.View;
=======
import Java_Seminar.Seminar11.Model.ModelList;
import Java_Seminar.Seminar11.Model.Student;
import Java_Seminar.Seminar11.View.View;
>>>>>>> 61358c10d04c212a76715c1de1717fc14fa6dd6e

public class Controller {

    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList<>();

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> students)
    {
        if(students.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void update()
    {
        //MVP
        students = model.getAllStudents();
        if(testData(students))
        {
           view.printAllStudents(students);
        }
        else
        {
            System.out.println("Список студентов пуст!");
        }

        //MVC
        //view.printAllStudents(model.getAllStudents());
    }

    public void run()
    {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду:");
            com = Command.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
            }

        }
    }

    
}
