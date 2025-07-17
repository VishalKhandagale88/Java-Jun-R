package oops.classandobjects;

public class Fruit {
    private String name; // apple
    private String color; // red
    private boolean seedLess; // true

    //Constructors

    //Constructor with all Parameters/ All arguments constructor
    Fruit(String name, String color, boolean seedLess) {
        this.name = name;
        this.color = color;
        this.seedLess = seedLess;
    }

    // no arguments constructor
    Fruit() {
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getSeedLess() {
        return this.seedLess;
    }

    public void setSeedLess(boolean seedLess) {
        this.seedLess = seedLess;
    }

    public String toString() {
        return "{" + this.name + "," + this.color + "," + this.seedLess + "}";
    }
}
