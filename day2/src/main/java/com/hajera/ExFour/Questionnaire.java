package com.hajera.ExFour;


import java.io.Serializable;
import java.time.LocalDate;

public class Questionnaire implements Serializable {
   private String id;
   private LocalDate createdAtDate;
//   private Person person;
//   private Questions[] question;
//    private int numberOfQuestions;


    public Questionnaire(String id, LocalDate createdAtDate) {
        this.id = id;
        this.createdAtDate = createdAtDate;
//        this.person = person;
//        this.question = new Questions[numberOfQuestions];

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getCreatedAtDate() {
        return createdAtDate;
    }

    public void setCreatedAtDate(LocalDate createdAtDate) {
        this.createdAtDate = createdAtDate;
    }


    @Override
    public String toString() {
        return "Questionnaire{" +
                "id=" + id +
                ", createdAtDate=" + createdAtDate +
                '}';
    }
}
