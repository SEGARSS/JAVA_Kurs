<<<<<<< HEAD
package Controller;

import java.util.List;

import Model.Student;
=======
package Java_Seminar.Seminar11.Controller;

import java.util.List;

import Java_Seminar.Seminar11.Model.Student;
>>>>>>> 61358c10d04c212a76715c1de1717fc14fa6dd6e

public interface iGetView {
    void printAllStudents(List<Student> students);

    // Метод выводит информацию о каждом студенте на консоль
    void printAllStudent(List<Student> students);

    // Метод для запроса ввода пользователя, чтобы получить команду или данные от него
    String prompt(String msg);

    // Метод для получения id студента, которого нужно удалить.
    Long getStudentIdToDelete();

    // Метод отображает информацию о каждом студенте
    void displayStudents(List<Student> students);

    // Метод для чтения данных о студенте.
    Student readStudent();

    // Метод для получения id студента, которого пользователь хочет обновить.
    Long getStudentIdToUpdate();
    
}

// import java.util.List;
// import Model.Student;

// /**
//  * Интерфейс для создания блока view в модели MVC
//  */
// public interface iGetView {
//     // Метод выводит информацию о каждом студенте на консоль
//     void printAllStudent(List<Student> students);

//     // Метод для запроса ввода пользователя, чтобы получить команду или данные от него
//     String prompt();

//     // Метод для получения id студента, которого нужно удалить.
//     Long getStudentIdToDelete();

//     // Метод отображает информацию о каждом студенте
//     void displayStudents(List<Student> students);

//     // Метод для чтения данных о студенте.
//     Student readStudent();

//     // Метод для получения id студента, которого пользователь хочет обновить.
//     Long getStudentIdToUpdate();
<<<<<<< HEAD
// }
=======
// }
>>>>>>> 61358c10d04c212a76715c1de1717fc14fa6dd6e
