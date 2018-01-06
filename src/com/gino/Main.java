package com.gino;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner( System.in );
        DataRetriever dataRetriever = new DataRetriever();
        Person person = dataRetriever.getPerson(scanner);
        dataRetriever.printPerson(person);
    }
}
