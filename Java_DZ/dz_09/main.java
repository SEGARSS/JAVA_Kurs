package Java_DZ.dz_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Java_DZ.dz_09.Domen.Person;
import Java_DZ.dz_09.Domen.Student;
import Java_DZ.dz_09.Domen.StudentGroup;
import Java_DZ.dz_09.Domen.StudentStream;

/**
 * Программа для работы с информацией о студентах и группах студентов.
 * Версия: 1.0
 * Автор: Рябков Сергей
 * Дата: 05.07.2023 года.
 * 
 * <p>Данный код предоставляет возможность создания группы студентов и потока студентов.
 * Можно добавлять студентов в группу, группы в поток, а затем осуществлять сортировку групп студентов.</p>
 *
 * <p>Классы:
 * - {@link Person}: Абстрактный класс, представляющий человека.
 * - {@link Student}: Представляет информацию о студенте.
 * - {@link StudentGroup}: Представляет группу студентов и методы для работы с ней.
 * - {@link StudentStream}: Представляет поток студентов и методы для работы с ним.</p>
 *  
 * <p>Основной класс: {@link main}</p>
 *
 * <p>Примечание: Классы Student, StudentGroup и StudentStream находятся в пакете Java_DZ.dz_09.Domen.
 * Основной класс main находится в пакете Java_DZ.dz_09.</p>
 */
public class main {
    public static void main(String[] args) {
        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 444);
        Student s5 = new Student("Даша", 23, 171);
        Student s6 = new Student("Лена", 23, 104);

        List<Student> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println(group4580);

        for (Student std : group4580) {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for (Student std : group4580.getGroup()) {
            System.out.println(std);
        }
    }
}

