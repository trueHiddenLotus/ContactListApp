package com.hidden.hiddenProject.student;

import java.util.UUID;

public class Student {

    private final UUID student;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Gender gender;

    public Student(UUID student, String firstName, String lastName, String email, Gender gender) {
        this.student = student;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public UUID getStudent() {
        return student;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public enum Gender{
        MALE, FEMALE
    }

}
