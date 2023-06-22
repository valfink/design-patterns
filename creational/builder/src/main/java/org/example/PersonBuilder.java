package org.example;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {
    // can only be used with a Type that extends PersonBuilder!

    protected Person person = new Person();

    public SELF withFirstName(String firstName) {
        person.setFirstName(firstName);
        return self();
    }

    public SELF withLastName(String lastName) {
        person.setLastName(lastName);
        return self();
    }

    protected SELF self() {
        // typecasting seems to be the only way here to stay generic
        // BUT the cast can't fail as SELF is always an extension of PersonBuilder!
        return (SELF) this;
    }

    public Person build() {
        return person;
    }
}
