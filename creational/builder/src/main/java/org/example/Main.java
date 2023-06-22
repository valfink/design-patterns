package org.example;

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