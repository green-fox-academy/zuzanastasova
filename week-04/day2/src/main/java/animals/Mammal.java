package main.java.animals;

public class Mammal extends Animal {

    int legs;
    String move;

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String breed() {
        String breedMethod = "pushing miniature versions out";
        return breedMethod;
    }
}
