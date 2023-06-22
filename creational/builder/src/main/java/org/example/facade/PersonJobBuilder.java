package org.example.facade;

import org.example.Person;

public class PersonJobBuilder extends PersonBuilder {
    // constructor takes reference to Person, so we are working on the same object in the different builders!
    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder atCompany(String company) {
        person.setCompanyName(company);
        return this;
    }

    public PersonJobBuilder as(String job) {
        person.setJob(job);
        return this;
    }

    public PersonJobBuilder earningAnnually(String annualIncome) {
        person.setAnnualIncome(annualIncome);
        return this;
    }
}
