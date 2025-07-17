package oops.inheritancedemo;

public class Vegetables {
    private String name;
    private String color;
    private String price;
    private String lifeSpan;

    Vegetables(String name, String color , String price, String lifeSpan){
        this.name = name;
        this.color = color;
        this.price = price;
        this.lifeSpan = lifeSpan;
    }


    @Override
    public String toString() {
        return this.name+","+this.color+","+this.price+","+this.lifeSpan;
    }
}
