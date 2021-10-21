package com.hajera.ExThree.Email;


import java.util.regex.Pattern;

public class EmailValidator {


    public static void IsEmailValid ( String email) {

        System.out.println(email.matches("^(.+)@(.+)$"));

    }

}
