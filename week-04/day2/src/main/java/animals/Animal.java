package main.java.animals;

public abstract class Animal {

    protected String name;
    protected int age;
    protected String gender;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String getName();

    public abstract String breed();

    public int getAge() {
        return age;
    }


    public String getGender() {
        return gender;
    }
}
