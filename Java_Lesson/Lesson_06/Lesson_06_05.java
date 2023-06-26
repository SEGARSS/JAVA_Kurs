package Lesson_06;

public class Lesson_06_05 {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("%d %s %s %d", id, firstName, lastName, salary);
    }

    @Override
    public boolean equals(Object o) {
        var t = (Lesson_06_05) o;
        return id == t.id && firstName == t.firstName;
    }
    @Override
    public int hashCode() {
        return id;
    }
}
