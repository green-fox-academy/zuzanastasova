package Flyable;

import main.java.animals.Animal;

public class Bird extends Animal implements Flyable {

    int wings;
    boolean feathers;

    public Bird(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String breed() {
        String breedMethod = "laying eggs";
        return breedMethod;
    }

    @Override
    public void land() {
        System.out.println("I'm landing.");
    }

    @Override
    public void fly() {

    }

    @Override
    public void takeOff() {

    }
}
