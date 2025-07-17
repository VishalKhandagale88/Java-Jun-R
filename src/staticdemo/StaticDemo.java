package staticdemo;

public class StaticDemo {



    // static where we use
//            -> used with methods
//            -> used with variable

    static int number1 = 0;  //3

    int number2 = 0;

    public static int add(int a, int b) {
        return a + b;
    }

    public double div(double a, double b) {
        return a / b;
    }
    public void increment(){
        number1++;
        number2++;
        System.out.println("Number 1 value : "+number1);
        System.out.println("Number 2 value : "+number2);
    }


}
