package Java_DZ.dz_10.Controllers;

import Java_DZ.dz_10.Domen.Teacher;

/**
 * Класс-контроллер для управления учителями.
 */
public class TeacherController implements iPersonController<Teacher> {
    
    /**
     * Создает нового учителя с указанными именем, возрастом и степенью.
     * @param firstName имя учителя
     * @param age возраст учителя
     */
    @Override
    public void create(String firstName, int age) {

        // В данном случае необходимо указать степень учителя, поэтому используйте перегруженный метод create
        // или добавьте еще один параметр, указывающий степень учителя.
        // Например:
        // create(firstName, age, "PhD");
        
        System.out.println("Необходимо указать степень учителя.");
    }
   
}
