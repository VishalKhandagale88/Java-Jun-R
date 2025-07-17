package staticdemo;

public class RiyaClass {


    public static void main(String[] args) {
        int result = StaticDemo.add(10,20);
        System.out.println(result);
        int add = StaticDemo.add(20, 30);
        System.out.println(add);

        StaticDemo staticDemo = new StaticDemo();
        double division =  staticDemo.div(2,3);
        System.out.println(division);

        //Math
        double randomVariable = Math.random();
        System.out.println(randomVariable);

        staticDemo.increment(); //1
        staticDemo.increment(); // 2
        staticDemo.increment(); //3

        System.out.println("******************************");

        StaticDemo staticDemo1 = new StaticDemo();
        staticDemo1.increment(); //number1 = 1 ,number2 = 1






    }
}
