package com.jpl;

public enum GradeYear {

    FRESHMEN("Freshmen"), SOPHOMORE("Sophomore"), JUNIOR("Junior"), SENIOR("Senior");

    private String value;

    private GradeYear(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
