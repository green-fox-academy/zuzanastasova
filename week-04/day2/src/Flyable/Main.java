package Flyable;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("sparrow");
        Helicopter helicopter = new Helicopter();

        bird.land();
        helicopter.fly();
        helicopter.setWeight();
        System.out.println(helicopter.getWeight());

    }
}
