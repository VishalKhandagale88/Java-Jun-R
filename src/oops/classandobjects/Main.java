package oops.classandobjects;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", "Red", true); // creating an new object

        String name = apple.getName();
        System.out.println(name+" <<<< name");

        apple.setName("Riya");



        Fruit banana = new Fruit("Banana", "Yellow", false);
        banana.setColor("Green");

        Fruit anonymous = new Fruit();

        anonymous.setSeedLess(true);
        System.out.println(apple);
        System.out.println(banana);
        System.out.println(anonymous);


    }
}
