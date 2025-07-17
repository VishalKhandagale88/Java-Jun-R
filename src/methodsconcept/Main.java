package methodsconcept;

public class Main {


    public static void main(String[] args) {

        DemoClass1 demoClass1 = new DemoClass1();
        int mul = demoClass1.mul(2, 3);
        System.out.println("Multiplication : " + mul);

        int add = demoClass1.sum(2,5);
        System.out.println("Addition : "+add);

        DemoClass2 demoClass2 = new DemoClass2();
        String message = demoClass2.getMessage();
        System.out.println(message);


        demoClass2.voidMethod();

    }

}
