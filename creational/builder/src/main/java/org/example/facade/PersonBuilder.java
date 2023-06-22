package org.example.facade;

import org.example.Person;

public class PersonBuilder {
    protected Person person = new Person();

    public Person build() {
        return person;
    }
}
