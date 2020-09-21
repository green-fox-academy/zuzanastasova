package Homework;

public class Mentor {
    String name;
    int age;
    String gender;
    String level;

    public Mentor(){
        name = "Jane Doe";
        age = 30;
        gender = "Female";
        level = "intermediate";
    }

    public Mentor (String name, int age, String gender, String level) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + ", " + gender + ", mentor level: " + level + ".");
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }
}
