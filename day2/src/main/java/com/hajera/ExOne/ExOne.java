package com.hajera.ExOne;

import java.time.LocalDate;;

public class ExOne {
    public static void main(String[] args) {
        //Person instances using Person constructor
        Person personOne = new Person("boris", "johnson", Gender.MALE, LocalDate.of(1964, 6, 19));
        Person personTwo = new Person("kier", "starmer", Gender.MALE, LocalDate.of(1962, 9, 2));

        System.out.println(personOne.getFirstName());
        System.out.println(personOne.getLastName());
        System.out.println(personOne.getGender());
        System.out.println(personOne.getDateOfBirth());

    }
}
