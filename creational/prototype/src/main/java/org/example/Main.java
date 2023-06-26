package org.example;

import org.example.copyconstructor.Address;
import org.example.copyconstructor.Person;

public class Main {
    public static void main(String[] args) {
        Person wolfgang = new Person("Wolfgang Amadeus Mozart", new Address("Wiener Str. 1", "12345", "Wien"));
        Person ludwig = new Person(wolfgang);
        ludwig.setName("Ludwig van Beethoven");
        System.out.println("Copy Constructor:");
        System.out.println(wolfgang);
        System.out.println(ludwig);
    }
}