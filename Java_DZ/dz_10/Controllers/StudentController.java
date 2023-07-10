package Java_DZ.dz_10.Controllers;

import Java_DZ.dz_10.Domen.Student;
import Java_DZ.dz_10.Services.StudentService;

public class StudentController implements iPersonController<Student> {
    private final StudentService dataService = new StudentService();
    
    @Override
    public void create(String firstName, int age) {
        dataService.create(firstName, age);
        dataService.sortByFIOStdLst();
    }
}
