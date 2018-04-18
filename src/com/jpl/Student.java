package com.jpl;

import org.apache.commons.text.WordUtils;

public class Student {

    private String firstName;
    private String lastName;
    private String studentId;
    private GradeYear gradeYear;
    private String courses;
    private int balance;

    private static int id_counter = 1000;
    private static final int COURSE_COST = 500;  // Dollars

    private Student() { }

    public Student(String firstName, String lastName, GradeYear gradeYear, String courses) {
        this.firstName = WordUtils.capitalize(firstName);
        this.lastName = WordUtils.capitalize(lastName);
        this.gradeYear = gradeYear;
        this.courses = courses;
        this.studentId = setStudentId();
    }

    private String setStudentId() {
        // Grade year + ID
        String tempStudentId = gradeYear.getValue() + String.valueOf(id_counter);
        id_counter++;     // Increment the ID so every Student has a different one

        return tempStudentId;
    }

    @Override
    public String toString() {
        return "\nFirst Name: " + firstName + "\nLast Name: " + lastName +
                "\nStudent ID: " + studentId +
                "\nGrade Year: " + gradeYear.getValue() +
                "\nCourses: " + courses;
    }

}
