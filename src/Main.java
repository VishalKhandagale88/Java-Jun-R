import constructors.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student riya = new Student(1,"Riya");
        Student vishal = new Student(2,"Vishal");
        Student x = new Student("x");
        System.out.println(riya);
        System.out.println(vishal);
        System.out.println(x);

    }
}