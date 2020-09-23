package Flyable;

public class MAin {
    public static void main(String[] args) {
        Bird bird = new Bird("sparrow");
        Helicopter helicopter = new Helicopter();

        bird.land();
        helicopter.fly();
        helicopter.setWeight();
        System.out.println(helicopter.getWeight());

    }
}
