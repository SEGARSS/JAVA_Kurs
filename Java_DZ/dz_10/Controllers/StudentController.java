package Java_DZ.dz_10.Controllers;

import Java_DZ.dz_10.Domen.Student;
import Java_DZ.dz_10.Services.StudentService;

/**
 * Класс-контроллер для управления студентами.
 */
public class StudentController implements iPersonController<Student> {
    private final StudentService dataService = new StudentService();
    
    /**
     * Создает нового студента с указанными именем и возрастом.
     * @param firstName имя студента
     * @param age возраст студента
     */
    @Override
    public void create(String firstName, int age) {
        dataService.create(firstName, age);
        dataService.sortByFIOStdLst();
    }
}
