package Java_DZ.dz_11.Model;

public class Student extends Person implements Comparable<Student> {

    private int id;

    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student [age = " + super.getAge() + ", name = " + super.getName() + ", id = " + id + "]";
    }

    @Override
    public int compareTo(Student o) {
  
        if (super.getAge() == o.getAge()) {
            if (id == o.id) {
                return 0;
            } else {
                if (id > o.id) {
                    return 1;
                } else {
                    return -1;
                }
            }

        } else {
            if (super.getAge() > o.getAge()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
