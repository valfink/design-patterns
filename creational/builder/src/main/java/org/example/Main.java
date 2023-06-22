package org.example;

import org.example.selfreferencinggenerics.WorkingPersonBuilder;

public class Main {
    public static void main(String[] args) {
        WorkingPersonBuilder workingPersonBuilder = new WorkingPersonBuilder();
        workingPersonBuilder
                .withFirstName("Wolfgang Amadeus")
                .withLastName("Mozart")
                .withJob("Composer");
        System.out.println(workingPersonBuilder.build());
    }
}