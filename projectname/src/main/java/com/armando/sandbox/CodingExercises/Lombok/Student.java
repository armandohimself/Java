package com.armando.sandbox.CodingExercises.Lombok;

// Lombok is a Java library that eliminates boilerplate code by auto-generating common methods like getters, setters, constructors, toString(), equals(), & hashCode()

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    public String studentID;
    public String firstName;
    public String lastName;
    public String major;
    public Student(String studentID, String firstName, String lastName, String major) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }
    

}