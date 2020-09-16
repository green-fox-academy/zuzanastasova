package animal;

public class Main {
    public static void main(String[] args) {

        Animal zebra = new Animal();
        zebra.play();
        zebra.play();
        zebra.drink();
        zebra.eat();
        zebra.eat();

        System.out.println(zebra.status());
    }
}
