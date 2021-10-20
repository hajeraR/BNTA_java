package com.hajera.ExOne;

import java.time.LocalDate;

public class Person {

    //properties of Person
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate dateOfBirth;

    //constructor using this. to assign input to a property
    public Person (String firstName, String lastName, Gender gender, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    //getter and setter for each property
    public String getFirstName(){
        return  firstName;
    }
    public void setFirstName(){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
