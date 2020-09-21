package GreenFoxOrganization;

public class Student extends Person {

    private String previousOrganization;
    private int skippedDays;

    public Student(){
        super();
        previousOrganization = "The School of Life";
    }

    public Student (String name, int age, String gender, String previousOrganization){
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public void skipDays (int numberOfDays) {
        skippedDays += numberOfDays;
    }

    public void getGoal(){
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void introduce (){
        System.out.println("Hi, I'm " + name + ", " + age + ", " + gender + ", from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }
}
