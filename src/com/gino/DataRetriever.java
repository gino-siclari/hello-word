package com.gino;

import java.util.Scanner;

public class DataRetriever {

    public void printPerson(Person person) {
        String hello = "Ciao";
        System.out.println(hello);
        System.out.println(person.name);
        System.out.println(person.surname);
    }

    public Person getPerson(Scanner scanner){
        Person person = new Person();
        String tellMeYourName = "Can you tell me your name?";
        String tellMeYourSurame = "Can you tell me your surname?";
        person.name = getData(tellMeYourName, scanner);
        person.surname = getData(tellMeYourSurame, scanner);
        return person;
    }

    private String getData(String message, Scanner scanner){
        System.out.println(message);
        return scanner.nextLine();
    }
}
