package com.hajera.ExThree.Email;



public class EmailValidator {


    public static void IsEmailValid ( String email) {
        System.out.println (email.matches("(.*)@(.*)"));
    }

}
