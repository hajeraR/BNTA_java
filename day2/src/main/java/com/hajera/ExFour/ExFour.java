package com.hajera.ExFour;

import java.io.*;

import java.time.LocalDate;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ExFour {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        Person personThree = new Person("ed davey", "eddavey@example.com", LocalDate.of(1965, 12, 25));
        Person personFour = new Person("ed davey",  "eddavey@example.com", LocalDate.of(1965, 12, 25));
        Person personFive = new Person("ed davey",  "eddavey@example.com", LocalDate.of(1965, 12, 25));

        Questions questionOne = new Questions("Where is gamora?");
        Questions questionTwo = new Questions("Who is gamora?");
        Questions questionThree = new Questions("Why is gamora?");

        Questions[] questions = {questionOne, questionTwo, questionThree};


        Questionnaire testOne = new Questionnaire("01234", LocalDate.now());
        Questionnaire testTwo = new Questionnaire("01234", LocalDate.now());
        Questionnaire testThree = new Questionnaire("01234", LocalDate.now());

        ArrayList<String> input = new ArrayList<String>();
        input.add(personThree.toString());
        input.add(testOne.toString());

        for (Questions question: questions){
            input.add(question.toString());

        }

//        ArrayList<String> input2 = new ArrayList<String>();
//        input2.add(personFour.toString());
//        input2.add(testTwo.toString());
//
//        for (Questions question: questions){
//            input2.add(question.toString());
//
//        }




        //write to a file using OutputStream
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("questionnaire4.txt"));
        //save object
        output.writeObject(input);







    }
}
