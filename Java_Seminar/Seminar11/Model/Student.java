<<<<<<< HEAD
package Model;
=======
package Java_Seminar.Seminar11.Model;
>>>>>>> 61358c10d04c212a76715c1de1717fc14fa6dd6e

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
        return "Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }

    @Override
    public int compareTo(Student o) {

        System.out.println(super.getName()+" - "+o.getName());
        if(super.getAge()==o.getAge())
        {
            if(id==o.id)return 0 ;
            if(id>o.id)return 1;
            else return -1;
            //return 0;
        }

        if(super.getAge()>o.getAge())
        return 1;
        else
        return -1;        
    }


    
    
    
}
<<<<<<< HEAD


=======
>>>>>>> 61358c10d04c212a76715c1de1717fc14fa6dd6e
