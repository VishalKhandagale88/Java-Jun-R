package constructors;

public class Student {
     int rollNumber;
     String name;
     double marks;

    public  Student(int rollNumber,String name){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public Student(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
