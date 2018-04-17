package com.jpl;

public class Student {

    private String firstName;
    private String lastName;
    private int id;
    private GradeYear gradeYear;
    private String courses;
    private int balance;

    private static final int COURSE_COST = 500;  // Dollars

    private Student() { }

    public Student(String firstName, String lastName, GradeYear gradeYear, String courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeYear = gradeYear;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "\nFirst Name: " + firstName + "\nLast Name: " + lastName +
                "\nGrade Year: " + gradeYear.getValue() +
                "\nCourses: " + courses;
    }

}
