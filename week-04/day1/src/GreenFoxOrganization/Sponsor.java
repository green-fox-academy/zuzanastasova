package GreenFoxOrganization;

public class Sponsor extends Person {

    private String company;
    private int hiredStudents;

    public Sponsor() {
        super();
        company = "Google";
    }

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public void hire() {
        hiredStudents++;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + ", " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }
}
