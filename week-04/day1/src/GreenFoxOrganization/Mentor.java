package GreenFoxOrganization;

public class Mentor extends Person {

    public enum Level {
        senior,
        intermediate,
        junior
    }

    private Level level;

    public Mentor () {
        super();
        level = Level.intermediate;
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        switch (level) {
            case "junior":
                this.level = Level.junior;
                break;
            case "intermediate":
                this.level = Level.intermediate;
                break;
            case "senior":
                this.level = Level.senior;
                break;
            default:
                System.out.println("That is not a level.");
        }
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + ", " + gender + ", mentor level: " + level + ".");
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }
}
