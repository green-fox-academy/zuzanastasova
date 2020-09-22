package Clonable;

import Clonable.Person;
import Clonable.Student;

public class Main {

    public static void main(String[] args) {

        Student jane = new Student();
        jane.clone();

        Student john = new Student("John", 20, "male", "BME");
        Student johnTheClone = john.clone();

        System.out.println(jane.name + " " + jane.age + " " + jane.gender + " " + jane.previousOrganization);

        System.out.println(johnTheClone.name + " " + johnTheClone.age + " " + johnTheClone.gender + " " + johnTheClone.previousOrganization);
    }
}
