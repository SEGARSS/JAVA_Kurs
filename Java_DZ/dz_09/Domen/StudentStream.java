package Java_DZ.dz_09.Domen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Класс, представляющий поток студентов.
 */
public class StudentStream implements Iterable<StudentGroup> {
    public List<StudentGroup> studentGroups;
    private int streamNumber;

    /**
     * Конструктор, создающий новый объект StudentStream с заданным номером потока и пустым списком групп студентов.
     * @param streamNumber номер потока
     */
    public StudentStream(int streamNumber) {
        this.streamNumber = streamNumber;
        studentGroups = new ArrayList<>();
    }

    /**
     * Возвращает список групп студентов.
     * @return список групп студентов
     */
    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    /**
     * Устанавливает список групп студентов.
     * @param studentGroups список групп студентов
     */
    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    /**
     * Возвращает номер потока.
     * @return номер потока
     */
    public int getStreamNumber() {
        return streamNumber;
    }

    /**
     * Устанавливает номер потока.
     * @param streamNumber номер потока
     */
    public void setStreamNumber(int streamNumber) {
        this.streamNumber = streamNumber;
    }

    /**
     * Возвращает итератор для итерации по группам студентов в потоке.
     * @return итератор для итерации по группам студентов в потоке
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }
}
