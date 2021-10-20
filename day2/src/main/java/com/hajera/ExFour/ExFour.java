package com.hajera.ExFour;

import java.time.LocalDate;

public class ExFour {
    public static void main(String[] args) {

        Person personThree = new Person("ed", "davey", "eddavey@example.com", LocalDate.of(1965, 12, 25));
        Questions questionOne = new Questions("What is my question?");
        Questionnaire fileOne = new Questionnaire(01234, LocalDate.now(), personThree, questionOne);

        System.out.println(fileOne.question.getQuestion());
    }
}
