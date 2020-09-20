package Homework;

public class Student {

    String name;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays;

    public Student(){

    }

    public Student(String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public int skipDays(int numberOfDays) {
        return skippedDays + numberOfDays;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + ", " + gender + ", from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }
}
