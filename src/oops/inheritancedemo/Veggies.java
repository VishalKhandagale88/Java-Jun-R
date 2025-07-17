package oops.inheritancedemo;

public class Veggies extends Vegetables{
    private String name;

    Veggies(String parentName,String color,String price,String lifeSpan, String name){
        super(parentName,color,price,lifeSpan);
        this.name = name;
    }

    @Override
    public String toString() {
        return "{"+super.toString()+","+this.name+"}";
    }
}
