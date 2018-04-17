package com.jpl;

import java.util.Scanner;

public class Main {

    private static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        String firstName;
        String lastName;
        GradeYear gradeYear ;
        String courses;

        System.out.print("First name: ");
        firstName = reader.nextLine();

        System.out.print("Last name: ");
        lastName = reader.nextLine();

        System.out.print("1. Freshmen \n2. Sophomore \n3. Junior \n4. Senior " +
                "\nGrade type (choose a number): ");

        switch (reader.nextInt()) {
            case 1:
                gradeYear = GradeYear.FRESHMEN;
                break;

            case 2:
                gradeYear = GradeYear.SOPHOMORE;
                break;

            case 3:
                gradeYear = GradeYear.JUNIOR;
                break;

            case 4:
                gradeYear = GradeYear.SENIOR;
                break;

            default:
                    gradeYear = null;
        }

        reader.nextLine();      // CONSUME THE NEWLINE NOT CONSUMED BY reader.nextInt()

        System.out.print("Course: ");
        courses = reader.nextLine();

        reader.close();

        Student student1 = new Student(firstName, lastName, gradeYear, courses);

        System.out.println("\nStudent Information\n " + student1);
    }

}
