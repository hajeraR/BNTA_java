package com.hajera.ExFour;

import java.io.Serializable;

public class Questions implements Serializable {


    private String question;

    public Questions (String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "question='" + question + '\'' +
                '}';
    }
}
