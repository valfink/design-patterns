package org.example;

import org.example.copyconstructor.Address;
import org.example.copyconstructor.Person;
import org.example.serialization.SerAddress;
import org.example.serialization.SerPerson;

public class Main {
    public static void main(String[] args) {
        Person wolfgang = new Person("Wolfgang Amadeus Mozart", new Address("Wiener Str. 1", "12345", "Wien"));
        Person ludwig = new Person(wolfgang);
        ludwig.setName("Ludwig van Beethoven");
        ludwig.getAddress().setStreetAddress("Wiener Str. 9");
        System.out.println("Copy Constructor:");
        System.out.println(wolfgang);
        System.out.println(ludwig);

        SerPerson wolfgangSer = new SerPerson("Wolfgang Amadeus Mozart", new SerAddress("Wiener Str .1", "12345", "Wien"));
        SerPerson ludwigSer = org.apache.commons.lang3.SerializationUtils.roundtrip(wolfgangSer);
        ludwigSer.setName("Ludwig van Beethoven");
        ludwigSer.getAddress().setStreetAddress("Wiener Str. 9");
        System.out.println("Serialization:");
        System.out.println(wolfgangSer);
        System.out.println(ludwigSer);
    }
}