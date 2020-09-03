package com.company;

public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        int hours = 6;
        int weeks = 17;
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        int days = 5;
        double codingHoursCourse = hours*weeks*days;
        System.out.println(codingHoursCourse);
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        double totalWorkHours = 52 * 17;
        System.out.println(totalWorkHours);
        int percent = 100;
        double percentageWorkCodingHours = codingHoursCourse/totalWorkHours*percent;
        System.out.println(percentageWorkCodingHours);

    }
}