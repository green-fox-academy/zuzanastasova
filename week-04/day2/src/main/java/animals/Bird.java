package main.java.animals;

public class Bird extends Animal {

    int wings;
    boolean feathers;

    public Bird(String name) {
        super(name);
        super.getName();
    }

    public String breed() {
        String breedMethod = "laying eggs";
        return breedMethod;
    }
}
