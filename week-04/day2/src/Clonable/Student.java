package Clonable;

public class Student extends Person {

    String name;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays;

    public Student(){
        name = "Jane Doe";
        age = 30;
        gender = "Female";
        previousOrganization = "The School of Life";
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + ", " + gender + ", from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    @Override
    public Student clone() {
        Student student = new Student (this.name, this.age, this.gender, this.previousOrganization);
        return student;
    }
}
