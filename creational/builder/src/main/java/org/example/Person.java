package org.example;

import lombok.Data;

@Data
public class Person {
    private String firstName;
    private String lastName;
    private String job;

    private String streetAddress;
    private String postcode;
    private String city;

    private String companyName;
    private String annualIncome;
}
