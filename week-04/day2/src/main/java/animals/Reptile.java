package main.java.animals;

public class Reptile extends Animal {

    String skin;
    int legs;

    public Reptile (String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    public String breed() {
        String breedMethod = "laying eggs";
        return breedMethod;
    }

}
