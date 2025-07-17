package methodsconcept;

public class MethodsDemo {
    public static void main(String[] args) {
        greet();
        add(2,3);
    }

    public static void greet(){
        System.out.println("Hello ");

    }

    public static int add(int a, int b){
        return a+b;
    }
}
