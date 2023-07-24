package Java_DZ.dz_11.Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Java_DZ.dz_11.Controller.iGetModel;

/**
 * Реализация интерфейса iGetModel для чтения и записи данных о студентах в файл.
 */
public class ModelFile implements iGetModel {
    private String fName;
    private List<Student> students = new ArrayList<>();

    /**
     * Конструктор объекта ModelFile с указанием имени файла.
     *
     * @param fName имя файла для чтения/записи данных о студентах
     */
    public ModelFile(String fName) {
        this.fName = fName;

        try (FileWriter fw = new FileWriter(fName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Получает список всех студентов из файла.
     *
     * @return список студентов
     */
    @Override
    public List<Student> getAll() {
        if (students.size() == 0) {
            try {
                FileReader fr = new FileReader(fName);
                BufferedReader reader = new BufferedReader(fr);
                String line = reader.readLine();
                while (line != null) {
                    String[] details = line.split(" ");
                    Student stud = new Student(details[0], Integer.parseInt(details[1]), Integer.parseInt(details[2]));
                    students.add(stud);
                    line = reader.readLine();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return students;

    }

    /**
     * Сохраняет список студентов в файл.
     *
     * @param students список студентов для сохранения
     */
    public void saveAllToFile(List<Student> students) {
        try (FileWriter fw = new FileWriter(fName, true)) {
            for (Student stud : students) {
                fw.write(stud.getName() + stud.getAge() + " " + stud.getId() + " ");
                fw.append("\n");
            }
            fw.flush();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Удаляет студента с указанным ID из списка студентов.
     *
     * @param id ID студента для удаления
     * @return true, если студент успешно удален, false в противном случае
     */
    @Override
    public boolean deleteStudent(long id) {
        boolean res = false;

        for (Student stud : students) {

            if (stud.getId() == id) {
                students.remove(students.indexOf(stud));
                res = true;
                break;
            }
        }
        return res;
    }
}
