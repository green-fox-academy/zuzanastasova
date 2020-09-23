package Flyable;

public class Helicopter extends Vehicle implements Flyable {
    @Override
    public void land() {

    }

    @Override
    public void fly() {
        System.out.println("I'm flying.");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setWeight() {
        this.weight = 3;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }
}
