package exceptionsdemo;

public class ThrowsDemo {

    public static void main(String[] args) {

        int a = 1/0;

    }

    public int division(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Can not divide by zero");
        }
        return a / b;
    }

    public void charString(String s) throws Exception {
        for (int i = 0; i < 10; i++) {
            if (i > s.length()) {
                throw new Exception("Index is greater"); //ball
            }
            System.out.println(s.charAt(i));
        }
    }
}
