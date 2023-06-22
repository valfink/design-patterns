package org.example;

import org.example.facade.PersonBuilder;
import org.example.selfreferencinggenerics.WorkingPersonBuilder;

public class Main {
    public static void main(String[] args) {
        WorkingPersonBuilder workingPersonBuilder = new WorkingPersonBuilder();
        workingPersonBuilder
                .withFirstName("Wolfgang Amadeus")
                .withLastName("Mozart")
                .withJob("Composer");
        System.out.println(workingPersonBuilder.build());

        PersonBuilder facadePersonBuilder = new PersonBuilder();
        facadePersonBuilder
                .lives()
                .atStreetAddress("Hauptstr. 1")
                .withPostcode("12345")
                .inCity("Wien")
                .works()
                .as("Composer")
                .atCompany("self employed")
                .earningAnnually("not enough");
        System.out.println(facadePersonBuilder.build());
    }
}