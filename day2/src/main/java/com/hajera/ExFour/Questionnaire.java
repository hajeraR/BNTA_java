package com.hajera.ExFour;


import java.time.LocalDate;

public class Questionnaire {
   private int id;
   private LocalDate createdAtDate;
   Person person;
   Questions question;

    public Questionnaire(int id, LocalDate createdAtDate, Person person, Questions question) {
        this.id = id;
        this.createdAtDate = createdAtDate;
        this.person = person;
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getCreatedAtDate() {
        return createdAtDate;
    }

    public void setCreatedAtDate(LocalDate createdAtDate) {
        this.createdAtDate = createdAtDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Questions getQuestion() {
        return question;
    }

    public void setQuestion(Questions question) {
        this.question = question;
    }
}
