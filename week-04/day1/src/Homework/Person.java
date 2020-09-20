package Homework;

public class Person {

    String name;
    int age;
    String gender;

    public Person(){

    }

    public Person (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + ", " + gender);
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }
}
