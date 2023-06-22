package org.example.selfreferencinggenerics;

import org.example.Person;

public class PersonBuilder<S extends PersonBuilder<S>> {
    // can only be used with a Type that extends PersonBuilder!

    protected Person person = new Person();

    public S withFirstName(String firstName) {
        person.setFirstName(firstName);
        return self();
    }

    public S withLastName(String lastName) {
        person.setLastName(lastName);
        return self();
    }

    protected S self() {
        // typecasting seems to be the only way here to stay generic
        // BUT the cast can't fail as S is always an extension of PersonBuilder!
        return (S) this;
    }

    public Person build() {
        return person;
    }
}
